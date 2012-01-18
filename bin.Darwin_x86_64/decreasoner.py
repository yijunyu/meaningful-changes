#!/usr/bin/python
########################################################################
#
# Copyright (c) 2005 IBM Corporation and others.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Common Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/cpl-v10.html
#
# Contributors: 
# IBM - Initial implementation
#
# Requirements:
# python
# PLY (lex.py, yacc.py)
# one ore more SAT solver(s): relsat, walksat, minisat, ...
#
########################################################################

import os
import string
import sys
import time

VERSION='1.0'

SOURCECODE_AXIOM=0
SOURCECODE_TRANSFORMED_EFFECT_AXIOM=1
SOURCECODE_ORIGINAL_EFFECT_AXIOM=2
SOURCECODE_ORIGINAL_TRAJECTORY_AXIOM=3
SOURCECODE_EC_AXIOM=4
SOURCECODE_LABEL_BEGIN=5

EFFECT_AXIOM_PREDICATES=['Initiates','Terminates','Releases']

OPTION_BOOLEAN=['manualrelease','debug','timediff','modeldiff','tmpfilerm',
                'renaming','showpred','trajectory','weighted']
OPTION_STRING=['finalstatefile','encoding','solver']

########################################################################
#decreasoner.test()
########################################################################

def test():
#  run('examples/Shanahan1997/Yale.e')
  run('../../sit1.e')

########################################################################
# runexamples
########################################################################

def copyright(prefix):
  if prefix:
    t=open('COPYRIGHT').readlines()
    return string.join(map(lambda x:prefix+x,['\n']+t+['\n']),'')
  else:
    return open('COPYRIGHT').read()

def runexamples():
  runexamples1('examples/list','examples/log')

def runexamples1(infn,outfn):
  out=open(outfn,'w')
  out.write(copyright('; '))
  for line0 in open(infn).readlines():
    line=commentElim(line0[:-1],';')
    if not line:
      #out.write("SKIPPED "+line0)
      continue
    (infn,nummodels0)=string.split(line,'|')
    outfn=filenameToTextFilename(infn)
    nummodels=intParse(nummodels0,1)
    ecreasoner=decreasoner()
    name=filenameToName(infn)
    (encodeSeconds,satSeconds,totalSeconds,numprops,numclauses,
     models)=ecreasoner.run(infn,outfn)
    t=infn+' '+secFmt(totalSeconds)
    if len(models)==nummodels:
      t='OK '+t
    else:
      t='PROBLEM '+t+': '+str(len(models))+' models, expected '+str(nummodels)
    out.write(t+'\n')
    out.flush()
  out.close()

########################################################################
# run
########################################################################

def run(inputfilename):
  ecreasoner=decreasoner()
  if inputfilename!='\r':
	  ecreasoner.run(inputfilename,None)

########################################################################
# Rep
########################################################################

class Rep:
  def __init__(self,name,formulas,generatedFormulas,constants):
    self.name=name
    self.constants=constants
    self.formulas=formulas
    self.generatedFormulas=generatedFormulas

  def stats(self,ec):
    predicates=functions=fluents=events=others=0
    for const in self.constants:
      if ec.constantSubsort(const,'fluent'): fluents=fluents+1
      elif ec.constantSubsort(const,'event'): events=events+1
      elif ec.constantSubsort(const,'predicate'): predicates=predicates+1
      elif ec.constantSubsort(const,'function'): functions=functions+1
      else:
        others=others+1
    return [predicates,functions,fluents,events,
            len(self.formulas)+len(self.generatedFormulas)]

  def anyPredicateIn(self,predicates):
    for predicate in predicates:
      if self.predicateIn(predicate): return 1
    return 0

  def predicateIn(self,predicate):
    for const in self.constants:
      if const.name==predicate: return 1
    return 0

########################################################################
# decreasoner
########################################################################

class decreasoner:
  def __init__(self):
    dbg('Discrete Event Calculus Reasoner '+VERSION)
    self.options={
      'debug': 0,
      'encoding': '2',
      'finalstatefile': None,
      'manualrelease': 0,
      'modeldiff': 0,
      'timediff': 1,
      'tmpfilerm': 1,
      'renaming': 1,
      'showpred': 1,
      'solver': 'relsat',
      'trajectory': 0,
      'weighted': 0,
    }
    self.tim=Timing('decreasoner')
    self.tim.start()
    self.sortD={}
    self.constantD={}
    self.formulas=[]
    self.noninertial=[]
    self.manualrelease=[]
    self.ignore=[]
    self.toLoad=[]
    self.formulaWriteI=0
    self.reps=[]
    self.encoderInputFilename=tmpfile('encoder.input')
    self.encoderOutputFilename=tmpfile('encoder.output')
    self.encoderOutputFilename1=tmpfile('encoder.output1')
    self.encoderPropositionFilename=tmpfile('encoder.proposition')
    self.encoderLogFilename=tmpfile('encoder.log')
    self.encoderInputStream=open(self.encoderInputFilename,'w')
    self.solverClauseFilename=tmpfile('solver.clauses')
    self.solverInputFilename=tmpfile('solver.input')
    self.solverOutputFilename=tmpfile('solver.output')
    self.solverLogFilename=tmpfile('solver.log')
    self.propositions=[]
    self.prevConstant=None
    self.labelNext=SOURCECODE_LABEL_BEGIN
    self.labelD={}

  def run(self,inputfilename,outputfilename):
    tim=Timing('')
    tim.start()
    if outputfilename:
      dbgInit(outputfilename)
      dbg(copyright('# '))
    self.load(inputfilename,SOURCECODE_AXIOM)
    self.loadDone()
    if self.options['debug']: dictDbg(self.options,[])
    (encodeSeconds,satSeconds,numprops,numclauses,unsatisfied,
     models)=self.solve()
    self.modelsPrint(unsatisfied,models)
    if len(models)>0 and self.options.get('finalstatefile')!=None:
      (positive,negative)=models[0]
      s=self.finalstateString(positive,negative)
      open(self.options['finalstatefile'],'w').write(s+'\n')
    self.tim.stop()
    if self.options['tmpfilerm']:
      self.tmpfileRm()
    if unsatisfied>0: models=[]
    for rep in self.reps:
      t=rep.stats(self)
      dbg(rep.name+': '+
          str(t[0])+' predicates, '+
          str(t[1])+' functions, '+
          str(t[2])+' fluents, '+
          str(t[3])+' events, '+
          str(t[4])+' axioms')
    tim.stop()
    totalSeconds=tim.secondsGet()
    dbg('encoding '+secFmt(encodeSeconds))
    dbg('solution '+secFmt(satSeconds))
    dbg('total '+secFmt(totalSeconds))
    return (encodeSeconds,satSeconds,totalSeconds,numprops,numclauses,models)

  def tmpfileRm(self):
    os.system('rm -f '+
               self.encoderInputFilename+' '+
               self.encoderOutputFilename+' '+
               self.encoderOutputFilename1+' '+
               self.encoderPropositionFilename+' '+
               self.encoderLogFilename+' '+
               self.solverClauseFilename+' '+
               self.solverInputFilename+' '+
               self.solverOutputFilename+' '+
               self.solverLogFilename)

  def load(self,filename,sourcecode):
    if self.options['encoding']=='3' and filename=='foundations/EC.e':
      filename='foundations/DEC.e'
    if filename in ['foundations/DEC.e','foundations/ECCausal.e']:
      sourcecode=SOURCECODE_EC_AXIOM
    dbg('loading '+filename)
    name=filenameToName(filename)
    global LOADING
    LOADING=1
    instream=open(filename)
    lines=[]
    formulas=[]
    constants=[]
    parsedFormulas=[]
    generatedFormulas=[]
    while 1:
      s=instream.readline()
      if not s: break
      s=commentElim(s[:-1],';')
      if not s: pass
      elif self.loadOption(s): pass
      elif self.loadRange(s): pass
      elif self.loadSort(s): pass
      elif self.loadReifiedSort(s): pass
      elif self.loadXorMutex(s,formulas,generatedFormulas): pass
      elif self.loadNoninertial(s): pass
      elif self.loadManualRelease(s): pass
      elif self.loadIgnore(s): pass
      elif self.loadCompletion(s): pass
      elif self.loadLoad(s,sourcecode): pass
      elif self.loadConstant(s,constants): pass
      else:
        lines.append(s)
    self.toLoad.append((filename,name,lines,formulas,parsedFormulas,
                        generatedFormulas,constants,sourcecode))
    if filename=='foundations/DEC.e' and self.options['trajectory']:
      self.load('foundations/ECTraj.e',sourcecode)

  def parseFormulaLines(self,lines,filename):
    if len(lines)>0:
      s=string.join(lines,'\n')
      formulas1=parseMany(s)
      if formulas1==None or len(formulas1)==0:
        dbg('ERROR: unable to parse formulas in '+filename+': '+s)
      return formulas1
    else:
      return []

  def loadDone(self):
    global LOADING
    LOADING=0
    for (filename,name,lines,formulas,parsedFormulas,generatedFormulas,
         constants,sourcecode) in self.toLoad:
      formulas1=self.parseFormulaLines(lines,filename)
      self.reps.append(Rep(name,formulas1+parsedFormulas,
                           generatedFormulas,constants))
      self.loadFormulas(formulas1+formulas,sourcecode)
    self.functionsValidate()
    self.sortsValidate()
    self.releasesAdd()
    self.encoderInputStream.close()
    self.reps.sort(lambda x,y:cmp(x.name,y.name))

  def formulasForTime(self,formulas,t):
    r=[]
    for f in formulas:
      if f[-1]==t: r.append(f)
    return r

  def formulasToString(self,shorten,predicate,formulas,prefix):
    r=[]
    for f in formulas:
      if predicate==None or self.predicateMatch(f[0],predicate):
        if shorten and f[0]=='HoldsAt': f=f[1]
        s=pr(f)
        if s: r.append(prefix+s)
    r.sort()
    return string.join(r,'\n')

  def formulasDiff(self,formulasP,formulasN,prevFormulasP,prevFormulasN):
    trueToFalse=[]
    falseToTrue=[]
    for e in prevFormulasP:
      if notime(e) not in map(notime,formulasP): trueToFalse.append(e)
    for e in prevFormulasN:
      if notime(e) in map(notime,formulasP): falseToTrue.append(e)
    return (trueToFalse,falseToTrue)

  def holdsAtFormulas(self,x):
    r=[]
    for e in x:
      if self.options['debug']:
        if e[0] in ['HoldsAt','ReleasedAt']:
          r.append(e)
      else:
        if e[0]=='HoldsAt':
          r.append(e)
    return r

  def happensFormulas(self,x):
    r=[]
    for e in x:
      if e[0]=='Happens':
        r.append(e)
    return r

  def notHappensFormulas(self,x):
    r=[]
    for e in x:
      if e[0]!='Happens':
        r.append(e)
    return r

  def sortsToVarnames(self,sorts,alwaysUseNumbers):
    if not alwaysUseNumbers:
      cntD={}
      for sort in sorts:
        dictIncr(cntD,sort.name,1)
    varD={}
    r=[]
    for sort in sorts:
      if (not alwaysUseNumbers) and cntD[sort.name]==1:
        r.append(sort.name)
      else:
        x=varD.get(sort.name,1)
        r.append(sort.name+str(x))
        varD[sort.name]=x+1
    return r

  def releasesAdd(self):
    fluentsort=self.sortGet('fluent')
    if fluentsort==None:
      dbg('ERROR: undefined sort fluent')
      return
    for fluent in fluentsort.nonReifiedConstantsGet():
      varnames=self.sortsToVarnames(fluent.argSorts,0)
      if fluent.name in self.noninertial:
        f=makeforall(varnames+['time'],
           ['ReleasedAt',[fluent.name]+varnames,'time'])
        self.formulaWrite(f,SOURCECODE_AXIOM)
      elif ((fluent.name not in self.manualrelease) and
            (not self.options['manualrelease'])):
        f=makeforall(varnames,
           ['$Not',['ReleasedAt',[fluent.name]+varnames,'0']])
        self.formulaWrite(f,SOURCECODE_AXIOM)

  def loadFormulas(self,formulas,sourcecode):
    for f in formulas:
      if self.isIgnored(f): continue
      if self.loadFunctionValue(f): continue
      self.loadFormula(f,sourcecode)

  def isIgnored(self,f):
    if deepInAny(self.ignore,f):
      return 1
    return 0

  def generateIntegerConstants(self,sort,minint,maxint,line):
    for tInt in range(minint,maxint+1):
      t=str(tInt)
      constant=self.constantGet(t)
      if constant==None:
        constant=self.constantCreate(t,sort,[],None,line,0)
      else:
        constant.sortAdd(sort,line)

  def headParse(self,line,hd):
    if not headIs(line,hd): return (0,line)
    return (1,elimHead(line,hd))

  def headParse2(self,line,hd1,hd2):
    if headIs(line,hd1):
      return (1,hd1,elimHead(line,hd1))
    if headIs(line,hd2):
      return (1,hd2,elimHead(line,hd2))
    return (0,'',line)

  def loadOption(self,line):
    (retcode,s)=self.headParse(line,'option ')
    if not retcode: return 0
    t=string.split(s)
    if len(t)!=2:
      dbg('ERROR: option not followed by optionname optionvalue: <'+line+'>')
      return 1
    (optionname,optionvalue)=t
    if optionname in OPTION_BOOLEAN:
      if optionvalue=='on': optionvalue=1
      elif optionvalue=='off': optionvalue=0
      else:
        dbg('ERROR: boolean option must be followed by on or off: <'+line+'>')
        return 1
    elif optionname not in OPTION_STRING:
      dbg('ERROR: unknown option: <'+line+'>')
      return 1
    self.options[optionname]=optionvalue
    if optionname=='debug': DEBUG=optionvalue
    if self.options['debug']:
      dbg('setting option '+optionname+': '+str(optionvalue))
    return 1

  def loadRange(self,line):
    (retcode,s)=self.headParse(line,'range ')
    if not retcode: return 0
    t=string.split(s)
    if len(t)!=3:
      dbg('ERROR: range not followed by sort min max: <'+line+'>')
      return 1
    sort=self.sortGet(t[0])
    if sort==None:
      dbg('ERROR: undefined sort '+t[0]+': <'+line+'>')
      return 1
    minint=intParse(t[1],None)
    if minint==None:
      dbg('ERROR: unable to parse int <'+s+'> in <'+line+'>')
      return 1
    maxint=intParse(t[2],None)
    if maxint==None:
      dbg('ERROR: unable to parse int <'+s+'> in <'+line+'>')
      return 1
    self.encoderInputStream.write('range '+sort.name+' '+str(minint)+' '+
                                  str(maxint)+'\n')
    sort.minMaxIntUpdate(minint,maxint)
    self.generateIntegerConstants(sort,minint,maxint,line)
    return 1

  def loadSort(self,line):
    (retcode,s)=self.headParse(line,'sort ')
    if not retcode: return 0
    return self.loadSort1(line,s,0)

  def loadReifiedSort(self,line):
    (retcode,s)=self.headParse(line,'reified sort ')
    if not retcode: return 0
    return self.loadSort1(line,s,1)

  def loadSort1(self,line,s,reified):
    if reified: keyword='reified sort'
    else: keyword='sort'
    for e in string.split(string.replace(s,' ',''),','):
      t=string.split(e,':')
      if len(t)==1:
        self.sortCreate(t[0],reified,None,line)
        self.encoderInputStream.write(keyword+' '+t[0]+' na\n')
      elif len(t)==2:
        self.sortCreate(t[0],reified,t[1],line)
        self.encoderInputStream.write(keyword+' '+t[0]+' '+t[1]+'\n')
      else:
        dbg('ERROR: trouble parsing <'+e+'> in <'+line+'>')
    return 1

  # mutex = at most one; xor = exactly one
  def loadXorMutex(self,line,outputFormulas,generatedFormulas):
    (retcode,hd,s)=self.headParse2(line,'xor ','mutex ')
    if not retcode: return 0
    hd=string.strip(hd)
    names=commaListParse(s)
    constants=[]
    for name in names:
      if name in self.ignore: continue
      constant=self.constantGet(name)
      if ((constant==None) or
          not self.constantSubsortAny(
            constant,['event','fluent','predicate'])):
        dbg('ERROR: '+hd+': event/fluent/predicate '+name+' not found')
      else:
        constants.append(constant)
    if len(constants)==0: return 1
    self.loadMutex(constants,outputFormulas)
    if hd=='xor':
      self.loadXor(constants,outputFormulas)
      f=self.constructXor(constants,'$Xor')
      generatedFormulas.append(f)
    return 1

  def loadMutex(self,constants,outputFormulas):
    for (constant1,constant2) in crossProduct([constants,constants]):
      if constant1==constant2: continue
      varnames=[]
      varnames1=[]
      varnames2=[]
      for e in self.sortsToVarnames(constant1.argSorts,1):
        varnames1.append(e)
        if e not in varnames: varnames.append(e)
      for e in self.sortsToVarnames(constant2.argSorts,1):
        varnames2.append(e)
        if e not in varnames: varnames.append(e)
      t1=self.hha(constant1,varnames1,'time')
      t2=self.hha(constant2,varnames2,'time')
      if t1[0] in ['HoldsAt','Happens'] or t2[0] in ['HoldsAt','Happens']:
        varlist=['$List']+varnames+['time']
      else:
        varlist=['$List']+varnames
      outputFormulas.append(
        ['$ForAll',varlist,
         ['$Or',
          ['$Not',self.hha(constant1,varnames1,'time')],
          ['$Not',self.hha(constant2,varnames2,'time')]]])

  def loadXor(self,constants,outputFormulas):
    f=self.constructXor(constants,'$Or')
    outputFormulas.append(f)

  def constructXor(self,constants,predicate):
    varnames=[]
    fOR=[predicate]
    reified=0
    for constant in constants:
      varnames1=self.sortsToVarnames(constant.argSorts,0)
      for e in varnames1:
        if e not in varnames: varnames.append(e)
      t=self.hha(constant,varnames1,'time')
      if t[0] in ['HoldsAt','Happens']: reified=1
      fOR.append(t)
    if reified: varlist=['$List']+varnames+['time']
    else: varlist=['$List']+varnames
    return ['$ForAll',varlist,fOR]

  def hha(self,constant,args,tVar):
    if self.constantSubsort(constant,'fluent'):
      return ['HoldsAt',[constant.name]+args,tVar]
    elif self.constantSubsort(constant,'event'):
      return ['Happens',[constant.name]+args,tVar]
    elif self.constantSubsort(constant,'predicate'):
      return [constant.name]+args
    else:
      dbg('ERROR: not fluent/event/predicate: '+constant.name)
      return []

  def ignoredElim(self,x):
    r=[]
    for e in x:
      if e in self.ignore: continue
      r.append(e)
    return r

  def loadNoninertial(self,line):
    (retcode,s)=self.headParse(line,'noninertial ')
    if not retcode: return 0
    t=self.ignoredElim(commaListParse(s))
    self.encoderInputStream.write('noninertial '+string.join(t)+'\n')
    for name in t:
      constant=self.constantGet(name)
      if ((constant==None) or
          not self.constantSubsortAny(constant,['event','fluent'])):
        dbg('ERROR: noninertial: fluent '+name+' not found')
      else:
        self.noninertial.append(name)
    return 1

  def loadManualRelease(self,line):
    (retcode,s)=self.headParse(line,'manualrelease ')
    if not retcode: return 0
    t=self.ignoredElim(commaListParse(s))
    for name in t:
      constant=self.constantGet(name)
      if ((constant==None) or
          not self.constantSubsortAny(constant,['event','fluent'])):
        dbg('ERROR: manualrelease: fluent '+name+' not found')
      else:
        self.manualrelease.append(name)
    return 1

  def loadIgnore(self,line):
    (retcode,s)=self.headParse(line,'ignore ')
    if not retcode: return 0
    for name in commaListParse(s):
      self.ignore.append(name)
    return 1

  def loadCompletion(self,line):
    (retcode,s)=self.headParse(line,'completion ')
    if not retcode: return 0
    t=string.split(s)
    if len(t)==2:
      sourcecode=self.labelToSourcecode(t[0])
      pred=t[1]
    elif len(t)==1:
      sourcecode='*'
      pred=t[0]
    else:
      dbg('ERROR: completion: too many tokens: '+line)
      return
    self.encoderInputStream.write('completion '+sourcecode+' '+pred+'\n')
    constant=self.constantGet(pred)
    if constant==None or not self.constantSubsort(constant,'predicate'):
      dbg('ERROR: completion: predicate '+pred+' not found')
    return 1

  def loadLoad(self,line,sourcecode):
    (retcode,s)=self.headParse(line,'load ')
    if not retcode: return 0
    self.load(s,sourcecode)
    return 1

  def loadConstant(self,line,constants):
    (sortname,dummy,defn)=stringFind(line,' ')
    if not sortname: return 0
    if sortname[-1]=='!':
      sortname=sortname[:-1]
      redefineOK=1
    else:
      redefineOK=0
    if not isSort(sortname): return 0
    sort=self.sortGet(sortname)
    if sort==None:
      dbg('ERROR: undefined sort '+sortname+': <'+line+'>')
      return 1
    if sort.reified:
      return self.loadReified(line,sort,defn,redefineOK,constants)
    else:
      return self.loadNonreified(line,sort,defn,redefineOK,constants)

  def loadReified(self,line,sort,defn,redefineOK,constants):
    t=string.split(string.replace(defn,' ',''),':')
    if len(t)==1:
      t=t[0]
      resultSortName=None
    elif len(t)==2:
      resultSortName=t[1]
      t=t[0]
    else:
      dbg('ERROR: unexpected colon in <'+line+'>')
      return 1
    t=string.split(t,'(')
    if len(t)==2:
      name=t[0]
      t1=string.strip(string.replace(t[1],')',''))
      if len(t1)==0: argSortNames=[]
      else: argSortNames=string.split(t1,',')
    else:
      dbg('ERROR: loadReified: trouble parsing <'+line+'>')
      return 1
    if name in self.ignore:
      self.prevConstant=None
      if self.options['debug']:
        dbg('definition of '+name+' ignored')
      return 1
    argSorts=[]
    for argSortName in argSortNames:
      t=self.sortGet(argSortName)
      if t==None:
        dbg('ERROR: undefined sort '+argSortName+': <'+line+'>')
        return 1
      argSorts.append(t)
    if resultSortName:
      resultSort=self.sortGet(resultSortName)
      if resultSort==None:
        dbg('ERROR: undefined sort '+resultSortName+': <'+line+'>')
    else:
      resultSort=None
    if resultSort:
      self.encoderInputStream.write('reified constant '+
                                    sort.name+' '+name+' '+
                                    resultSort.name+' '+
                                    string.join(map(lambda x:x.name,argSorts))+
                                    '\n')
    else:
      self.encoderInputStream.write('reified constant '+
                                    sort.name+' '+name+' '+
                                    'boolean '+
                                    string.join(map(lambda x:x.name,argSorts))+
                                    '\n')
    const=self.constantCreate(name,sort,argSorts,resultSort,line,redefineOK)
    constants.append(const)
    return 1

  def loadNonreified(self,line,sort,defn,redefineOK,constants):
    for name in commaListParse(defn):
      self.encoderInputStream.write('constant '+sort.name+' '+name+'\n')
      constants.append(
        self.constantCreate(name,sort,None,None,line,redefineOK))
    return 1

  def constantCreate(self,name,sort,argSorts,resultSort,line,redefineOK):
    r=self.constantGet(name)
    existing=0
    if r:
      if not redefineOK:
        dbg('ERROR: ignored redefinition of constant '+name+' in <'+line+'>')
        return r
      existing=1
    else:
      r=Constant(name)
      self.constantD[name]=r
    r.sortAdd(sort,line)
    if not existing:
      if argSorts: r.argSortsSet(argSorts)
      if resultSort: r.resultSortSet(resultSort)
    self.prevConstant=r
    return r

  def constantGet(self,constantname):
    if self.constantD.has_key(constantname):
      return self.constantD[constantname]
    return None

  def loadFunctionValue(self,f):
    if (islist(f) and
        f[0]=='$EQ' and
        islist(f[1]) and
        not islist(f[2])):
      function=self.constantGet(f[1][0])
      if not function: return 0
      if not self.constantSubsort(function,'function'): return 0
      arguments=f[1][1:]
      if not allIsConst(arguments): return 0
      self.encoderInputStream.write('function value '+
                                    function.name+' '+f[2]+' '+
                                    string.join(arguments)+'\n')
      function.valueSet(arguments,f[2])
      return 1
    return 0

  def functionsValidate(self):
    for constantname in self.constantD.keys():
      function=self.constantD[constantname]
      if not self.constantSubsort(function,'function'): continue
      iter=CrossProductIterator(self.sortConstants(function.argSorts),
                                'validate functions')
      while iter.hasMoreElements():
        arguments=map(lambda x:x.name,iter.nextElement())
        value=function.valueGet(arguments)
        if value==None:
          dbg(function.name+'('+string.join(arguments,',')+') undefined')

  def sortsValidate(self):
    for sort in self.sortD.values():
      if sort.name=='integer': continue
      if sort.subsort(self.sortGet('integer')):
        if sort.minint==0 and sort.maxint==-1:
          dbg('ERROR: range not defined for '+sort.name)

  def loadFormula(self,f,sourcecode):
    self.sortValidate(f)
    if self.options['encoding']=='3' and sourcecode==SOURCECODE_EC_AXIOM:
      self.formulaWrite(f,sourcecode)      
    elif isTrajectoryAxiom(f):
      self.formulaWrite(f,SOURCECODE_ORIGINAL_TRAJECTORY_AXIOM)
    elif isEffectAxiom(f):
      if self.options['encoding']=='3':
        self.formulaWrite(f,SOURCECODE_ORIGINAL_EFFECT_AXIOM)
      else:
        f1=transform(f,self.effectAxiomTransformer)
        self.formulaWrite(f1,SOURCECODE_TRANSFORMED_EFFECT_AXIOM)
        self.formulaWrite(f,SOURCECODE_ORIGINAL_EFFECT_AXIOM)
    else:
      self.formulaWrite(f,sourcecode)

  def labelToSourcecode(self,label):
    if label=='*': return '*'
    return chr(ord('0')+self.labelToInt(label))

  def labelToInt(self,label):
    if self.labelD.has_key(label):
      return self.labelD[label]
    r=self.labelNext
    self.labelD[label]=r
    self.labelNext=self.labelNext+1
    return r

  def formulaWrite(self,f,sourcecode):
    if f[0]=='$Weight':
      if not self.options['weighted']:
        dbg('WARNING: skipping because not weighted: '+pr(f))
        return
      weight=f[1]
      fx=f[2]
    elif f[0]=='$Label':
      weight=-1
      fx=f[2]
      sourcecode=self.labelToSourcecode(f[1])
    else:
      weight=-1
      fx=f
    self.encoderInputStream.write('formula '+
      assertionToString([sourcecode,weight,fx])+'\n')
    self.formulaWriteI=self.formulaWriteI+1

  def subsort(self,ancname,desname):
    des=self.sortGet(desname)
    if des==None:
      dbg('ERROR: undefined sort '+desname)
      return 0
    anc=self.sortGet(ancname)
    if anc==None:
      dbg('ERROR: undefined sort '+ancname)
      return 0
    return des.subsort(anc)

  def anySubsort(self,ancname,desnames):
    for desname in desnames:
      if self.subsort(ancname,desname): return 1
    return 0

  def constantSubsort(self,constant,sortname):
    sort=self.sortGet(sortname)
    if not sort: return 0
    return constant.constantSubsort(sort)

  def constantSubsortAny(self,constant,sortnames):
    for sortname in sortnames:
      if self.constantSubsort(constant,sortname): return 1
    return 0

  def sortGet(self,sortname):
    if self.sortD.has_key(sortname): return self.sortD[sortname]
    return None

  def sortCreate(self,name,reified,parentname,line):
    r=self.sortGet(name)
    if r:
      dbg('ERROR: sort '+name+' redefined in <'+line+'>')
    else:
      r=Sort(name,reified)
      self.sortD[name]=r
    if parentname:
      parent=self.sortGet(parentname)
      if parent==None:
        dbg('ERROR: undefined parent sort '+parentname+' in <'+line+'>')
      else: 
        r.parentAdd(parent,line)
    return r

  def sortValidate(self,f):
    return self.sortProcess(f,1)

  def sortProcess(self,f,validate):
    if isVar(f):
      sort=varSort(f)
      if sort: return [sort]
      return []
    if typ([])==typ(f):
      if f[0] in ['$Weight','$Label']:
        return self.sortProcess(f[2],validate)
      elif f[0] in CONNECTIVES:
        for e in f[1:]:
          sorts=self.sortProcess(e,validate)
          if (validate and
              len(sorts)!=0 and
              not self.anySubsort('boolean',sorts)):
            dbg('ERROR: returns '+string.join(sorts,'/')+
                ' instead of boolean: '+pr(e)+' in '+pr(f))
        return ['boolean']
      elif isQuantification(f):
        sorts=self.sortProcess(f[2],validate)
        if validate and len(sorts)!=0 and not self.anySubsort('boolean',sorts):
          dbg('ERROR: returns '+string.join(sorts,'/')+
              ' instead of boolean: '+pr(f[2])+' in '+pr(f))
        return ['boolean']
      elif isVar(f[0]):
        dbg('ERROR: variable predicate in '+pr(f))
        return []
      else:
        constant=self.constantGet(f[0])
        if constant!=None:
          args=f[1:]
          argSorts=constant.argSorts
          if len(argSorts)!=len(args):
            if validate:
              dbg('ERROR: wrong number of arguments to '+f[0]+' in '+pr(f))
          else:
            i=0
            while i<len(args):
              sorts=self.sortProcess(args[i],validate)
              argsort=argSorts[i].name
              if (validate and len(sorts)!=0 and
                  not self.anySubsort(argsort,sorts)):
                dbg('ERROR: returns '+string.join(sorts,'/')+
                    ' instead of '+argsort+': '+pr(args[i])+
                    ' in '+pr(f))
              i=i+1
          if constant.resultSort==None:
            return []
          return [constant.resultSort.name]
        elif validate and f[0][0]!='$':
          dbg('ERROR: '+f[0]+' undeclared in '+pr(f))
    elif typ('')==typ(f) and isConst(f):
      constant=self.constantGet(f)
      if constant!=None:
        return map(lambda x:x.name,constant.sorts)
      else:
        dbg('ERROR: constant '+f+' not declared')
    return []

  def solve(self):
    (retcode,encodeSeconds,numprops,numclauses)=self.encode()
    if retcode:
      (retcode,satSeconds,unsatisfied,models)=self.solve1()
    else:
       unsatisfied=1
       satSeconds=0
       models=[]
    return (encodeSeconds,satSeconds,numprops,numclauses,unsatisfied,models)

  def encode(self):
    if not executableExists('./decreasoner'):
      dbg('ERROR: you must first run ./make.sh to compile decreasoner')
      return (0,0,0,0)
    cmd=('./decreasoner -i '+self.encoderInputFilename+
         ' -l '+self.encoderLogFilename+
         ' -o '+self.encoderOutputFilename+
         ' -p '+self.encoderPropositionFilename)
    if self.options['debug']: cmd=cmd+' -d'
    if self.options['encoding']: cmd=cmd+' -e '+self.options['encoding']
    if self.options['renaming']: cmd=cmd+' -r'
    if self.options['weighted']: cmd=cmd+' -w'
    (encodeSeconds,r)=self.system(cmd)
    s=open(self.encoderLogFilename).read()
    errors=grep('ERROR',s)
    if len(errors)>0:
      for error in errors:
        dbg(error)
    if self.options['debug']:
      dbg('encoder log:\n'+s)
    if r: return (0,encodeSeconds,0,0)
    self.clausesSort(self.encoderOutputFilename,
                     self.encoderOutputFilename1)
    self.propositionsParse()
    self.system('sort -g '+self.encoderOutputFilename1+' | uniq > '+
                self.solverClauseFilename)
    numprops=len(self.propositions)
    numclauses=linecount(self.solverClauseFilename)
    dbg(str(numprops)+' variables and '+str(numclauses)+' clauses')
    if self.options['debug']:
      dbg('creating '+self.solverInputFilename)
    stream=open(self.solverInputFilename,'w')
    if self.options['weighted']:
      stream.write('p wcnf '+str(len(self.propositions))+
                   ' '+str(numclauses)+'\n')
    else:
      stream.write('p cnf '+str(len(self.propositions))+
                   ' '+str(numclauses)+'\n')
    stream.write(open(self.solverClauseFilename).read())
    stream.close()
    if self.options['debug']:
      dbg('problem statement:\n'+self.problemToString(None))
    return (1,encodeSeconds,numprops,numclauses)

  def solve1(self):
    unsatisfied=0
    while unsatisfied<3:
      (satSeconds,s)=self.solveRun(unsatisfied)
      models=self.solveParse(s)
      if len(models)>0:
        return (1,satSeconds,unsatisfied,models)
      self.options['solver']='walksat'
      unsatisfied=unsatisfied+1
    return (0,0,0,[])

  def clausesSort(self,inputFilename,outputFilename):
    if self.options['debug']: dbg('sorting clauses')
    instream=open(inputFilename)
    outstream=open(outputFilename,'w')
    while 1:
      s=instream.readline()
      if not s: break
      (weight,positive,negative)=self.clauseReadline(s[:-1])
      positive.sort()
      negative.sort()
      outstream.write(self.clauseToLine(weight,positive,negative)+'\n')
    instream.close()
    outstream.close()

  def clauseToLine(self,weight,positive,negative):
    r=[]
    if self.options['weighted']:
      r.append(str(weight))
    positive=list(positive)
    positive.sort()
    negative=list(negative)
    negative.sort()
    for e in positive: r.append(str(e))
    for e in negative: r.append('-'+str(e))
    r.append('0')
    return string.join(r)

  def clauseReadline(self,s):
    positive=[]
    negative=[]
    t=map(int,string.split(s))
    if self.options['weighted']:
      weight=int(t[0])
      t=t[1:]
    else:
      weight=-1
    for e in t[:-1]:
      if e>0: positive.append(e)
      else: negative.append(-e)
    return (weight,positive,negative)

  def problemToString(self,propositions):
    r=[]
    stream=open(self.solverClauseFilename)
    i=0
    while 1:
      s=stream.readline()
      if not s: break
      (weight,positive,negative)=self.clauseReadline(s[:-1])
      if propositions!=None:
        if not anyIn(positive+negative,propositions):
          i=i+1
          continue
      r.append(self.clauseToString(i,positive,negative))
      i=i+1
    return string.join(r,'\n')

  def propositionsParse(self):
    propD={}
    if self.options['debug']: dbg('parsing propositions')
    instream=open(self.encoderPropositionFilename)
    while 1:
      s=instream.readline()
      if not s: break
      a=assertionParse(string.strip(s[7:]))
      try:
        dictIncr(propD,self.predsumm(a),1)
      except:
        dbg('ERROR: propositionsParse: s: '+str(s)+' a: '+str(a))
      self.propositions.append(a)
    if self.options['debug']:
      r=dictToList(propD)
      r.sort(lambda x,y:-cmp(x[1],y[1]))
      t=tbl([('predicate',30,'l'),('count',5,'r')],r)
      dbg('\n'+t)

  def predsumm(self,f):
    if type(f[1])==type([]): return f[0]+'+'+f[1][0]
    if type(f)==type(''): return f
    if type(f)==type([]):
      return f[0]
    return '???'

  def solveRun(self,unsatisfied):
    dbg(self.options['solver']+' solver')
    self.system('cp /dev/null '+self.solverOutputFilename)
    self.system('cp /dev/null '+self.solverLogFilename)
    if self.options['solver']=='relsat':
      if not executableExists('solvers/relsat'):
        dbg('ERROR: you must first install solvers/relsat')
        dbg('relsat is available from http://www.almaden.ibm.com/cs/people/bayardo/resources.html')
        return (0,'')
      cmd=('solvers/relsat -#10 '+self.solverInputFilename+
           ' > '+self.solverOutputFilename)
    elif self.options['solver']=='walksat':
      if not executableExists('solvers/walksat'):
        dbg('the optional solvers/walksat is not installed')
        dbg('walksat is available from http://www.cs.washington.edu/homes/kautz/walksat/')
        return (0,'')
      cmd='solvers/walksat -out '+self.solverOutputFilename
      if unsatisfied>0:
        cmd=cmd+' -target '+str(unsatisfied)
      cmd=cmd+' >'+self.solverLogFilename+' 2>&1 <'+self.solverInputFilename
    elif self.options['solver']=='minisat':
      if not executableExists('solvers/minisat_static'):
        dbg('the optional solvers/minisat_static is not installed')
        dbg('minisat is available from http://www.cs.chalmers.se/Cs/Research/FormalMethods/MiniSat/Main.html')
        return (0,'')
      cmd='solvers/minisat_static '+self.solverInputFilename
      cmd=cmd+' '+self.solverOutputFilename
      cmd=cmd+' >'+self.solverLogFilename+' 2>&1'
    elif self.options['solver']=='maxwalksat':
      cmd=('solvers/maxwalksat -targetcost 48232 -hard < '+
           self.solverInputFilename+' > '+
           self.solverOutputFilename)
    elif self.options['solver']=='wmaxsat':
      cmd=('solvers/wmaxsat '+self.solverInputFilename+
           ' > '+self.solverOutputFilename)
    else:
      dbg('ERROR: unknown solver: '+self.options['solver'])
      return (0,'')
    (satSeconds,r)=self.system(cmd)
    if self.options['solver']!='relsat' and self.options['debug']:
      s=open(self.solverLogFilename).read()
      if len(s)>25000: s='(big)'
      dbg('solver log:\n'+s)
    return (satSeconds,open(self.solverOutputFilename,'r').read())

  def modelsPrint(self,unsatisfied,models):
    if len(models)>0:
      dbg(str(len(models))+' model'+plural(len(models)))
    else:
      dbg('no models found')
    prev=None
    i=1
    for (positive,negative) in models:
      if len(negative)==0:
        negative=self.reconstituteNegative(positive)
      if unsatisfied==0:
        s=self.modelToString(positive,negative)
      else:
        s=self.nearMissToString(positive,negative)
      dbg('---')
      if unsatisfied==0:
        t='model '+str(i)
      else:
        t='near miss'
      if prev!=None and self.options['modeldiff']:
        dbg(t+' diff:'+diff(prev+'\n',s+'\n'))
      else:
        dbg(t+':\n'+s)
      prev=s
      i=i+1

  def solveParse(self,s):
    if self.options['solver'] in ['relsat','maxwalksat','wmaxsat']:
      return self.solveParseRelsat(s)
    elif self.options['solver']=='walksat':
      return self.solveParseWalksat(s)
    elif self.options['solver']=='minisat':
      return self.solveParseMinisat(s)
    else:
      dbg('ERROR: unknown solver: '+self.options['solver'])
      return []

  def solveParseRelsat(self,s):
    r=[]
    for s1 in string.split(s,'\n'):
      if headIs(s1,'c '): continue
      i=string.find(s1,'Solution ')
      if i==-1: continue
      i=string.find(s1,':',i)
      if i==-1: continue
      positive=[]
      for e in string.split(s1[i+1:]):
        positive.append(int(e))
      #if len(positive)>0:
      r.append((positive,[]))
    return r

  def solveParseWalksat(self,s):
    positive=[]
    negative=[]
    for e in string.split(s):
      i=int(e)
      if i>0: positive.append(i)
      else: negative.append(-i)
    if len(positive)>0 or len(negative)>0:
      return [(positive,negative)]
    return []

  def solveParseMinisat(self,s):
    positive=[]
    negative=[]
    for e in string.split(s):
      if e=='UNSAT': return []
      if e=='SAT': continue
      i=int(e)
      if i>0: positive.append(i)
      else: negative.append(-i)
    if len(positive)>0 or len(negative)>0:
      return [(positive,negative)]
    return []

  def effectAxiomTransformer(self,f):
    if typ([])!=typ(f): return None
    if f[0]=='Initiates':
      return ['$Implies',
              ['Happens',f[1],f[3]],
              ['$And',
               ['HoldsAt',f[2],['$Plus',f[3],'1']],
               ['$Not',['ReleasedAt',f[2],['$Plus',f[3],'1']]]]]
    if f[0]=='Terminates':
      return ['$Implies',
              ['Happens',f[1],f[3]],
              ['$And',
               ['$Not',['HoldsAt',f[2],['$Plus',f[3],'1']]],
               ['$Not',['ReleasedAt',f[2],['$Plus',f[3],'1']]]]]
    if f[0]=='Releases':
      return ['$Implies',
              ['Happens',f[1],f[3]],
              ['ReleasedAt',f[2],['$Plus',f[3],'1']]]
    return None

  def modelToString(self,positive,negative):
    allFormulasP=self.propositionsToFormulas(positive)
    allFormulasN=self.propositionsToFormulas(negative)
    r=[]
    prevFormulasP=None
    prevFormulasN=None
    doneP=[]
    doneN=[]
    for tInt in range(self.mintime(),self.maxtime()+1):
      t=str(tInt)
      r.append(t)
      if self.options['timediff']:
        formulasP=self.formulasForTime(allFormulasP,t)
        formulasH=self.happensFormulas(formulasP)
        formulasP=self.holdsAtFormulas(formulasP)
        formulasN=self.holdsAtFormulas(self.formulasForTime(allFormulasN,t))
        if prevFormulasP==None:
          if self.options['debug']:
            s=self.formulasToString(0,None,formulasN,'!')
            if s: r.append(s)
          s=self.formulasToString(1,None,formulasP,'')
          if s: r.append(s)
        else:
          (trueToFalse,falseToTrue)=self.formulasDiff(
            formulasP,formulasN,prevFormulasP,prevFormulasN)
          s=self.formulasToString(1,None,trueToFalse,'-')
          if s: r.append(s)
          s=self.formulasToString(1,None,falseToTrue,'+')
          if s: r.append(s)
        s=self.formulasToString(0,'Happens',formulasH,'')
        if s: r.append(s)
      else:
        formulasP=self.formulasForTime(allFormulasP,t)
        formulasH=self.happensFormulas(formulasP)
        formulasP=self.notHappensFormulas(formulasP)
        formulasN=self.formulasForTime(allFormulasN,t)
        s=self.formulasToString(0,None,formulasN,'!')
        if s: r.append(s)
        s=self.formulasToString(0,None,formulasP,'')
        if s: r.append(s)
        s=self.formulasToString(0,'Happens',formulasH,'')
        if s: r.append(s)
      doneP=doneP+formulasP+formulasH
      doneN=doneN+formulasN
      prevFormulasP=formulasP
      prevFormulasN=formulasN
    if self.options['showpred']:
      r.append('P')
      t=[]
      for f in allFormulasP:
        if f not in doneP:
          if '$' in f[0]: continue
          s=pr(f)
          if s: t.append(s)
      t.sort()
      for e in t: r.append(e)
      t=[]
      for f in allFormulasN:
        if f not in doneN:
          if '$' in f[0]: continue
          s=pr(f)
          if s: t.append('!'+s)
      t.sort()
      for e in t: r.append(e)
    return string.join(r,'\n')

  def finalstateString(self,positive,negative):
    if len(negative)==0:
      negative=self.reconstituteNegative(positive)
    r=[]
    t=str(self.maxtime())
    for predicate in ['HoldsAt','ReleasedAt']:
      r.append(self.finalstatePropositionsToString(predicate,positive,t,0))
      r.append(self.finalstatePropositionsToString(predicate,negative,t,1))
    return string.join(filter(None,r),'\n')

  def reconstituteNegative(self,positive):
    negative=[]
    for i in range(1,len(self.propositions)+1):
      if i not in positive: negative.append(i)
    return negative

  def nearMissToString(self,positive,negative):
    return (self.modelToString(positive,negative)+'\n'+
            self.modelToUnsatisfiedString(positive,negative))

  def modelToUnsatisfiedString(self,positiveS,negativeS):
    r=[]
    stream=open(self.solverClauseFilename)
    i=0
    while 1:
      s=stream.readline()
      if not s: break
      (weight,positiveC,negativeC)=self.clauseReadline(s[:-1])
      if not self.clauseEval(positiveC,negativeC,positiveS,negativeS):
        r.append(s[:-1]+': '+self.clauseToString(i,positiveC,negativeC))
      i=i+1
    return str(len(r))+' unsatisfied clauses:\n'+string.join(r,'\n')

  def clauseEval(self,positiveC,negativeC,positiveS,negativeS):
    for e in positiveC:
      if e in positiveS: return 1
    for e in negativeC:
      if e in negativeS: return 1
    return 0

  def propositionToFormula(self,proposition):
    return self.propositions[proposition-1]

  def propositionsToFormulas(self,propositions):
    r=[]
    for e in propositions:
      r.append(self.propositionToFormula(e))
    return r

  def finalstatePropositionsToString(self,predicate,propositions,t,isNegative):
    formulas=[]
    for e in propositions:
      f=self.propositionToFormula(e)
      if (t==None or f[-1]==t) and self.predicateMatch(f[0],predicate):
        formulas.append(f[:-1]+['0'])
    r=[]
    for f in formulas:
      if isNegative: r.append(pr(['$Not',f]))
      else: r.append(pr(f))
    r.sort()
    return string.join(filter(None,r),'\n')

  def predicateMatch(self,predicate,pattern):
    if typ([])==typ(pattern) and pattern[0]=='NOT':
      return predicate not in pattern[1:]
    return predicate==pattern

  def clauseToString(self,i,positive,negative):
    r=['$Or']
    for e in positive:
      r.append(self.propositionToFormula(e))
    for e in negative:
      r.append(['$Not',self.propositionToFormula(e)])
    t=pr(r)
    if self.options['debug']:
      return str(i)+'. '+t
    else:
      return t

  def sortConstants(self,sorts):
    r=[]
    for sort in sorts:
      constants=sort.constantsGet()
      if len(constants)==0:
        dbg('ERROR: no constants for '+str(sort))
      r.append(constants)
    return r

  def system(self,cmd):
    if self.options['debug']: dbg('$ '+cmd)
    tim=Timing(string.split(cmd)[0])
    tim.start()
    r=os.system(cmd)
    tim.stop()
    if self.options['debug']: dbg(str(tim))
    if r and not headIs(cmd,'solvers/minisat_static'):
      dbg('ERROR: failed: $ '+cmd)
    return (tim.secondsGet(),r)

  def mintime(self):
    return self.sortGet('time').minint

  def maxtime(self):
    return self.sortGet('time').maxint

  def __repr__(self):
    return '<decreasoner>'

########################################################################
# Sort
########################################################################

class Sort:
  def __init__(self,name,reified):
    self.name=name
    self.reified=reified
    self.parents=[]
    self.children=[]
    self.constants=[]
    self.rconstants=[]
    self.minint=0
    self.maxint=-1

  def subsort(self,sort):
    if self==sort: return 1
    for parent in self.parents:
      if parent.subsort(sort): return 1
    return 0

  def parentAdd(self,sort,line):
    if sort not in self.parents:
      self.parents.append(sort)
    else:
      dbg('ERROR: redefinition of '+sort.name+
               ' as parent of '+self.name+' in <'+line+'>')
    if self not in sort.children:
      sort.children.append(self)
    else:
      dbg('ERROR: redefinition of '+self.name+
               ' as child of '+sort.name+' in <'+line+'>')

  def constantAdd(self,constant,line):
    if constant not in self.constantsGet():
      self.constants.append(constant)
    else:
      dbg('ERROR: redefinition of '+constant.name+
               ' as constant of '+self.name+' in <'+line+'>')

  def nonReifiedConstantsGet(self):
    r=[]
    for child in self.children:
      for constant in child.nonReifiedConstantsGet():
        r.append(constant)
    for constant in self.constants:
      r.append(constant)
    return r

  def constantsGet(self):
    r=[]
    for child in self.children:
      for constant in child.constantsGet():
        r.append(constant)
    for constant in self.constantsGet1():
      r.append(constant)
    return r

  def constantsGet1(self):
    if self.reified:
      if LOADING:
        return self.constantsGet2()
      if not self.rconstants:
        self.rconstants=self.constantsGet2()
      return self.rconstants
    else:
      return self.constants

  def constantsGet2(self):
    r=[]
    for e1 in self.constants:
      if len(e1.argSorts)==0:
        r.append([e1.name])
      else:
        for e2 in crossProduct(map(lambda x:x.constantsGet(),e1.argSorts)):
          r.append([e1.name]+map(lambda x:nameget(x),e2))
    return r

  def minMaxIntUpdate(self,minint,maxint):
    if minint<self.minint: self.minint=minint
    if maxint>self.maxint: self.maxint=maxint

  def __repr__(self):
    return '<Sort '+self.name+'>'

########################################################################
# Constant
########################################################################

class Constant:
  def __init__(self,name):
    self.name=name
    self.sorts=[]
    self.argSorts=[]
    self.resultSort=None
    self.valueD=None

  def valueSet(self,arguments,value):
    if self.valueD==None: self.valueD={}
    self.valueD[str(arguments)]=value

  def valueGet(self,arguments):
    if self.valueD==None: return None
    key=str(arguments)
    if self.valueD.has_key(key):
      return self.valueD[key]
    return None

  def constantSubsort(self,sort0):
    for sort1 in self.sorts:
      if sort1.subsort(sort0): return 1
    return 0

  def sortAdd(self,sort,line):
    if sort not in self.sorts:
      self.sorts.append(sort)
      sort.constantAdd(self,line)

  def argSortsSet(self,argSorts):
    self.argSorts=argSorts

  def resultSortSet(self,resultSort):
    self.resultSort=resultSort

  def __repr__(self):
    return ('<Constant '+self.name+': '+
            string.join(map(lambda x:x.name,self.sorts),',')+'>')

###########################################################################
# logic
###########################################################################

QUANTIFIERS=['$ForAll','$Exists']
CONNECTIVES=['$Not','$Or','$And','$Implies','$Equiv']
COMPARATIVES=['$NE','$EQ','$LT','$LE','$GE','$GT']
FUNCTIONS=['$Neg','$Plus','$Minus','$Times','$Divide','$Raise','$Remainder']

def freevarNames(formula):
  return map(varName,freevars(formula))

def freevars(formula):
  return freevars1(formula,[])

def freevars1(formula,bound):
  if typ(formula)!=typ([]): return []
  if formula[0] in ['$Weight','$Label']: return freevars1(formula[2],bound)
  if isQuantification(formula):
    return freevars1(formula[2],bound+varListToVars(formula[1]))
  r=[]
  for e in formula:
    if isVar(e):
      name=varName(e)
      if name not in map(varName,bound):
        if name not in map(varName,r):
          r.append(e)
    else:
      for f in freevars1(e,bound):
        name=varName(f)
        if name not in map(varName,r):
          r.append(f)
  return r

def makeforall(varnames,x):
  if len(varnames)==0: return x
  return ['$ForAll',['$List']+varnames,x]

def typ(x):
  if type(x)==type(()): return type([])
  return type(x)

def isConst(x):
  return typ(x)==typ('') and len(x)>0 and x[0]!='$' and not isVar(x)

def allIsConst(x):
  for e in x:
    if not isConst(e): return 0
  return 1

def isVar(x):
  if typ(x)==typ(''):
    return (len(x)>0) and (x[0] in string.lowercase) and ('#' not in x)
  elif typ(x)==typ([]):
    return len(x)==3 and x[0]=='$SortedVar' and isVar(x[1]) and isSort(x[2])
  return 0

def varCreate(name,sort):
  if sort:
    return ['$SortedVar',name,sort]
  return name

def varName(x):
  if typ(x)==typ(''): return x
  elif typ(x)==typ([]) and len(x)==3 and x[0]=='$SortedVar': return x[1]
  else: return '?'

def varSort(x):
  if typ(x)==typ([]) and len(x)==3 and x[0]=='$SortedVar': return x[2]
  return ''

def varListToVars(x):
  if typ(x)==typ([]) and len(x)>0 and x[0]=='$List':
    return x[1:]
  return []

def varListToSortDict(x):
  r={}
  if typ(x)==typ([]) and len(x)>0 and x[0]=='$List':
    for t in x[1:]:
      if typ(t)==typ([]) and len(t)==3 and t[0]=='$SortedVar':
        r[t[1]]=t[2]
  return r

def isSort(x):
  if typ(x)!=typ(''): return 0
  if len(x)==0: return 0
  for c in x:
    if c not in string.lowercase: return 0
  return 1

def isQuantification(f):
  return typ(f)==typ([]) and len(f)==3 and f[0] in QUANTIFIERS

def predicates(f):
  r=[]
  predicates1(f,r)
  return r

def predicates1(f,r):
  if typ([])==typ(f):
    if f[0] in CONNECTIVES+COMPARATIVES+FUNCTIONS:
      for e in f[1:]: predicates1(e,r)
    elif isQuantification(f):
      predicates1(f[2],r)
    else:
      if f[0] not in r: r.append(f[0])
      for e in f[1:]: predicates1(e,r)

###########################################################################
# formula parsing; syntax is based on that of the Bliksem theorem prover
###########################################################################

tokens=(
  'NAME', 'NUMBER', 'PLUS', 'MINUS', 'TIMES', 'DIVIDE', 'RAISE', 'REMAINDER',
  'LT', 'LE', 'EQ', 'NE', 'GE', 'GT', 'NOT', 'OR', 'AND', 'IMPLIES', 'EQUIV',
  'LPAREN', 'RPAREN', 'LBRACKET', 'RBRACKET', 'LCURLY', 'RCURLY', 'COMMA',
  'PERIOD', 'COLON',
)

t_NAME=r'[a-zA-Z_][a-zA-Z0-9_]*'
t_NUMBER=r'[0-9]+(\.[0-9]+)?'
t_PLUS=r'\+'
t_MINUS=r'-'
t_TIMES=r'\*'
t_DIVIDE=r'/'
t_RAISE=r'\^'
t_REMAINDER=r'%'
t_LT=r'<'
t_LE=r'<='
t_EQ=r'='
t_NE=r'!='
t_GE=r'>='
t_GT=r'>'
t_NOT=r'!'
t_OR=r'\|'
t_AND=r'&'
t_IMPLIES=r'->'
t_EQUIV=r'<->'
t_LPAREN=r'\('
t_RPAREN=r'\)'
t_LBRACKET=r'\['
t_RBRACKET=r']'
t_LCURLY=r'{'
t_RCURLY=r'}'
t_COMMA=r','
t_PERIOD=r'\.'
t_COLON=r':'

t_ignore=" \t"

def t_newline(t):
  r'\n+'
  t.lineno += t.value.count("\n")

def t_error(t):
  dbg("ERROR: illegal character '"+t.value[0]+"'")
  t.skip(1)
    
# Build the lexer
import lex
lex.lex()

precedence=(
  ('left', 'LBRACKET', 'RBRACKET'),
  ('left', 'LCURLY', 'RCURLY'),
  ('left', 'IMPLIES', 'EQUIV'),
  ('left', 'OR'),
  ('left', 'AND'),
  ('left', 'EQ', 'NE'),
  ('nonassoc', 'LT', 'LE', 'GE', 'GT'),
  ('left', 'PLUS', 'MINUS'),
  ('left', 'TIMES', 'DIVIDE', 'RAISE', 'REMAINDER'),
  ('right', 'NOT'),
  ('nonassoc', 'LPAREN', 'RPAREN'),
)

def p_topformulas1(p):
  'topformulas : topformula'
  p[0]=[p[1]]

def p_topformulas2(p):
  'topformulas : topformulas topformula'
  p[0]=p[1]+[p[2]]

def p_topformula1(p):
  'topformula : NUMBER COLON formula PERIOD'
  p[0]=['$Weight',p[1],p[3]]

def p_topformula2(p):
  'topformula : NAME COLON formula PERIOD'
  p[0]=['$Label',p[1],p[3]]

def p_topformula3(p):
  'topformula : formula PERIOD'
  p[0]=p[1]

def p_formula1(p):
  'formula : NAME'
  p[0]=p[1]

def p_formula2(p):
  'formula : NUMBER'
  p[0]=p[1]

def p_formula3(p):
  'formula : NAME LPAREN RPAREN'
  p[0]=[p[1]]

def p_formula4(p):
  'formula : NAME LPAREN arguments RPAREN'
  p[0]=[p[1]]+p[3]

def p_formula5(p):
  'formula : formula PLUS formula'
  p[0]=['$Plus',p[1],p[3]]

def p_formula6(p):
  'formula : formula MINUS formula'
  p[0]=['$Minus',p[1],p[3]]

def p_formula7(p):
  'formula : formula TIMES formula'
  p[0]=['$Times',p[1],p[3]]

def p_formula8(p):
  'formula : formula DIVIDE formula'
  p[0]=['$Divide',p[1],p[3]]

def p_formula9(p):
  'formula : formula RAISE formula'
  p[0]=['$Raise',p[1],p[3]]

def p_formula10(p):
  'formula : formula REMAINDER formula'
  p[0]=['$Remainder',p[1],p[3]]

def p_formula11(p):
  'formula : PLUS formula'
  p[0]=p[2]

def p_formula12(p):
  'formula : MINUS formula'
  p[0]=['$Neg',p[2]]

def p_formula13(p):
  'formula : formula LT formula'
  p[0]=['$LT',p[1],p[3]]

def p_formula14(p):
  'formula : formula LE formula'
  p[0]=['$LE',p[1],p[3]]

def p_formula15(p):
  'formula : formula EQ formula'
  p[0]=['$EQ',p[1],p[3]]

def p_formula16(p):
  'formula : formula NE formula'
  p[0]=['$NE',p[1],p[3]]

def p_formula17(p):
  'formula : formula GE formula'
  p[0]=['$GE',p[1],p[3]]

def p_formula18(p):
  'formula : formula GT formula'
  p[0]=['$GT',p[1],p[3]]

def p_formula19(p):
  'formula : NOT formula'
  p[0]=['$Not',p[2]]

def p_formula20(p):
  'formula : formula OR formula'
  p[0]=['$Or',p[1],p[3]]

def p_formula21(p):
  'formula : formula AND formula'
  p[0]=['$And',p[1],p[3]]

def p_formula22(p):
  'formula : formula IMPLIES formula'
  p[0]=['$Implies',p[1],p[3]]

def p_formula23(p):
  'formula : formula EQUIV formula'
  p[0]=['$Equiv',p[1],p[3]]

def p_formula24(p):
  'formula : LBRACKET names RBRACKET formula'
  p[0]=['$ForAll',['$List']+p[2],p[4]]

def p_formula25(p):
  'formula : LCURLY names RCURLY formula'
  p[0]=['$Exists',['$List']+p[2],p[4]]

def p_formula26(p):
  'formula : LPAREN formula RPAREN'
  p[0]=p[2]

def p_names1(p):
  'names : NAME'
  p[0]=[p[1]]

def p_names2(p):
  'names : names COMMA NAME'
  p[0]=p[1]+[p[3]]

def p_arguments1(p):
  'arguments : formula'
  p[0]=[p[1]]

def p_arguments2(p):
  'arguments : arguments COMMA formula'
  p[0]=p[1]+[p[3]]

def p_error(p):
  if p: dbg("ERROR: formula syntax error at '"+p.value+"'")
  else: dbg("ERROR: formula syntax error")

import yacc

yacc.yacc()

def parseMany(s):
  r=yacc.parse(s)
  if r==None: return None
  for e in r: validate(e,['qq'])
  return map(canon,r)

def canon(f):
  return canon1(f,{})

def canon1(f,bd):
  if typ([])==typ(f):
    if isQuantification(f):
      return [f[0],
              f[1],
              canon1(f[2],dictMerge(bd,varListToSortDict(f[1])))]
    else:
      r=[]      
      for e in f:
        r.append(canon1(e,bd))
      return r
  elif bd.has_key(f):
    return varCreate(f,bd[f])
  else:
    return f

###########################################################################
# formula validation
###########################################################################

def validate(f,freeOK):
  r1=validate1(f)
  fv=listMinus(freevarNames(f),freeOK)
  if len(fv)>0:
    dbg('ERROR: free variable(s) '+string.join(fv)+' in '+pr(f))
    r2=0
  else:
    r2=1
  return r1 and r2

def validate1(f):
  if typ([])==typ(f):
    if f[0] in ['$Weight','$Label']:
      return validate1(f[2])
    if f[0] in CONNECTIVES:
      for e in f[1:]:
        if not validate1(e): return 0
      return 1
    elif f[0] in QUANTIFIERS:
      for var in f[1][1:]:
        if not deepIn(var, f[2]):
          dbg('WARNING: variable '+var+' not used in '+pr(f))
      return varListValidate(f[1]) and validate1(f[2])
  if atomValidate(f): return 1
  dbg('ERROR: not formula: '+str(f))
  return 0

def atomValidate(a):
  if typ([])==typ(a):
    if a[0] in COMPARATIVES:
      for e in a[1:]:
        if not termValidate(e): return 0
      return 1
    elif a[0]=='HoldsAt': # special treatment
      if len(a)!=3: return 0
      if not atomValidate(a[1]): return 0
      if not termValidate(a[2]): return 0
      return 1
    elif a[0]=='Trajectory': # special treatment
      if len(a)!=5: return 0
      if not atomValidate(a[1]): return 0
      if not termValidate(a[2]): return 0
      if not atomValidate(a[3]): return 0
      if not termValidate(a[4]): return 0
      return 1
    elif a[0][0]!='$':
      for e in a[1:]:
        if not termValidate(e): return 0
      return 1
  elif typ('')==typ(a):
    if a[0]!='$': return 1
  dbg('ERROR: not atom: '+str(a))
  return 0

def termValidate(t):
  if isVar(t):
    return 1
  elif isConst(t):
    return 1
  elif typ([])==typ(t):
    if t[0] in FUNCTIONS:
      for e in t[1:]:
        if not termValidate(e): return 0
      return 1
    elif t[0][0]!='$':
      for e in t[1:]:
        if not termValidate(e): return 0
      return 1
  dbg('ERROR: not term: '+str(t))
  return 0

def varListValidate(x):
  if typ([])==typ(x):
    if x[0]=='$List':
      for e in x[1:]:
        if not isVar(e):
          dbg('ERROR: not variable: '+str(e))
          return 0
      return 1
  dbg('ERROR: not variable list: '+str(x))
  return 0

########################################################################
# formula printing
########################################################################

def anyC(x):
  for e in x:
    if isC(e): return 1
  return 0

def isC(e):
  return typ([])==typ(e) and C.has_key(e[0])

Q={
  '$ForAll': ('[',']'),
  '$Exists': ('{','}'),
}

C={
  '$Not':    (1,'!'),
  '$Or':     (2,'|'),
  '$And':    (2,'&'),
  '$Xor':    (2,'xor'),
  '$Implies':(2,'->'),
  '$Equiv':  (2,'<->'),
  '$LT':     (2,'<',),
  '$LE':     (2,'<='),
  '$EQ':     (2,'='),
  '$NE':     (2,'!='),
  '$GE':     (2,'>='),
  '$GT':     (2,'>'),
  '$Neg':    (1,'-'),
  '$Plus':   (2,'+'),
  '$Minus':  (2,'-'),
  '$Times':  (2,'*'),
  '$Divide': (2,'/'),
  '$Raise':  (2,'^'),
  '$Remainder': (2,'%'),
}

def pr(f):
  return formulaToString(f,0,0)+'.'

def formulaToString(f,indent,pp):
  if typ('')==typ(f):
    return f
  elif typ(1)==typ(f):
    return str(f)
  elif typ(1.0)==typ(f):
    return str(f)
  elif isVar(f):
    return varName(f)
  elif typ([])==typ(f):
    if pp and depth(f)<2: return formulaToString(f,indent,0)
    if f[0] in ['$Weight','$Label']:
      return f[1]+': '+formulaToString(f[2],indent,pp)
    if typ('')==typ(f[0]) and C.has_key(f[0]):
      (arity,c)=C[f[0]]
      if arity==1: return c+formulaToString(f[1],indent,pp)
      if f[0] not in ['$Implies','$Equiv'] and anyC(f[1:]):
        left='('
        right=')'
        pad=' '
      else:
        left=right=pad=''
      if pp and f[0] not in COMPARATIVES:
        r=''
        i=0
        for e in f[1:]:
          t=formulaToString(e,indent+1,pp)
          if t[0]!='\n':
            r=r+'\n'+ind(indent)
          if i==0:
            r=r+left
          else:
            r=r+pad
          r=r+t
          if i!=len(f[1:])-1:
            r=r+' '+c
          i=i+1
        return r+right
      else:
        r=left
        i=0
        for e in f[1:]:
          if i!=0:
            r=r+' '+c+' '
          r=r+formulaToString(e,indent,pp)
          i=i+1
        return r+right
    if typ('')==typ(f[0]) and Q.has_key(f[0]):
      (l,r)=Q[f[0]]
      return l+varListToString(f[1])+r+' '+formulaToString(f[2],indent,pp)
    r=''
    i=0
    for e in f[1:]:
      if i!=0:
        r=r+', '
      r=r+formulaToString(e,indent,pp)
      i=i+1
    if isVar(f[0]):
      return varName(f[0])+'('+r+')'
    else:
      return f[0]+'('+r+')'
  elif f==None:
    return 'None'
  return '??'

def varListToString(x):
  if typ(x)==typ([]) and len(x)>0 and x[0]=='$List':
    return string.join(map(varToString,x[1:]),', ')
  return '??'

def varToString(x):
  name=varName(x)
  sort=varSort(x)
  if sort:
    return name+':'+sort
  return name

def ind(n):
  return ' '*n

########################################################################
# files
########################################################################

def executableExists(fn):
  return exists(fn) or exists(fn+'.exe')

def exists(fn):
  try:
    x=open(fn,'r')
    x.close()
    return 1
  except:
    return 0

FILENUM=0

def tmpfile(s):
  global FILENUM
  r='/tmp/'+s+'.'+str(os.getpid())+'.'+str(FILENUM)
  FILENUM=FILENUM+1
  return r

def diff(s1,s2):
  fn1=tmpfile('diff')
  fn2=tmpfile('diff')
  fn3=tmpfile('diff')
  fileWrite(fn1,s1)
  fileWrite(fn2,s2)
  os.system('diff '+fn1+' '+fn2+'> '+fn3)
  r=open(fn3).read()
  os.system('rm '+fn1+' '+fn2+' '+fn3)
  return r

def fileWrite(fn,s):
  try:
    stream=open(fn,'w')
    stream.write(s)
    stream.close()
    return 1
  except:
    Util.dbg('ERROR: Trouble writing to '+fn)
    return 0

def linecount(fn):
  n=0
  for c in open(fn).read():
    if c=='\n': n=n+1
  return n

########################################################################
# strings
########################################################################

# returns (before,afterWithPtn,after):
def stringFind(s,ptn):
  i=string.find(s,ptn)
  if i==-1: return (None,None,None)
  return (s[:i],s[i:],s[i+len(ptn):])

def commentElim(line,c):
  i=string.find(line,c)
  if i!=-1: line=line[:i]
  return string.strip(line)

def headIs(s,hd):
  try:
    return s[:len(hd)]==hd
  except:
    return 0

def commaListParse(x):
  return string.split(string.replace(x,' ',''),',')

def elimHead(s,hd):
  if type('')!=type(s): return s
  if s[:len(hd)]==hd:
    return s[len(hd):]
  return s

def grep(ptn,s):
  r=[]
  for line in string.split(s,'\n'):
    if -1!=string.find(line,ptn):
      r.append(line)
  return r

def plural(x):
  if x==1: return ''
  return 's'

# spec=((head,length,just),...)
def tbl(spec,rows):
  r=''
  for (head,length,just) in spec:
    r=r+xjust(head,length,just)+' '
  r=r+'\n'
  for (head,length,just) in spec:
    r=r+('='*length)+' '
  r=r+'\n'
  for row in rows:
    i=0
    while i<len(row):
      (head,length,just)=spec[i]
      r=r+xjust(str(row[i]),length,just)+' '
      i=i+1
    r=r+'\n'
  return r

def ljust(s,l):
  if len(s)>l: return s
  return (s+(' '*l))[0:l]

def rjust(s,l):
  if len(s)>l: return s
  return ((' '*l)+s)[-l:]

def xjust(s,len,j):
  if j=='l': return ljust(s,len)
  elif j=='r': return rjust(s,len)
  else: return s

########################################################################
# lists
########################################################################

def anyIn(x,y):
  for e in x:
    if e in y: return 1
  return 0

def deepIn(e,x):
  if type([])!=type(x) and type(())!=type(x): return 0
  for e1 in x:
    if e==e1: return 1
    if deepIn(e,e1): return 1
  return 0

def deepInAny(ex,x):
  for e in ex:
    if deepIn(e,x): return 1
  return 0

def depth(x):
  if type([])!=type(x): return 0
  r=1
  for e in x:
    r=max(r,1+depth(e))
  return r

def listMinus(x0,x1):
  r=[]
  for e in x0:
    if e not in x1: r.append(e)
  return r

def crossProduct(x):
  if 0==len(x): return [[]]
  y=crossProduct(x[1:])
  r=[]
  for e in x[0]:
    for f in y:
      r1=[e]
      for f1 in f: r1.append(f1)
      r.append(r1)
  return r

class CrossProductIterator:
  def __init__(self, x, name):
    self.x=x
    self.len=len(x)
    self.indices=[0]*self.len
    self.lens=map(len,x)
    self.n=reduce(lambda x,y:x*y,self.lens)
    self.pcr=PercentCompleteReporter(name, self.n)

  def nextElement(self):
    self.pcr.next()
    r=map(lambda xi,j:xi[j],self.x,self.indices)
    i=0
    while 1:
      if i==self.len:
        self.indices=None
        break
      self.indices[i]=self.indices[i]+1
      if self.indices[i]!=self.lens[i]: break
      j=i
      while j>=0:
        self.indices[j]=0
        j=j-1
      i=i+1
    return r

  def hasMoreElements(self):
    return self.n>0 and self.indices!=None

def assertionParse(s):
  return assertionParse1(s,0)[0]

def assertionParse1(s,i):
  l=len(s)
  if i<l and s[i]=='[':
    i=i+1
    elems=[]
    while i<l and s[i]!=']':
      (a,i)=assertionParse1(s,i)
      if a==None: break
      elems.append(a)
      if i<l and s[i]==' ': i=i+1
    return (elems,i+1)
  else:
    inqt=0
    tok=''
    while i<l:
      if inqt:
        tok=tok+s[i]
        if s[i]=='"': inqt=0
        i=i+1
      else:
        if s[i] in ' []': break
        tok=tok+s[i]
        if s[i]=='"': inqt=1
        i=i+1
    return (tok,i)

def assertionToString(x):
  if x==None: return ''
  if type(x)!=type([]) and type(x)!=type(()):
    return str(x)
  r='['
  cnt=0
  for e in x:
    if cnt!=0: r=r+' '
    r=r+assertionToString(e)
    cnt=cnt+1
  return r+']'

########################################################################
# timing
########################################################################

class Timing:
  def __init__(self,name):
    self.beginningTs=time.time()
    self.name=name
    self.reset()
    self.start()

  def reset(self):
    self.sum=0.0
    self.trials=0

  def start(self):
    self.startTs=time.time()

  def stop(self):
    self.sum=self.sum+(time.time()-self.startTs)
    self.trials=self.trials+1

  def secondsGet(self):
    if self.trials==0:
      return 0.0
    else:
      return self.sum/self.trials

  def __repr__(self):
    if self.trials==1:
      r=secFmt(self.secondsGet())
    else:
      r=('average of '+secFmt(self.secondsGet())+
         ' over '+str(self.trials)+' trials')
    return self.name+' took '+r

class PercentCompleteReporter:
  def __init__(self, name, n):
    self.name=name
    self.n=n
    self.start=time.time()
    self.last=self.start
    self.cnt=0

  def next(self):
    if (time.time()-self.last)>15:
      self.last=time.time()
      frac=self.cnt/(0.0+self.n)
      used=self.last-self.start
      remaining=used*((1/frac)-1)
      dbg(self.name+': '+pc(frac)+'; '+
               str(self.cnt)+' of '+str(self.n)+'; '+
               secFmt(remaining)+' left')
    self.cnt=self.cnt+1

def pc(x):
  return str(percent(x))+'%'

def secFmt(secs):
  if secs<60:
    return fmt(secs)+'s'
  elif secs<3600:
    return fmt(secs)+'s/'+fmt(secs/60.0)+'m'
  else:
    return fmt(secs)+'s/'+fmt(secs/60.0)+'m/'+fmt(secs/3600.0)+'h'

def fmt(x):
  return str(0.1*int(0.5+x*10))

########################################################################
# debugging
########################################################################

STREAM=sys.stdout
DEBUG=0

def dbgInit(fn):
  global STREAM
  STREAM=open(fn,'w')

def dbg(s):
  global STREAM
  global DEBUG
  if DEBUG:
    ts="%.4d%.2d%.2dT%.2d%.2d%.2d" % time.localtime(time.time())[:6]
    t=ts+': '+s+'\n'
  else:
    t=s+'\n'
  STREAM.write(t)
  STREAM.flush()

########################################################################
# utilities
########################################################################

def dictIncr(d,key,n):
  if d.has_key(key):
    d[key]=d[key]+n
  else:
    d[key]=n

def dictDbg(d,ignore):
  r=[]
  keys=d.keys()
  keys.sort()
  for key in keys:
    if key in ignore: continue
    dbg(key+': '+str(d[key]))

def dictToList(d):
  r=[]
  for key in d.keys():
    r.append((key,d[key]))
  return r

def dictMerge(d1,d2):
  d=d1.copy()
  for key in d2.keys():
    d[key]=d2[key]
  return d

def intParse(s,default):
  try:
    return int(s)
  except:
    return default

def isTrajectoryAxiom(f):
  return deepIn('Trajectory',f) or deepIn('AntiTrajectory',f)

def isEffectAxiom(f):
  return deepInAny(EFFECT_AXIOM_PREDICATES,f)

def transform(f,transformer):
  t=transformer(f)
  if t!=None: return t
  if typ([])==typ(f):
    if f[0] in QUANTIFIERS:
      return [f[0],f[1],transform(f[2],transformer)]
    else:
      r=[f[0]]
      for e in f[1:]: r.append(transform(e,transformer))
      return r
  else:
    return f

def nameget(x):
  if islist(x): return x
  else: return x.name

def islist(x):
  return typ(x)==typ([])

def filenameToName(filename):
  i=string.rfind(filename,'/')
  j=string.rfind(filename,'.',i)
  return filename[i+1:j]

def filenameToTextFilename(filename):
  j=string.rfind(filename,'.')
  return filename[:j]+'.txt'

def notime(x):
  return x[:-1]

print copyright('')

########################################################################
# End of file.
########################################################################
import sys
for arg in sys.argv[1:]:
	run(arg)
