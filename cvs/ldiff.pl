#!/usr/bin/perl
#use Inline Java => 'DATA' ;


$version="1.0.8";

#    ldiff.pl
#  
#    Copyright (C) 2006, 2007, 2008, 2009  Luigi Cerulo - lcerulo@unisannio.it
#    http://rcost.unisannio.it/cerulo
#    RCOST - Research Centre on Software Technology
#    University of Sannio, Benevento, Italy
#
#    This program is free software: you can redistribute it and/or modify
#    it under the terms of the GNU General Public License as published by
#    the Free Software Foundation, either version 3 of the License, or
#    (at your option) any later version.
#
#    This program is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU General Public License for more details.
#
#    You should have received a copy of the GNU General Public License
#    along with this program.  If not, see <http://www.gnu.org/licenses/>.
#    
#
# ---------------------------------------------------------------
#
#
#  TODO:
#  - any suggestion is wellcome!
#  - probabilistic mapping of source lines

#  Changelog:
#  26 Dec 2009 (release 1.0.9)
#    - resolved some bugs and added -B and -b diff parameter to ignore white space differencies (suggested by Davide Vetrale)
#
#  6 Aug 2009 (release 1.0.8)
#    - resolved the issue related to the path to cat (suggested by Michael Ernst)
#    - published to sourceforge repository (this changelog is no more maintained!)
#
#  7 Mar 2009 (release 1.0.7)
#    - added tracking of file revision sequences by mean of difference composition. See help for details
#    - optimization issues as suggested by Daniel German...
#    - fixed output printing. Sometimes adds were missed from output...
#
#  10 Oct 2008 (release 1.0.6)
#    - added -L and -u parameters that does nothing, as suggested by Hofmann Philipp.
#      With these changes ldiff could easily used in place of diff for example in conjunction with SVN 
#      to analyse repositories
#    - on the way of the previous suggestion added also the following parameter:
#      -s -q --brief --report-identical-files --recursive
#      this is useful when ldiff is wrapped as a diff program
#    - removed the unix grep call. Used perl grep function istead (more portable now).
#    - minor fixes
#
#  4 Oct 2008 (release 1.0.5)
#    - added further verbose informations 
#
#  5 Sep 2008 (release 1.0.4)
#    - added output format parameter (-o) with unix diff like format
#
#  1 May 2008 (release 1.0.3)
#    - changed hunk similarity weight with block distance
#    - added cut level to hunk selection
#
#  1 May 2008 (release 1.0.2)
#    - bug fix: hunk similarity was wrong fixed size computation of hunk!
#    - added distance weight between unchanged hunks
#
#  2 Mar 2008 (release 1.0.1)
#    - word/cpp tokenizer: bug fix when compunting the levensthein similarity
#    - refactored ngram tokenizer for line similarity
#
#  29 Feb 2008 (release 1.0)
#    - bug fix: grep match parameter of the diff command was wrong...
#    - enhanced command line parameters
#    - separated hunk and line metrics and tokenizers
#    - added more tokenizers (ngram)
#
#
#  23 Jan 2008 (release 0.6)
#    - changed the command parameter (-x was removed). Renamed cosine similarity to hunk similarity in order to
#      include in future more hunks similarity algorithms
#    - added c/cpp lexer (provided my Max Di Penta)
#    - added white space parameter
#    - added unix diff option
#    - bug fix: change relation thinning last index was wrong
#    - bug fix: fixed partial indexes initialization of change thinning sub
#    - added some debug prints
#
#  11 Dec 2007 (release 0.5)
#    - fixed bugs for multiple file argument
#
#  04 Dec 2007 (release 0.4)
#    - added token based Levenshtein distance
#    - bug fix on file lenght
#
#  19 Jun 2007 (release 0.3)
#    - added the support to compare multiple files
#
#  16 Jun 2007 (release 0.2)
#    - added the extended functionaly that considers also the cosine similarity
#
#  31 May 2007 (release 0.1)
#    - first public release
#
# ---------------------------------------------------------------

use Getopt::Long qw(:config no_ignore_case);;


sub is_installed {
	my($module) = @_;
	(my $filename = $module) =~ s@::@/@g;     # 1
	return eval { require $filename };        # 2
}

my $ngram='';
my $fast='';
my $java='';
my $verbose = '';	
my $help = '';
my $niter=1;   # nr iteration defaults
my $tleven=0.4;
my $Ltype="char";
my $Htype="word";
my $Hmetric="cosine";
my $Lmetric="leven";
my $tcosinerule="0.5:all";
my $extended='';
my $filename1='';
my $filename2='';
my $wspace='';
my $Bspace='';
my $bspace='';
my $isDiff='';
my $oformat='diff';
my $differ='';
my $identical='';

GetOptions (  'v' => \$verbose, 
              'h|?' => \$help,
              'w' => \$wspace,  # diff option            
              'B' => \$Bspace,  # diff option
              'b' => \$bspace,  # diff option                                        
              'diff' => \$isDiff,                            
              'i=i' => \$niter,
              'LT=f' => \$tleven,
              'lt=s' => \$Ltype,              
              'ht=s' => \$Htype,                            
              'hm=s' => \$Hmetric,
              'lm=s' => \$Lmetric,
              'HT=s' => \$tcosinerule,
              'o=s' => \$oformat,
              'q' => \$differ,    # -q is usually used by diff wrapper to know if files differ
              's|report-identical-files' => \$identical,  # -s is usually used by diff wrapper to know if files are identical
              'L=s' => \$donothing,  # The following are added for diff compatibility reason
              'u' => \$donothing,    # so that ldiff can be used in the place of diff
              'recursive' => \$donothing, 
              'brief' => \$donothing
           ) or usage();


if ($help) {
  usage();
}

$testata="ldiff.pl - a line differencing algorithm v. $version\n";
$testata.="RCOST - Research Centre on Software Technology\n";
$testata.="University of Sannio, Benevento, Italy\n";
$testata.="http://ldiff.sourceforge.net/\n\n";

print $testata if ($verbose);


if ($#ARGV>=1) {
	#if (($#ARGV % 2)==0) {
	#  print "The number of files should be an even number!\n";
  #  usage();
	#} else {
		@filenames=@ARGV;
    #$filename1=$ARGV[0];
    #$filename2=$ARGV[1];
  #}
} else {
	print @ARGV;
	print "Files to compare not specified!\n";
  usage();
}

if (is_installed("Text::LevenshteinXS.pm")) {
	$fast=1;
	print "... using Text::LevenshteinXS module -- more faster :-)\n" if $verbose;
} else {
	print "... using local Levenshtein function -- more slower :-(\n" if $verbose;
}

if (is_installed("Inline::Java.pm")) {
	$java=1;
	print "... using Inline::Java module -- c/cpp lexer available :-)\n" if $verbose;
} else {
	print "... Inline::Java module not found -- no c/cpp lexer available :-(\n" if $verbose;
}

if (is_installed("Text::Ngrams.pm")) {
	$ngram=1;
	print "... using Inline::Ngram module -- ngrams available :-)\n" if $verbose;
} else {
	print "... Inline::Ngram module not found -- no ngrams available :-(\n" if $verbose;
}

# check whether used unix commands exists
$cat_cmd="cat";
$head_cmd="head";
$tail_cmd="tail";
@tmp_out=`$cat_cmd $0`;
if ($tmp_out[0] eq "") {
	print "... $cat_cmd not found... please fix \$cat_cmd variable in the code\n";
	exit;
} 
@tmp_out=`$head_cmd $0`;
if ($tmp_out[0] eq "") {
	print "... $head_cmd not found... please fix \$head_cmd variable in the code\n";
	exit;
} 
@tmp_out=`$tail_cmd $0`;
if ($tmp_out[0] eq "") {
	print "... $tail_cmd not found... please fix \$tail_cmd variable in the code\n";
	exit;
} 


sub usage() {

  print "$testata";
  print "\n";
  print " usage: $0 [-hvw] [-o format] [-diff] [-i n] [-HT CUT:N] [-LT THR] [-hm metric] [-lm metric] [-ht type] [-lt type] file1 file2 ... fileN\n";
  print "\n";
  print "   -h         : this (help) message\n";
  print "   -v         : verbose output\n";
  print "   -o format  : output format (default diff)\n";  
  print "          diff, like unix diff output\n";
  print "          ext, extended (suitable for parsing purpose, see the example below)\n";
  print "   -b         : ignore changes in the amount of white space (is a diff parameter)\n";
  print "   -w         : ignore all white space (is a diff parameter)\n";
  print "   -B         : ignore changes whose lines are all blank (is a diff parameter)\n";
  print "   -diff      : the standard unix diff (all other parameters are ignored)\n";    
  print "   -i n       : number of iterations (n=0 considers only line similarity, n>0 includes also hunk similarity, default=1)\n";
  print "   -HT CUT:N  : hunk similarity cut level (applies only if the number of iteration is >0)\n";
  print "          0=< CUT <=1 is the cut level (default is 0.5)\n";
  print "          N >= 1 is the number of item to consider (default N=all, means all hunks, CUT works as a threshold)\n";  
  print "   -LT THR    : [0..1] line similarity threshold (default 0.4)\n";
  
  print "   -lm metric : line similarity metric (sequence based similarity, default leven)\n";  
  print "   -hm metric : hunk similarity metric (set based similarity, default cosine)\n";  
  print "          available similarity metrics:\n";    
  print "               leven, Normalized Levenshtein distance\n";  
  print "               cosine, cosine similarity\n";  
  print "               jaccard, Jaccard similarity\n";  
  print "               overlap, overlap similarity\n";  

  print "   -lt type   : line tokenizer (default char)\n";
  print "   -ht type   : hunk tokenizer (default word)\n";  
  print "          available tokenizers:\n";    
  print "               char,  character tokens\n";  
  print "               word,  word token (i.e. strings separated by non alphanumeric characters)\n";  
  print "               ngram, 3-grams tokens (Text::Ngrams module necessary)\n";    
  print "               cpp, c/cpp language tokens (a c/cpp lexer written in java is used, Inline::Java module necessary)\n";  
  print "               java, java language tokens (coming soon)\n";    
  print "               php, php language tokens (coming soon)\n";      



  print "\n";
  print "   file1 file2 ... fileN, are N text files to compare (at least two)\n";
  print "   the output is the difference between file1 and fileN built by composing the differences:\n\n";
  print "     file1 and file2\n";  
  print "     file2 and file3\n";  
  print "     ...\n";  
  print "     fileN-1 and fileN\n";    
  print "\n\n";    
  print " Example of usage\n\n";  
  print "   Output format: (left range)[ucad](right range):left-file;right-file\n";
  print "   u=unchanged, c=changed, a=added, d=deleted\n";
  print "\n"; 
  print "   \$ $0 -o ext examples/sandwich.txt.r1 examples/sandwich.txt.r2\n";
  print "   1,1u1,1:examples/sandwich.txt.r1;examples/sandwich.txt.r2\n";
  print "   1,1a6,7:examples/sandwich.txt.r1;examples/sandwich.txt.r2\n";
  print "   1,1a2,2:examples/sandwich.txt.r1;examples/sandwich.txt.r2\n";
  print "   2,2c8,8:examples/sandwich.txt.r1;examples/sandwich.txt.r2\n";
  print "   3,5u3,5:examples/sandwich.txt.r1;examples/sandwich.txt.r2\n";
  print "   6,9d5,5:examples/sandwich.txt.r1;examples/sandwich.txt.r2\n";
  print "   10,10u9,9:examples/sandwich.txt.r1;examples/sandwich.txt.r2\n";   

  print "\n";  
  print " References\n\n";  
  print "   Gerardo Canfora, Luigi Cerulo, Massimiliano Di Penta, 'Tracking Your Changes: A Language-Independent Approach'\n";
  print "   IEEE Software, vol. 26, no. 1, pp. 50-57, January/February, 2009.\n\n";
  print "   Gerardo Canfora, Luigi Cerulo, Massimiliano Di Penta, 'Identifying Changed Source Code Lines from Version Repositories'\n";
  print "   In Mining Software Repositories, 2007. (ICSE Workshops MSR '07), pp.14-14, 20-26 May 2007\n";  
  
  exit;
}


if ($niter>0) {
	$extended=1;
} else {
	$extended='';
}



if ($extended) {
  print "... hunk similarity (metric: $Hmetric, tokenizer: $Htype)\n" if $verbose;
} else {
	print "... hunk similarity (not used, considering adjacent hunks)\n" if $verbose;
  $niter=1;
}

print "... line similarity (metric: $Lmetric, tokenizer: $Ltype)\n" if $verbose;
print "... number of iterations: $niter\n" if $verbose;


if ($#filenames>1) {
	print "... comparing more than two files. Using composition of results\n" if $verbose;
}


$matchexp="^(\\d*),?(\\d+)([adc])(\\d+),?(\\d*)";

#my $nfiles=($#filenames+1)/2;

$filename1="";
$filename2="";
%globaloutput=();
@f1_list=();
@f2_list=();
foreach my $fli(0..($#filenames-1)) {
  @chg_set=();
  @add_set=();
  @del_set=();
  @uch_set=();

  $filename1=$filenames[$fli];
  $filename2=$filenames[$fli+1];

  print "\ncomparing $filename1 -> $filename2\n\n" if $verbose;

  # DIFF command
  my $diffp="";
  if ($wspace) {
  	$diffp.=" -w";
  }
  if ($bspace) {
  	$diffp.=" -b";
  }
  if ($Bspace) {
  	$diffp.=" -B";
  }  
  if ($differ) {
  	$diffp.=" -q";
  }
  if ($identical) {
  	$diffp.=" -s";
  }  
  $diffcmd="diff -N $diffp \"$filename1\" \"$filename2\"";
  my @diff_out=`$diffcmd`;
  @differences = grep(/$matchexp/, @diff_out);  

  if ($differ || $identical) {
  	my @key_identical=grep(/^Files .* and .* are identical$/, @diff_out);
  	my @key_differ=grep(/^Files .* and .* differ$/, @diff_out);
  	if ($#key_identical==0 || $#key_differ==0) {
  		print @diff_out;
  	}
  }
    
#  @wc_out=`wc -l \"$filename1\"`;
#  ($totalLeft)= $wc_out[0] =~ /(\d+)/;
#  @wc_out=`wc -l \"$filename2\"`;
#  ($totalRight)= $wc_out[0] =~ /(\d+)/;

  @cat_out=();
  #print $filename1."\n";
  if (-e $filename1) {
  	#print "CIAO";
    @cat_out=`$cat_cmd \"$filename1\"`;
  }
  $totalLeft= $#cat_out+1;
  
  @cat_out=();
  if (-e $filename2) {
    @cat_out=`$cat_cmd \"$filename2\"`;
  }
  $totalRight= $#cat_out+1;

  ($pre_d1,$pre_d2,$pre_type,$pre_d3,$pre_d4)=(0,0,"u",0,0);
  ($u_d1,$u_d2,$u_d3,$u_d4) = (0,0,0,0);
  foreach $d(@differences) {

    $file_unchanged=0;
    $d =~ s/\n//;
    my ($d1,$d2,$type,$d3,$d4) = $d =~ /(\d*,)?(\d+)([adc])(\d+)(,\d*)?/;
    $d1 =~ s/,//;
    $d4 =~ s/,//;

    if ($d4==0) {
      $d4=$d3;
    }
    if ($d1==0) {
      $d1=$d2;
    }
    if ($type eq "a") {
      #print $d2.",".$d2."a".$d3.",".$d4."\n";
      push @add_set, {file1 => "$filename1", type=>"a", file2 => "$filename2",  
                    l_start => $d2, l_end => $d2, 
          			    r_start => $d3, r_end => $d4 };    
    }
    if ($type eq "d") {
      #print $d1.",".$d2."d".$d3.",".$d3."\n";
      push @del_set, {file1 => "$filename1", type=>"d", file2 => "$filename2",  
                    l_start => $d1, l_end => $d2, 
          			    r_start => $d3, r_end => $d3 };    
    }
    if ($type eq "c") {
    	if (!$extended || $isDiff) {
        push @chg_set, {file1 => "$filename1", file2 => "$filename2",  
                    l_start => $d1, l_end => $d2, 
          			    r_start => $d3, r_end => $d4 };
      } else {
        push @add_set, {file1 => "$filename1", type=>"a", file2 => "$filename2",  
                    l_start => $d1-1, l_end => $d1-1, 
          			    r_start => $d3, r_end => $d4 };   
        #print "CIAO".($d1-1).",".($d1-1)."a".$d3.",".$d4."\n";
        push @del_set, {file1 => "$filename1", type=>"d", file2 => "$filename2",  
                    l_start => $d1, l_end => $d2, 
          			    r_start => $d3-1, r_end => $d3-1 };          			     	
      }
    }
    if ($type eq "c") {
      ($u_d1,$u_d2,$u_d3,$u_d4) = ($pre_d2+1,$d1-1,$pre_d4+1,$d3-1);
    }
    if ($type eq "a") {
      ($u_d1,$u_d2,$u_d3,$u_d4) = ($pre_d2+1,$d1,$pre_d4+1,$d3-1);
    }
    if ($type eq "d") {
      ($u_d1,$u_d2,$u_d3,$u_d4) = ($pre_d2+1,$d1-1,$pre_d4+1,$d3);
    }
    #print "$u_d2 - $u_d1  $u_d4 - $u_d3\n";
    if ( ($u_d2-$u_d1)>=0 && ($u_d4-$u_d3)>=0) {
      if (($u_d2-$u_d1)!=($u_d4-$u_d3)) {
        print "ATTENZIONE1 ";
      }
      #print $filename1." ".$u_d1.",".$u_d2."u".$u_d3.",".$u_d4."\n";
      push @uch_set, {file1 => "$filename1", type=>"u", file2 => "$filename2",  
                    l_start => $u_d1, l_end => $u_d2, 
          			    r_start => $u_d3, r_end => $u_d4 };        
    }
  
    ($pre_d1,$pre_d2,$pre_type,$pre_d3,$pre_d4) = ($d1,$d2,$type,$d3,$d4);
  }
#print $totalLeft." - ".$totalRight."\n";
  if ( ($totalLeft-$pre_d2)>0 && ($totalRight-$pre_d4)>0) {
    push @uch_set, {file1 => "$filename1", type=>"u", file2 => "$filename2",  
                    l_start => ($pre_d2+1), l_end => $totalLeft, 
          			    r_start => ($pre_d4+1), r_end => $totalRight };   	
    #print $filename1." ".($pre_d2+1).",".$totalLeft."u".($pre_d4+1).",".$totalRight."\n";
  }

  
	# output data structure for file(i) and file(i+1)
	%output=();
	
	
	# change relation thinning
	if (!$isDiff) {
	 ($tcosine,$topn) = $tcosinerule =~ /([^\:]*)\:([^\:]*)/;	
	 foreach my $it(1..$niter) {
		my $ctopn=$topn;
		if ($extended) {
		  # computing cosine similarity to generate the current chg_set
		  $totalHunks=$#del_set+$#add_set+2;
		  @chg_set=();
		  @rangelist=();
		  print "$it) TOTAL HUNKS: DELs=".($#del_set+1)." ADDs=".($#add_set+1)." (SELECTION RULE=$tcosine:$ctopn)\n"  if ($verbose);
		  foreach my $dli(0..$#del_set) {
		  	my $dl=$del_set[$dli];
		  	if ($dl) {
		      foreach my $adi(0..$#add_set) {
		   	    my $ad=$add_set[$adi];
		   	    if ($ad) {
	            my $terma=tokenize($Htype,$ad->{file2},$ad->{r_start},$ad->{r_end},$totalHunks);
	            my $termd=tokenize($Htype,$dl->{file1},$dl->{l_start},$dl->{l_end},$totalHunks);
	
		          my $rsim = range_similarity($Hmetric,\%$termd,\%$terma); # similitudine sul contenuto
		          
		          # distanza relativa dei blocchi in termini di blocchi unchanged
		          my $rdist = 1;
		          if ($ad->{file2} eq $dl->{file2}) {
		          	$rdist=sqrt(($dl->{l_start}-$ad->{l_start}+1)**2);
		          }
		           
		          my $factor=exp(-1/50*$rdist);
		          my $weight=$rsim; # * $factor; # peso calcolato
		          
		          
		          push @rangelist, {score=>$weight, add=>$ad, del=>$dl, addi=>$adi, deli=>$dli, file1=>$dl->{file1}, file2=>$ad->{file2}};
		          my $asterix=" ";
		          if ($weight>=$tcosine) {
		          	$asterix="*";
		          }
		          print "   $asterix $dl->{l_start} $dl->{l_end} <-> $ad->{r_start} $ad->{r_end} [weight=$weight (factor=$factor dist=$rdist)]\n"  if ($verbose);
		        }
		      
		      }
		    }
		  }
		  
		  my %idx_add=();
		  my %idx_del=();
		  
		  foreach my $r(sort {$b->{score} <=> $a->{score}} @rangelist) {
		    	if ($r->{score}<$tcosine) {
		    	  last;
		    	} else {
		    	  if (!($ctopn eq "all") && $ctopn==0) {
		    	    last;	    		
		    	  }
		    		$ctopn-- if !($ctopn eq "all");
		    	}
		    	if ($idx_add{$r->{addi}}!=1 && $idx_del{$r->{deli}}!=1) {
	          push @chg_set, {file1 => $r->{file1}, file2 => $r->{file2},  
	                    l_start => $r->{del}->{l_start}, l_end => $r->{del}->{l_end}, 
	          			    r_start => $r->{add}->{r_start}, r_end => $r->{add}->{r_end} };
	          print "   SELECTED HUNK (>=$tcosine cut=$ctopn): ".$r->{del}->{l_start}.",".$r->{del}->{l_end}."-".$r->{add}->{r_start}.",".$r->{add}->{r_end}." ($r->{score})\n"  if ($verbose);
	          delete $del_set[$r->{deli}];
	          delete $add_set[$r->{addi}];
	          $idx_add{$r->{addi}}=1;
	          $idx_del{$r->{deli}}=1;
	        }
		  }
		}
		
	  foreach my $cs(@chg_set) {
	    my $relaz=$cs->{l_start}.",".$cs->{l_end}."c".$cs->{r_start}.",".$cs->{r_end}; #.":-".$cs->{file1}.";".$cs->{file2};
	    print " LINE SIMILARITY (metric: $Lmetric, hunk: $relaz)\n" if $verbose;
	    my($padd_set, $pdel_set, $pchg_set) = chg_thin(\%{$cs});
		    	
	    foreach my $c(@$pchg_set) {
	    	if ($c) {
	    		$chg_str=$c->{l_start}.",".$c->{l_end}."c".$c->{r_start}.",".$c->{r_end}.":".$c->{file1}.";".$c->{file2}."\n";
	    	  $output{$c->{file1}}{$c->{file2}}{$c->{l_start}}{2}=$chg_str;  
	    	}
		  }
	    push @add_set, @$padd_set;
	    push @del_set, @$pdel_set;
	  }
	 }
	} else {
	  foreach my $c(@chg_set) {
	   	if ($c) {
	    		$chg_str=$c->{l_start}.",".$c->{l_end}."c".$c->{r_start}.",".$c->{r_end}.":".$c->{file1}.";".$c->{file2}."\n";
	    	  $output{$c->{file1}}{$c->{file2}}{$c->{l_start}}{2}=$chg_str;  
	   	}
	  }
	}

		# store results ...
		foreach my $u(@uch_set) {
			if ($u) {
				$output{$u->{file1}}{$u->{file2}}{$u->{l_start}}{1}=$u->{l_start}.",".$u->{l_end}."u".$u->{r_start}.",".$u->{r_end}.":".$u->{file1}.";".$u->{file2}."\n";  
		  }
		}
		foreach my $a(@add_set) {
			if ($a) {
				my $line_key=$a->{l_start}."-".$a->{r_start};
			  $output{$a->{file1}}{$a->{file2}}{$line_key}{3}=$a->{l_start}.",".$a->{l_end}."a".$a->{r_start}.",".$a->{r_end}.":".$a->{file1}.";".$a->{file2}."\n";  
		  }
		}
		foreach my $d(@del_set) {
			if ($d) {
				my $line_key=$d->{l_start}."-".$d->{r_start};
				$output{$d->{file1}}{$d->{file2}}{$line_key}{4}=$d->{l_start}.",".$d->{l_end}."d".$d->{r_start}.",".$d->{r_end}.":".$d->{file1}.";".$d->{file2}."\n";  
		  }
		}
		
    
    %globaloutput=compose(\%globaloutput,\%output);

}

# output results, ordered (with the format specified in oformat)...

foreach my $f1(keys %globaloutput) {
	foreach my $f2(keys %{$globaloutput{$f1}}) {
  	my @linef1=`$cat_cmd \"$f1\"` if ($oformat eq "diff");
  	my @linef2=`$cat_cmd \"$f2\"` if ($oformat eq "diff");
    foreach my $o(sort {$a<=>$b} keys %{$globaloutput{$f1}{$f2}}) {
    	foreach my $t(sort {$a<=>$b} keys %{$globaloutput{$f1}{$f2}{$o}}) {
        if ($oformat eq "ext") {
    		  print $globaloutput{$f1}{$f2}{$o}{$t};
    	  } else { # the diff like format (default)
    	  	my ($l_s,$l_e,$tp,$r_s,$r_e,$file1,$file2) = $globaloutput{$f1}{$f2}{$o}{$t} =~ /(\d+),(\d+)([adcu])(\d+),(\d+)\:(.*)\;(.*)/;
          if ($tp eq "c") {
          	print $l_s.",".$l_e."c".$r_s.",".$r_e."\n";
          	foreach my $lj($l_s..$l_e) {
          		print "< ".$linef1[$lj-1];
          	}
          	print "---\n";
          	foreach my $lj($r_s..$r_e) {
          		print "> ".$linef2[$lj-1];
          	}
          }
          if ($tp eq "a") {
          	print $l_e."a".$r_s.",".$r_e."\n";
          	foreach my $lj($r_s..$r_e) {
          		print "> ".$linef2[$lj-1];
          	}
          }
          if ($tp eq "d") {
          	print $l_s.",".$l_e."d".$r_s."\n";
          	foreach my $lj($l_s..$l_e) {
          		print "< ".$linef1[$lj-1];
          	}
          }
    	  }
    	}
    }
  }
}

exit(1);

# ---------------
# ...functions...
# ---------------

sub intersection {
	# returns [x,y] the inters interval between [a,b] and [c,d]
	# returns [-1,-1] if no intersection happens
	#
	my $a=shift;
	my $b=shift;
	my $c=shift;
	my $d=shift;
	my @retval=();
	$retval[0]=-1;
	$retval[1]=-1;
	if ($a<=$c && $b>=$c) {
		$retval[0]=$c;
	}
	if ($c<=$a && $d>=$a) {
		$retval[0]=$a;
	}
	if ($b>=$d && $a<=$d) {
		$retval[1]=$d;
	}
	if ($d>=$b && $c<=$b) {
		$retval[1]=$b;
	}
	return @retval;
}

sub compose {
	my(%gout)=%{$_[0]};
	my(%cout)=%{$_[1]};

  my %composite=();
	if ((scalar keys %gout)==0) {
		return %cout;
	} else {
    foreach my $f1(keys %gout) {
	    foreach my $f2(keys %{$gout{$f1}}) {
        foreach my $ls(keys %{$gout{$f1}{$f2}}) {
    	    foreach my $tn(keys %{$gout{$f1}{$f2}{$ls}}) {
   	  	    my ($l_s,$l_e,$tp,$r_s,$r_e,$file1,$file2) = $gout{$f1}{$f2}{$ls}{$tn} =~ /(\d+),(\d+)([adcu])(\d+),(\d+)\:(.*)\;(.*)/;
 	  	    	foreach my $f3(keys %{$cout{$f2}}) {
 	  	    		foreach my $ls2(keys %{$cout{$f2}{$f3}}) {
 	  	    			foreach my $tn2(keys %{$cout{$f2}{$f3}{$ls2}}) {
     	    	      my ($l_s2,$l_e2,$tp2,$r_s2,$r_e2,$file12,$file22) = $cout{$f2}{$f3}{$ls2}{$tn2} =~ /(\d+),(\d+)([adcu])(\d+),(\d+)\:(.*)\;(.*)/;
     	    	      #print "$l_s,$l_e$tp$r_s,$r_e->$l_s2,$l_e2$tp2$r_s2,$r_e2 ($f1,$file12,$file22)\n";
     	    	      my @com=intersection($r_s,$r_e,$l_s2,$l_e2);
   	  	          if ($com[0]==-1 && $com[1]==-1) {
   	  	          	next;
   	  	          }
   	  	          
   	  	          my $r_s_new=$r_s2+($com[0]-$l_s2);
   	  	          my $r_e_new=$r_s2+($com[1]-$l_s2);
   	  	          my $l_s_new=$l_s+($com[0]-$r_s);
   	  	          my $l_e_new=$l_s+($com[1]-$r_s);
                  #print "$l_s_new,$l_e_new $tp->$tp2 $r_s_new,$r_s_new\n";
   	  	          if (($tp eq "d" || $tp eq "a") && !($tp2 eq "d")) {
   	  	    				$composite{$f1}{$f3}{$ls}{$tn}=$l_s_new.",".$l_e_new."$tp".$r_s_new.",".$r_e_new.":".$f1.";".$f2."\n";
   	  	    			} else {
   	  	    				if ($tp2 eq "d" && !($tp eq "a")) {
   	  	    					$composite{$f1}{$f3}{$ls}{$tn}=$l_s_new.",".$l_e_new."d".$r_s_new.",".$r_e_new.":".$f1.";".$f2."\n";
   	  	    				} else {
   	  	    					my $tp_new=$tp!=$tp2 ? "c" : $tp;
   	  	    					$composite{$f1}{$f3}{$ls}{$tn}=$l_s_new.",".$l_e_new."$tp_new".$r_s_new.",".$r_e_new.":".$f1.";".$f2."\n";   	  	    					
   	  	    				}
   	  	    			}
   	  	        }
   	  	    	}
   	  	    }
   	      }
   	    }
      }
    }
  }
  return %composite;
}
sub tokenize {
	my $htype=$_[0];
  my $file=$_[1];
  my $inizio=$_[2]; # start of range
  my $fine=$_[3];   # end of range
  my $D=$_[4];      # number of documents to compute the tf-idf

  #print "TOKENIZER (FILE=$file, START=$inizio, END=$fine)\n" if $verbose;
# deve ritornare un hash table di token con il peso...

  my %tokens=();
  my $size=$fine-$inizio+1;
  my @lines=`$cat_cmd \"$file\" | $head_cmd -$fine | $tail_cmd -$size`;
  
  my $textLines="";
  foreach my $ld(@lines) {
  	$textLines.=$ld;
  	#print $ld;
  }

  # Language lexer 
 	if ($htype eq "cpp") {
    if ($java) {
      my $LT = new LanguageTokenizer();
      my $cpp_tokens=$LT->getTokens("cpp",$textLines);
      #print $cpp_tokens."\n";
      while ($cpp_tokens=~ /(\d+)/g) {
    	  if (exists $tokens{$1}) {
          $tokens{$1}++;
        } else {
          $tokens{$1}=1;
        }
      }
    } else {
      print "... no Inline::Java module found -- using word instead\n" if $verbose;
      $htype="word";
    }    		   		
  }
  
  
  if ($htype eq "ngram") {
    if ($ngram) {
    	my $ng3 = Text::Ngrams->new( type => word, windowsize => 3 );
    	$ng3->process_text($textLines);
      my @actualGrams=$ng3->get_ngrams(normalize=>1);
      my $iii=0;
      my $ngram="";
      foreach $r(@actualGrams) {
        $occ=$r;
        if ($iii % 2 != 0) {
        	#print $ngram." -> ".$occ."\n";
          $tokens{$ngram}=$occ;
        }
        $ngram=$occ;
        $iii++;
      }
    } else {
      print "... no Text::Ngrams module found -- using lword instead\n" if $verbose;
      $htype="word";
    }    		
  }  
  
  
  if ($htype eq "word") {
    #my $size=$fine-$inizio+1;
#    print "$file $inizio $fine $size\n";

    while ($textLines=~/(\w+)/g) {
#    	print $1." ";
    	if (exists $tokens{$1}) {
        $tokens{$1}++;
      } else {
        $tokens{$1}=1;
      }
    }
  }
  my $nt=scalar keys %tokens;
  foreach my $t(keys %tokens) {
  	#print $t;
  	my $tocc=$tokens{$t};
    my $idf=log($D/$tocc);
    $tokens{$t}=$idf * $tocc/$nt;
  }

  return \%tokens;
}

sub range_similarity {
	# calcola il coseno tra due vettori delle tf-idf di termini
	# i vettori sono in una hash
  my $method = $_[0];
  my %termsDel=%{$_[1]};
  my %termsAdd=%{$_[2]};

  my $n1=scalar keys %termsAdd;
  my $n2=scalar keys %termsDel;
  
  if ($n1==0 && $n2==0) {
  	return 1;
  }
  if ($n1==0 || $n2==0) {
  	print "... range similarity warning |$n2| != |$n1|\n" if $verbose;
    return 0;
  }
  
  #print "  ADD=";
  my $norm2=0;
  foreach my $ta(keys %termsAdd) {
  	#print $ta." ";
      $norm2+=$termsAdd{$ta}*$termsAdd{$ta};
  }  
  #print "\n";
  
  my $inner=0;
  my $norm1=0;
  #print "  DEL=";
  foreach my $td(keys %termsDel) {
  	#print $td." ";  	
    $norm1+=$termsDel{$td}*$termsDel{$td};
    if (exists $termsAdd{$td}) {
   	  $inner += $termsDel{$td} * $termsAdd{$td};
    }
  }
  #print "\n";  
  
  if ($method eq "jaccard") {
    return $inner/($norm1+$norm2-$inner); # extended Jaccard measure (Strehl and Ghosh 2000)
  } else {
  	if ($method eq "overlap") {
  		my $minim = $norm1>$norm2 ? $norm2 : $norm1;
  		return $inner/$minim;
  	} else {
  	  return $inner/(sqrt($norm1)*sqrt($norm2));  
    }
  }
}

@delFileLines=();
$delFilename="";
@addFileLines=();
$addFilename="";
sub chg_thin {
  my(%changes)= %{$_[0]};

  my @partialAdds=();
  my @partialDels=();
  my @ret_changes=();

  

  my $lastDLine=$changes{l_end};
  my $lastALine=$changes{r_end};
  
  my $Dsize=$changes{l_end}-$changes{l_start}+1;
  my $Asize=$changes{r_end}-$changes{r_start}+1;

  if (!($delFilename eq $changes{file1})) {
  	@delFileLines=`$cat_cmd \"$changes{file1}\"`; 
  	$delFilename=$changes{file1};
  	#print $delFilename."\n";
  }
  
  if (!($addFilename eq $changes{file2})) {
  	
  	@addFileLines=`$cat_cmd \"$changes{file2}\"`; 
  	$addFilename=$changes{file2};
  	#print $addFilename."\n";
  }
  
  my @delLines=();
  my @addLines=();
  my $oi=0;
  foreach my $lii(($lastDLine-$Dsize)..($lastDLine-1)) {
  	$delLines[$oi]=$delFileLines[$lii];
  	#print "del)$delLines[$oi]";
  	$oi++;
  }
  $oi=0;
  foreach my $lii(($lastALine-$Asize)..($lastALine-1)) {
  	$addLines[$oi]=$addFileLines[$lii];
  	#print "add)$addLines[$oi]";
  	$oi++;
  }

  #my @delLines=`/usr/bin/cat \"$changes{file1}\" | /usr/bin/head -$lastDLine | /usr/bin/tail -$Dsize`;
  #my @addLines=`/usr/bin/cat \"$changes{file2}\" | /usr/bin/head -$lastALine | /usr/bin/tail -$Asize`;
  
  #print "]]]$changes{l_start},$changes{l_end}c$changes{r_start},$changes{r_end}\n";
  
  my @LDS=();
  foreach my $ldi(0..$#delLines) {
  	$ld=$delLines[$ldi];
  	$ldLen=length($ld);
    foreach my $laj(0..$#addLines) {
    	$la=$addLines[$laj];
    	$laLen=length($la);
    	
    	# token or character based distance?
    	
    	my %tokens=();
    	my $currentTok=0;
    	$laString="";
    	$ldString="";

      # Ngram tokens 
    	if ($Ltype eq "ngram") {
       	 my @lachars = split(//, $la);
         for my $r(2..$#lachars) {
         	 $tok=$lachars[$r-2].$lachars[$r-1].$lachars[$r];
   			   if (!(exists $tokens{$tok})) {
   				   $tokens{$tok}=$currentTok;
   				   $currentTok++;
   			   }
   			   $laString .= chr(32+$tokens{$tok});
         }
       	 my @ldchars = split(//, $ld);
         for my $r(2..$#ldchars) {
         	 $tok=$ldchars[$r-2].$ldchars[$r-1].$ldchars[$r];
   			   if (!(exists $tokens{$tok})) {
   				   $tokens{$tok}=$currentTok;
   				   $currentTok++;
   			   }
   			   $ldString .= chr(32+$tokens{$tok});
         }
    		 $la=$laString;
    		 $ld=$ldString;    			 
    	}
    	

      # Language lexer tokens
    	if ($Ltype eq "cpp") {
       if ($java) {
        my $LT = new LanguageTokenizer();
        my $ld_tokens=$LT->getTokens("cpp",$ld);
        while ($ld_tokens =~ m/(\d+)/g) {
    			my $tok=$1;
    			if (!(exists $tokens{"".$tok})) {
    				$tokens{"".$tok}=$currentTok;
    				$currentTok++;
    			}
    			$laString .= chr(32+$tokens{$tok});

        }
        my $la_tokens=$LT->getTokens("cpp",$la);
        while ( $la_tokens =~ m/(\d+)/g) {
    			my $tok=$1;
    			if (!(exists $tokens{"".$tok})) {
    				$tokens{"".$tok}=$currentTok;
    				$currentTok++;
    			}
    			$ldString .= chr(32+$tokens{$tok});
        }
    		$la=$laString;
    		$ld=$ldString; 
    			#print length($ldString)." -> ".length($laString);    		
    	 } else {
    		 print "  >no Inline::Java module found -- using word instead\n" if $verbose;
    		 $Ltype="word";
    	 }    		
    	}
    	
    	# word tokens
    	if ($Ltype eq "word") {
    		while ($ld =~ m/(\w+)/g) {
    			my $tok=$1;
    			if (!(exists $tokens{$tok})) {
    				$tokens{$tok}=$currentTok;
    				$currentTok++;
    			}
    			#print "LA: ".$tok." ($tokens{$tok})\n";
    			$laString .= chr(32+$tokens{$tok});
    		}
    		while ($la =~ m/(\w+)/g) {
    			my $tok=$1;
    			
    			if (!(exists $tokens{$tok})) {
    				$tokens{$tok}=$currentTok;
    				$currentTok++;
    			}
    			#print "LD: ".$tok." ($tokens{$tok})\n";
    			$ldString .= chr(32+$tokens{$tok});
    		}   
    		$la=$laString;
    		$ld=$ldString; 		
    		#print "$la --> $ld\n";
    	}
    	
    	
   # line metric: Levensthein distance
    	if ($Lmetric eq "leven") {
    		
    	  if ($fast) {
    	    $LD=Text::LevenshteinXS::distance($ld, $la); 
        } else {
      	  $LD=levenshtein($ld, $la); 
        }
    	  $maxLen= $ldLen > $laLen ? $ldLen : $laLen;
    	  $NLD=($maxLen-$LD)/$maxLen;
    	}

    	# String match
    	if ($Lmetric eq "smatch") {
# TODO
    	}

    	
    	push @LDS, {i=>$ldi, j=>$laj, NLD=>$NLD};
    	$asterix=" ";
    	if ($NLD>=$tleven) {
    		$asterix="*";
    	}
      print "   $asterix $ldi<->$laj ($NLD)\n"  if ($verbose);    	
      #print "   ADD: $la";    	
      #print "   DEL: $ld";    	
    }
  }
  
  my $sd=0;
  my $sa=0;
  my %chg_candidate=();
  $chg_candidate->{NLD}=0;
  $chg_candidate->{i}=-1;
  $chg_candidate->{j}=-1;  
  $lasti=-1;
  $lastj=-1;
  while ($sd <= $#delLines && $sa <= $#addLines) {
  	$topd=($#delLines+$#addLines);
    $chg_candidate->{NLD}=0;
    # seleziona il candidato i-esimo

  	foreach $lds(@LDS) {
  		if ($lds->{i}>$lasti && $lds->{j}>$lastj) {

  		  $currtd=($lds->{i}+$lds->{j})/2;
  		  if ($lds->{NLD} >= $chg_candidate->{NLD}) {
  		    if ($lds->{NLD} == $chg_candidate->{NLD} && $currtd<$topd) { # usa la distanza solo nei casi di uguaglianza tra candidati
  		      $topd=$currtd;
  		      $chg_candidate=$lds;
#print "  CANDIDATE=: $chg_candidate->{i},$chg_candidate->{j} ($chg_candidate->{NLD}) $topd\n";  		          		      
  		    } else {
  		  	  if ($lds->{NLD} > $chg_candidate->{NLD}) {
  		        $topd=$currtd;
  		        $chg_candidate=$lds;  		  		
#print "  CANDIDATE>: $chg_candidate->{i},$chg_candidate->{j} ($chg_candidate->{NLD})  $topd\n";  		        
  		  	  }
  		    }
  	    }
  	  }
#print "    $lds->{i}, $lds->{j} $lds->{NLD} --- $chg_candidate->{i},$chg_candidate->{j} $chg_candidate->{NLD}\n";  		          		        			  		  	  
  	}
    $lasti=$chg_candidate->{i};
    $lastj=$chg_candidate->{j};

  	if ($chg_candidate->{NLD}>=$tleven) {
#print "   BEST MATCH: $chg_candidate->{i}<->$chg_candidate->{j} (>=$tleven distance=$currtd NLD=$chg_candidate->{NLD})\n" if ($verbose);  		
  		# aggiunge il change
  		push @ret_changes, { file1=>$changes{file1}, rev1=>$changes{rev1}, file2=>$changes{file2}, rev2=>$changes{rev2},
  			                   l_start=>$changes{l_start}+$chg_candidate->{i} , l_end=>$changes{l_start}+$chg_candidate->{i}, 
  			                   r_start=>$changes{r_start}+$chg_candidate->{j} , r_end=>$changes{r_start}+$chg_candidate->{j} };
  		#print ">>>$ret_changes[$#ret_changes]{l_start},$ret_changes[$#ret_changes]{l_end}c$ret_changes[$#ret_changes]{r_start},$ret_changes[$#ret_changes]{r_end}\n"  if ($verbose);
  
  		if (($chg_candidate->{i}-$sd) > 0) {
   		  push @partialDels, { file1=>$changes{file1}, rev1=>$changes{rev1}, file2=>$changes{file2}, rev2=>$changes{rev2},
  			                     l_start=>$changes{l_start}+$sd, l_end=>$changes{l_start}+$chg_candidate->{i}-1, 
  			                     r_start=>$changes{r_start}+$sa-1 , r_end=>$changes{r_start}+$sa-1 };
        #print ">>>$partialDels[$#partialDels]{l_start},$partialDels[$#partialDels]{l_end}d$partialDels[$#partialDels]{r_start},$partialDels[$#partialDels]{r_end}\n"  if ($verbose);  			                     	
   	  }
   	  if (($chg_candidate->{j}-$sa) > 0) {
   		  push @partialAdds, { file1=>$changes{file1}, rev1=>$changes{rev1}, file2=>$changes{file2}, rev2=>$changes{rev2},
  			                     l_start=>$changes{l_start}+$sd-1, l_end=>$changes{l_start}+$sd-1, 
  			                     r_start=>$changes{r_start}+$sa , r_end=>$changes{r_start}+$chg_candidate->{j}-1 };
        #print ">>>$partialAdds[$#partialAdds]{l_start},$partialAdds[$#partialAdds]{l_end}a$partialAdds[$#partialAdds]{r_start},$partialAdds[$#partialAdds]{r_end}\n";  			                     	
  	  }
  	} else {
  		$chg_candidate->{i}=$#delLines+1;
  		$chg_candidate->{j}=$#addLines+1;
  		if (($chg_candidate->{i}-$sd) > 0) {
   		  push @partialDels, { file1=>$changes{file1}, rev1=>$changes{rev1}, file2=>$changes{file2}, rev2=>$changes{rev2},
  			                     l_start=>$changes{l_start}+$sd, l_end=>$changes{l_start}+$chg_candidate->{i}-1, 
  			                     r_start=>$changes{r_start}+$sa-1 , r_end=>$changes{r_start}+$sa-1 };
        #print ">>>$partialDels[$#partialDels]{l_start},$partialDels[$#partialDels]{l_end}d$partialDels[$#partialDels]{r_start},$partialDels[$#partialDels]{r_end}\n";  			                     	  			                     	
   		}
   		if (($chg_candidate->{j}-$sa) > 0) {
   		  push @partialAdds, { file1=>$changes{file1}, rev1=>$changes{rev1}, file2=>$changes{file2}, rev2=>$changes{rev2},
  			                     l_start=>$changes{l_start}+$sd-1, l_end=>$changes{l_start}+$sd-1, 
  			                     r_start=>$changes{r_start}+$sa , r_end=>$changes{r_start}+$chg_candidate->{j}-1 };
        #print ">>>$partialAdds[$#partialAdds]{l_start},$partialAdds[$#partialAdds]{l_end}a$partialAdds[$#partialAdds]{r_start},$partialAdds[$#partialAdds]{r_end}\n";  			                     	  			                     	
   	  }
  	}
  	$sd=$chg_candidate->{i}+1;
  	$sa=$chg_candidate->{j}+1;  	
  }
  

  # aggiunta degli altri del e add
  $chg_candidate->{i}=$#delLines+1;
  $chg_candidate->{j}=$#addLines+1;
  if ($sa > $#addLines && $sd<=$#delLines) {
	  push @partialDels, { file1=>$changes{file1}, rev1=>$changes{rev1}, file2=>$changes{file2}, rev2=>$changes{rev2},
  			                     l_start=>$changes{l_start}+$sd, l_end=>$changes{l_start}+$chg_candidate->{i}-1, 
  			                     r_start=>$changes{r_start}+$sa-1 , r_end=>$changes{r_start}+$sa-1 };
    #print ">>>>$partialDels[$#partialDels]{l_start},$partialDels[$#partialDels]{l_end}d$partialDels[$#partialDels]{r_start},$partialDels[$#partialDels]{r_end}\n";  			                     	  			                     	
	}
	if ($sa <= $#addLines && $sd>$#delLines) {
	  push @partialAdds, { file1=>$changes{file1}, rev1=>$changes{rev1}, file2=>$changes{file2}, rev2=>$changes{rev2},
  			                     l_start=>$changes{l_start}+$sd-1, l_end=>$changes{l_start}+$sd-1, 
  			                     r_start=>$changes{r_start}+$sa , r_end=>$changes{r_start}+$chg_candidate->{j}-1 };
        #print ">>>>$partialAdds[$#partialAdds]{l_start},$partialAdds[$#partialAdds]{l_end}a$partialAdds[$#partialAdds]{r_start},$partialAdds[$#partialAdds]{r_end}\n";  			                     	  			                     	
  }
  

  return (\@partialAdds, \@partialDels, \@ret_changes);
}


sub trim {
  my $string = shift;
  $string =~ s/^\s+//;
  $string =~ s/\s+$//;
  return $string;
}

# Return the Levenshtein distance (also called Edit distance) 
# between two strings
#
# The Levenshtein distance (LD) is a measure of similarity between two
# strings, denoted here by s1 and s2. The distance is the number of
# deletions, insertions or substitutions required to transform s1 into
# s2. The greater the distance, the more different the strings are.
#
# The algorithm employs a proximity matrix, which denotes the distances
# between substrings of the two given strings. Read the embedded comments
# for more info. If you want a deep understanding of the algorithm, print
# the matrix for some test strings and study it
#
# The beauty of this system is that nothing is magical - the distance
# is intuitively understandable by humans
#
# The distance is named after the Russian scientist Vladimir
# Levenshtein, who devised the algorithm in 1965
#
sub levenshtein
{
    # $s1 and $s2 are the two strings
    # $len1 and $len2 are their respective lengths
    #
    my ($s1, $s2) = @_;
    my ($len1, $len2) = (length $s1, length $s2);

    # If one of the strings is empty, the distance is the length
    # of the other string
    #
    return $len2 if ($len1 == 0);
    return $len1 if ($len2 == 0);

    my %mat;

    # Init the distance matrix
    #
    # The first row to 0..$len1
    # The first column to 0..$len2
    # The rest to 0
    #
    # The first row and column are initialized so to denote distance
    # from the empty string
    #
    for (my $i = 0; $i <= $len1; ++$i)
    {
        for (my $j = 0; $j <= $len2; ++$j)
        {
            $mat{$i}{$j} = 0;
            $mat{0}{$j} = $j;
        }

        $mat{$i}{0} = $i;
    }

    # Some char-by-char processing is ahead, so prepare
    # array of chars from the strings
    #
    my @ar1 = split(//, $s1);
    my @ar2 = split(//, $s2);

    for (my $i = 1; $i <= $len1; ++$i)
    {
        for (my $j = 1; $j <= $len2; ++$j)
        {
            # Set the cost to 1 iff the ith char of $s1
            # equals the jth of $s2
            # 
            # Denotes a substitution cost. When the char are equal
            # there is no need to substitute, so the cost is 0
            #
            my $cost = ($ar1[$i-1] eq $ar2[$j-1]) ? 0 : 1;

            # Cell $mat{$i}{$j} equals the minimum of:
            #
            # - The cell immediately above plus 1
            # - The cell immediately to the left plus 1
            # - The cell diagonally above and to the left plus the cost
            #
            # We can either insert a new char, delete a char or
            # substitute an existing char (with an associated cost)
            #
            $mat{$i}{$j} = min([$mat{$i-1}{$j} + 1,
                                $mat{$i}{$j-1} + 1,
                                $mat{$i-1}{$j-1} + $cost]);
        }
    }

    # Finally, the Levenshtein distance equals the rightmost bottom cell
    # of the matrix
    #
    # Note that $mat{$x}{$y} denotes the distance between the substrings
    # 1..$x and 1..$y
    #
    return $mat{$len1}{$len2};
}


# minimal element of a list
#
sub min
{
    my @list = @{$_[0]};
    my $min = $list[0];

    foreach my $i (@list)
    {
        $min = $i if ($i < $min);
    }

    return $min;
}

__DATA__
__Java__

/* Generated By:JavaCC: Do not edit this line. CPPParser.java */
//package net.sourceforge.pmd.cpd.cppast;

public class LanguageTokenizer {
	public LanguageTokenizer() {
	}
	
  public String getTokens(String lang, String code) {

    try {
      CPPParser parser;
      parser = new CPPParser(new java.io.StringReader(code));

      int end=1;
      String retval="";
      while(end!=0) {
         Token i=parser.getNextToken();
         end=i.kind;
         if(end!=0)
           retval=retval+i.kind+" ";
      }
      return retval;
    } catch (Throwable t) {
    	System.out.println("Error");
    	return "";
    }
  }	
}

/* Generated By:JavaCC: Do not edit this line. CPPParserConstants.java */
 interface CPPParserConstants {

  int EOF = 0;
  int PINCLUDE = 19;
  int PDEFINE = 20;
  int PIFDEF = 21;
  int PIFNDEF = 22;
  int PIF = 23;
  int PENDIF = 24;
  int PELSE = 25;
  int PELIF = 26;
  int PLINE = 27;
  int PERROR = 28;
  int PPRAGMA = 29;
  int PUNDEF = 30;
  int LCURLYBRACE = 31;
  int RCURLYBRACE = 32;
  int LSQUAREBRACKET = 33;
  int RSQUAREBRACKET = 34;
  int LPARENTHESIS = 35;
  int RPARENTHESIS = 36;
  int SCOPE = 37;
  int COLON = 38;
  int SEMICOLON = 39;
  int COMMA = 40;
  int QUESTIONMARK = 41;
  int ELLIPSIS = 42;
  int ASSIGNEQUAL = 43;
  int TIMESEQUAL = 44;
  int DIVIDEEQUAL = 45;
  int MODEQUAL = 46;
  int PLUSEQUAL = 47;
  int MINUSEQUAL = 48;
  int SHIFTLEFTEQUAL = 49;
  int SHIFTRIGHTEQUAL = 50;
  int BITWISEANDEQUAL = 51;
  int BITWISEXOREQUAL = 52;
  int BITWISEOREQUAL = 53;
  int OR = 54;
  int AND = 55;
  int BITWISEOR = 56;
  int BITWISEXOR = 57;
  int AMPERSAND = 58;
  int EQUAL = 59;
  int NOTEQUAL = 60;
  int LESSTHAN = 61;
  int GREATERTHAN = 62;
  int LESSTHANOREQUALTO = 63;
  int GREATERTHANOREQUALTO = 64;
  int SHIFTLEFT = 65;
  int SHIFTRIGHT = 66;
  int PLUS = 67;
  int MINUS = 68;
  int STAR = 69;
  int DIVIDE = 70;
  int MOD = 71;
  int PLUSPLUS = 72;
  int MINUSMINUS = 73;
  int TILDE = 74;
  int NOT = 75;
  int DOT = 76;
  int DOLLAR = 77;
  int POINTERTO = 78;
  int DOTSTAR = 79;
  int ARROWSTAR = 80;
  int AUTO = 81;
  int BREAK = 82;
  int CASE = 83;
  int CATCH = 84;
  int CHAR = 85;
  int CONST = 86;
  int CONTINUE = 87;
  int _DEFAULT = 88;
  int DELETE = 89;
  int DO = 90;
  int DOUBLE = 91;
  int ELSE = 92;
  int ENUM = 93;
  int EXTERN = 94;
  int FLOAT = 95;
  int FOR = 96;
  int FRIEND = 97;
  int GOTO = 98;
  int IF = 99;
  int INLINE = 100;
  int INT = 101;
  int LONG = 102;
  int NEW = 103;
  int PRIVATE = 104;
  int PROTECTED = 105;
  int PUBLIC = 106;
  int REDECLARED = 107;
  int REGISTER = 108;
  int RETURN = 109;
  int SHORT = 110;
  int SIGNED = 111;
  int SIZEOF = 112;
  int STATIC = 113;
  int STRUCT = 114;
  int CLASS = 115;
  int SWITCH = 116;
  int TEMPLATE = 117;
  int THIS = 118;
  int TRY = 119;
  int TYPEDEF = 120;
  int UNION = 121;
  int UNSIGNED = 122;
  int VIRTUAL = 123;
  int VOID = 124;
  int VOLATILE = 125;
  int WHILE = 126;
  int OPERATOR = 127;
  int TRUETOK = 128;
  int FALSETOK = 129;
  int THROW = 130;
  int OCTALINT = 131;
  int OCTALLONG = 132;
  int UNSIGNED_OCTALINT = 133;
  int UNSIGNED_OCTALLONG = 134;
  int DECIMALINT = 135;
  int DECIMALLONG = 136;
  int UNSIGNED_DECIMALINT = 137;
  int UNSIGNED_DECIMALLONG = 138;
  int HEXADECIMALINT = 139;
  int HEXADECIMALLONG = 140;
  int UNSIGNED_HEXADECIMALINT = 141;
  int UNSIGNED_HEXADECIMALLONG = 142;
  int FLOATONE = 143;
  int FLOATTWO = 144;
  int CHARACTER = 145;
  int STRING = 146;
  int ID = 147;

  int DEFAULT = 0;
  int IN_LINE_COMMENT = 1;
  int IN_COMMENT = 2;
  int PREPROCESSOR_OUTPUT = 3;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\\\\\r\"",
    "\"\\\\\\r\\n\"",
    "\"\\\\\\n\"",
    "\"\\t\"",
    "\"\\r\\n\"",
    "\"\\n\"",
    "\"\\f\"",
    "\"//\"",
    "\"/*\"",
    "\"\\n\"",
    "<token of kind 12>",
    "\"*/\"",
    "<token of kind 14>",
    "\"\\n\"",
    "\"\\\\\\n\"",
    "\"\\\\\\r\\n\"",
    "<token of kind 18>",
    "<PINCLUDE>",
    "<PDEFINE>",
    "<PIFDEF>",
    "<PIFNDEF>",
    "<PIF>",
    "<PENDIF>",
    "<PELSE>",
    "<PELIF>",
    "<PLINE>",
    "<PERROR>",
    "<PPRAGMA>",
    "<PUNDEF>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"::\"",
    "\":\"",
    "\";\"",
    "\",\"",
    "\"?\"",
    "\"...\"",
    "\"=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"+=\"",
    "\"-=\"",
    "\"<<=\"",
    "\">>=\"",
    "\"&=\"",
    "\"^=\"",
    "\"|=\"",
    "\"||\"",
    "\"&&\"",
    "\"|\"",
    "\"^\"",
    "\"&\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"<<\"",
    "\">>\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"++\"",
    "\"--\"",
    "\"~\"",
    "\"!\"",
    "\".\"",
    "\"$\"",
    "\"->\"",
    "\".*\"",
    "\"->*\"",
    "\"auto\"",
    "\"break\"",
    "\"case\"",
    "\"catch\"",
    "\"char\"",
    "\"const\"",
    "\"continue\"",
    "\"default\"",
    "\"delete\"",
    "\"do\"",
    "\"double\"",
    "\"else\"",
    "\"enum\"",
    "\"extern\"",
    "\"float\"",
    "\"for\"",
    "\"friend\"",
    "\"goto\"",
    "\"if\"",
    "\"inline\"",
    "\"int\"",
    "\"long\"",
    "\"new\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"redeclared\"",
    "\"register\"",
    "\"return\"",
    "\"short\"",
    "\"signed\"",
    "\"sizeof\"",
    "\"static\"",
    "\"struct\"",
    "\"class\"",
    "\"switch\"",
    "\"template\"",
    "\"this\"",
    "\"try\"",
    "\"typedef\"",
    "\"union\"",
    "\"unsigned\"",
    "\"virtual\"",
    "\"void\"",
    "\"volatile\"",
    "\"while\"",
    "\"operator\"",
    "\"true\"",
    "\"false\"",
    "\"throw\"",
    "<OCTALINT>",
    "<OCTALLONG>",
    "<UNSIGNED_OCTALINT>",
    "<UNSIGNED_OCTALLONG>",
    "<DECIMALINT>",
    "<DECIMALLONG>",
    "<UNSIGNED_DECIMALINT>",
    "<UNSIGNED_DECIMALLONG>",
    "<HEXADECIMALINT>",
    "<HEXADECIMALLONG>",
    "<UNSIGNED_HEXADECIMALINT>",
    "<UNSIGNED_HEXADECIMALLONG>",
    "<FLOATONE>",
    "<FLOATTWO>",
    "<CHARACTER>",
    "<STRING>",
    "<ID>",
  };

}
/* Generated By:JavaCC: Do not edit this line. CPPParser.java */
//package net.sourceforge.pmd.cpd.cppast;

 final class CPPParser implements CPPParserConstants {

  private static String vers = "0.1";
  private static String id = "C++ Parser";

  private static void msg(String s) {
      System.out.println(id + " Version " + vers +": " + s);
  }

  public static void main(String args[]) {
    CPPParser parser;
    java.io.InputStream input;

    int ai = 0;

    if (ai == (args.length-1)) {
      try {
        System.err.println("Analyzing "+args[ai]);
        input = new java.io.FileInputStream(args[ai]);
      } catch (java.io.FileNotFoundException e) {
        msg("File " + args[0] + " not found.");
        return;
      }
    } else if (ai >= args.length) {
      input = System.in;
    } else {
      msg("Usage: java " + id + " [-d] [inputfile]");
      return;
    }


      parser = new CPPParser(input);
        int end=1;
     while(end!=0)
        {

           Token i=parser.getNextToken();
           end=i.kind;
           if(end!=0)
           System.out.print(i.kind+" ");
        };
      System.out.println();

  }

  public CPPParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static private int[] jj_la1_4;
  static {
      jj_la1_0();
      jj_la1_1();
      jj_la1_2();
      jj_la1_3();
      jj_la1_4();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {};
   }
   private static void jj_la1_2() {
      jj_la1_2 = new int[] {};
   }
   private static void jj_la1_3() {
      jj_la1_3 = new int[] {};
   }
   private static void jj_la1_4() {
      jj_la1_4 = new int[] {};
   }

  public CPPParser(java.io.InputStream stream) {
     this(stream, null);
  }
  public CPPParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CPPParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  public CPPParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CPPParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  public CPPParser(CPPParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  public void ReInit(CPPParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[148];
    for (int i = 0; i < 148; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
          if ((jj_la1_3[i] & (1<<j)) != 0) {
            la1tokens[96+j] = true;
          }
          if ((jj_la1_4[i] & (1<<j)) != 0) {
            la1tokens[128+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 148; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}
/* Generated By:JavaCC: Do not edit this line. TokenMgrError.java Version 3.0 */
 class TokenMgrError extends Error
{
   /*
    * Ordinals for various reasons why an Error of this type can be thrown.
    */

   /**
    * Lexical error occured.
    */
   static final int LEXICAL_ERROR = 0;

   /**
    * An attempt wass made to create a second instance of a static token manager.
    */
   static final int STATIC_LEXER_ERROR = 1;

   /**
    * Tried to change to an invalid lexical state.
    */
   static final int INVALID_LEXICAL_STATE = 2;

   /**
    * Detected (and bailed out of) an infinite loop in the token manager.
    */
   static final int LOOP_DETECTED = 3;

   /**
    * Indicates the reason why the exception is thrown. It will have
    * one of the above 4 values.
    */
   int errorCode;

   /**
    * Replaces unprintable characters by their espaced (or unicode escaped)
    * equivalents in the given string
    */
   protected static final String addEscapes(String str) {
      StringBuffer retval = new StringBuffer();
      char ch;
      for (int i = 0; i < str.length(); i++) {
        switch (str.charAt(i))
        {
           case 0 :
              continue;
           case '\b':
              retval.append("\\b");
              continue;
           case '\t':
              retval.append("\\t");
              continue;
           case '\n':
              retval.append("\\n");
              continue;
           case '\f':
              retval.append("\\f");
              continue;
           case '\r':
              retval.append("\\r");
              continue;
           case '\"':
              retval.append("\\\"");
              continue;
           case '\'':
              retval.append("\\\'");
              continue;
           case '\\':
              retval.append("\\\\");
              continue;
           default:
              if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                 String s = "0000" + Integer.toString(ch, 16);
                 retval.append("\\u" + s.substring(s.length() - 4, s.length()));
              } else {
                 retval.append(ch);
              }
              continue;
        }
      }
      return retval.toString();
   }

   /**
    * Returns a detailed message for the Error when it is thrown by the
    * token manager to indicate a lexical error.
    * Parameters : 
    *    EOFSeen     : indicates if EOF caused the lexicl error
    *    curLexState : lexical state in which this error occured
    *    errorLine   : line number when the error occured
    *    errorColumn : column number when the error occured
    *    errorAfter  : prefix that was seen before this error occured
    *    curchar     : the offending character
    * Note: You can customize the lexical error message by modifying this method.
    */
   protected static String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar) {
      return("Lexical error at line " +
           errorLine + ", column " +
           errorColumn + ".  Encountered: " +
           (EOFSeen ? "<EOF> " : ("\"" + addEscapes(String.valueOf(curChar)) + "\"") + " (" + (int)curChar + "), ") +
           "after : \"" + addEscapes(errorAfter) + "\"");
   }

   /**
    * You can also modify the body of this method to customize your error messages.
    * For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not
    * of end-users concern, so you can return something like : 
    *
    *     "Internal Error : Please file a bug report .... "
    *
    * from this method for such cases in the release version of your parser.
    */
   public String getMessage() {
      return super.getMessage();
   }

   /*
    * Constructors of various flavors follow.
    */

   public TokenMgrError() {
   }

   public TokenMgrError(String message, int reason) {
      super(message);
      errorCode = reason;
   }

   public TokenMgrError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar, int reason) {
      this(LexicalError(EOFSeen, lexState, errorLine, errorColumn, errorAfter, curChar), reason);
   }
}
/* Generated By:JavaCC: Do not edit this line. Token.java Version 3.0 */
/**
 * Describes the input token stream.
 */

 class Token {

  /**
   * An integer that describes the kind of this token.  This numbering
   * system is determined by JavaCCParser, and a table of these numbers is
   * stored in the file ...Constants.java.
   */
  public int kind;

  /**
   * beginLine and beginColumn describe the position of the first character
   * of this token; endLine and endColumn describe the position of the
   * last character of this token.
   */
  public int beginLine, beginColumn, endLine, endColumn;

  /**
   * The string image of the token.
   */
  public String image;

  /**
   * A reference to the next regular (non-special) token from the input
   * stream.  If this is the last token from the input stream, or if the
   * token manager has not read tokens beyond this one, this field is
   * set to null.  This is true only if this token is also a regular
   * token.  Otherwise, see below for a description of the contents of
   * this field.
   */
  public Token next;

  /**
   * This field is used to access special tokens that occur prior to this
   * token, but after the immediately preceding regular (non-special) token.
   * If there are no such special tokens, this field is set to null.
   * When there are more than one such special token, this field refers
   * to the last of these special tokens, which in turn refers to the next
   * previous special token through its specialToken field, and so on
   * until the first special token (whose specialToken field is null).
   * The next fields of special tokens refer to other special tokens that
   * immediately follow it (without an intervening regular token).  If there
   * is no such token, this field is null.
   */
  public Token specialToken;

  /**
   * Returns the image.
   */
  public String toString()
  {
     return image;
  }

  /**
   * Returns a new Token object, by default. However, if you want, you
   * can create and return subclass objects based on the value of ofKind.
   * Simply add the cases to the switch for all those special cases.
   * For example, if you have a subclass of Token called IDToken that
   * you want to create if ofKind is ID, simlpy add something like :
   *
   *    case MyParserConstants.ID : return new IDToken();
   *
   * to the following switch statement. Then you can cast matchedToken
   * variable to the appropriate type and use it in your lexical actions.
   */
  public static final Token newToken(int ofKind)
  {
     switch(ofKind)
     {
       default : return new Token();
     }
  }

}
/* Generated By:JavaCC: Do not edit this line. SimpleCharStream.java Version 4.0 */
/**
 * An implementation of interface CharStream, where the stream is assumed to
 * contain only ASCII characters (without unicode processing).
 */

 class SimpleCharStream
{
  public static final boolean staticFlag = false;
  int bufsize;
  int available;
  int tokenBegin;
  public int bufpos = -1;
  protected int bufline[];
  protected int bufcolumn[];

  protected int column = 0;
  protected int line = 1;

  protected boolean prevCharIsCR = false;
  protected boolean prevCharIsLF = false;

  protected java.io.Reader inputStream;

  protected char[] buffer;
  protected int maxNextCharInd = 0;
  protected int inBuf = 0;
  protected int tabSize = 8;

  protected void setTabSize(int i) { tabSize = i; }
  protected int getTabSize(int i) { return tabSize; }


  protected void ExpandBuff(boolean wrapAround)
  {
     char[] newbuffer = new char[bufsize + 2048];
     int newbufline[] = new int[bufsize + 2048];
     int newbufcolumn[] = new int[bufsize + 2048];

     try
     {
        if (wrapAround)
        {
           System.arraycopy(buffer, tokenBegin, newbuffer, 0, bufsize - tokenBegin);
           System.arraycopy(buffer, 0, newbuffer,
                                             bufsize - tokenBegin, bufpos);
           buffer = newbuffer;

           System.arraycopy(bufline, tokenBegin, newbufline, 0, bufsize - tokenBegin);
           System.arraycopy(bufline, 0, newbufline, bufsize - tokenBegin, bufpos);
           bufline = newbufline;

           System.arraycopy(bufcolumn, tokenBegin, newbufcolumn, 0, bufsize - tokenBegin);
           System.arraycopy(bufcolumn, 0, newbufcolumn, bufsize - tokenBegin, bufpos);
           bufcolumn = newbufcolumn;

           maxNextCharInd = (bufpos += (bufsize - tokenBegin));
        }
        else
        {
           System.arraycopy(buffer, tokenBegin, newbuffer, 0, bufsize - tokenBegin);
           buffer = newbuffer;

           System.arraycopy(bufline, tokenBegin, newbufline, 0, bufsize - tokenBegin);
           bufline = newbufline;

           System.arraycopy(bufcolumn, tokenBegin, newbufcolumn, 0, bufsize - tokenBegin);
           bufcolumn = newbufcolumn;

           maxNextCharInd = (bufpos -= tokenBegin);
        }
     }
     catch (Throwable t)
     {
        throw new Error(t.getMessage());
     }


     bufsize += 2048;
     available = bufsize;
     tokenBegin = 0;
  }

  protected void FillBuff() throws java.io.IOException
  {
     if (maxNextCharInd == available)
     {
        if (available == bufsize)
        {
           if (tokenBegin > 2048)
           {
              bufpos = maxNextCharInd = 0;
              available = tokenBegin;
           }
           else if (tokenBegin < 0)
              bufpos = maxNextCharInd = 0;
           else
              ExpandBuff(false);
        }
        else if (available > tokenBegin)
           available = bufsize;
        else if ((tokenBegin - available) < 2048)
           ExpandBuff(true);
        else
           available = tokenBegin;
     }

     int i;
     try {
        if ((i = inputStream.read(buffer, maxNextCharInd,
                                    available - maxNextCharInd)) == -1)
        {
           inputStream.close();
           throw new java.io.IOException();
        }
        else
           maxNextCharInd += i;
        return;
     }
     catch(java.io.IOException e) {
        --bufpos;
        backup(0);
        if (tokenBegin == -1)
           tokenBegin = bufpos;
        throw e;
     }
  }

  public char BeginToken() throws java.io.IOException
  {
     tokenBegin = -1;
     char c = readChar();
     tokenBegin = bufpos;

     return c;
  }

  protected void UpdateLineColumn(char c)
  {
     column++;

     if (prevCharIsLF)
     {
        prevCharIsLF = false;
        line += (column = 1);
     }
     else if (prevCharIsCR)
     {
        prevCharIsCR = false;
        if (c == '\n')
        {
           prevCharIsLF = true;
        }
        else
           line += (column = 1);
     }

     switch (c)
     {
        case '\r' :
           prevCharIsCR = true;
           break;
        case '\n' :
           prevCharIsLF = true;
           break;
        case '\t' :
           column--;
           column += (tabSize - (column % tabSize));
           break;
        default :
           break;
     }

     bufline[bufpos] = line;
     bufcolumn[bufpos] = column;
  }

  public char readChar() throws java.io.IOException
  {
     if (inBuf > 0)
     {
        --inBuf;

        if (++bufpos == bufsize)
           bufpos = 0;

        return buffer[bufpos];
     }

     if (++bufpos >= maxNextCharInd)
        FillBuff();

     char c = buffer[bufpos];

     UpdateLineColumn(c);
     return (c);
  }

  /**
   * @deprecated 
   * @see #getEndColumn
   */

  public int getColumn() {
     return bufcolumn[bufpos];
  }

  /**
   * @deprecated 
   * @see #getEndLine
   */

  public int getLine() {
     return bufline[bufpos];
  }

  public int getEndColumn() {
     return bufcolumn[bufpos];
  }

  public int getEndLine() {
     return bufline[bufpos];
  }

  public int getBeginColumn() {
     return bufcolumn[tokenBegin];
  }

  public int getBeginLine() {
     return bufline[tokenBegin];
  }

  public void backup(int amount) {

    inBuf += amount;
    if ((bufpos -= amount) < 0)
       bufpos += bufsize;
  }

  public SimpleCharStream(java.io.Reader dstream, int startline,
  int startcolumn, int buffersize)
  {
    inputStream = dstream;
    line = startline;
    column = startcolumn - 1;

    available = bufsize = buffersize;
    buffer = new char[buffersize];
    bufline = new int[buffersize];
    bufcolumn = new int[buffersize];
  }

  public SimpleCharStream(java.io.Reader dstream, int startline,
                          int startcolumn)
  {
     this(dstream, startline, startcolumn, 4096);
  }

  public SimpleCharStream(java.io.Reader dstream)
  {
     this(dstream, 1, 1, 4096);
  }
  public void ReInit(java.io.Reader dstream, int startline,
  int startcolumn, int buffersize)
  {
    inputStream = dstream;
    line = startline;
    column = startcolumn - 1;

    if (buffer == null || buffersize != buffer.length)
    {
      available = bufsize = buffersize;
      buffer = new char[buffersize];
      bufline = new int[buffersize];
      bufcolumn = new int[buffersize];
    }
    prevCharIsLF = prevCharIsCR = false;
    tokenBegin = inBuf = maxNextCharInd = 0;
    bufpos = -1;
  }

  public void ReInit(java.io.Reader dstream, int startline,
                     int startcolumn)
  {
     ReInit(dstream, startline, startcolumn, 4096);
  }

  public void ReInit(java.io.Reader dstream)
  {
     ReInit(dstream, 1, 1, 4096);
  }
  public SimpleCharStream(java.io.InputStream dstream, String encoding, int startline,
  int startcolumn, int buffersize) throws java.io.UnsupportedEncodingException
  {
     this(encoding == null ? new java.io.InputStreamReader(dstream) : new java.io.InputStreamReader(dstream, encoding), startline, startcolumn, buffersize);
  }

  public SimpleCharStream(java.io.InputStream dstream, int startline,
  int startcolumn, int buffersize)
  {
     this(new java.io.InputStreamReader(dstream), startline, startcolumn, buffersize);
  }

  public SimpleCharStream(java.io.InputStream dstream, String encoding, int startline,
                          int startcolumn) throws java.io.UnsupportedEncodingException
  {
     this(dstream, encoding, startline, startcolumn, 4096);
  }

  public SimpleCharStream(java.io.InputStream dstream, int startline,
                          int startcolumn)
  {
     this(dstream, startline, startcolumn, 4096);
  }

  public SimpleCharStream(java.io.InputStream dstream, String encoding) throws java.io.UnsupportedEncodingException
  {
     this(dstream, encoding, 1, 1, 4096);
  }

  public SimpleCharStream(java.io.InputStream dstream)
  {
     this(dstream, 1, 1, 4096);
  }

  public void ReInit(java.io.InputStream dstream, String encoding, int startline,
                          int startcolumn, int buffersize) throws java.io.UnsupportedEncodingException
  {
     ReInit(encoding == null ? new java.io.InputStreamReader(dstream) : new java.io.InputStreamReader(dstream, encoding), startline, startcolumn, buffersize);
  }

  public void ReInit(java.io.InputStream dstream, int startline,
                          int startcolumn, int buffersize)
  {
     ReInit(new java.io.InputStreamReader(dstream), startline, startcolumn, buffersize);
  }

  public void ReInit(java.io.InputStream dstream, String encoding) throws java.io.UnsupportedEncodingException
  {
     ReInit(dstream, encoding, 1, 1, 4096);
  }

  public void ReInit(java.io.InputStream dstream)
  {
     ReInit(dstream, 1, 1, 4096);
  }
  public void ReInit(java.io.InputStream dstream, String encoding, int startline,
                     int startcolumn) throws java.io.UnsupportedEncodingException
  {
     ReInit(dstream, encoding, startline, startcolumn, 4096);
  }
  public void ReInit(java.io.InputStream dstream, int startline,
                     int startcolumn)
  {
     ReInit(dstream, startline, startcolumn, 4096);
  }
  public String GetImage()
  {
     if (bufpos >= tokenBegin)
        return new String(buffer, tokenBegin, bufpos - tokenBegin + 1);
     else
        return new String(buffer, tokenBegin, bufsize - tokenBegin) +
                              new String(buffer, 0, bufpos + 1);
  }

  public char[] GetSuffix(int len)
  {
     char[] ret = new char[len];

     if ((bufpos + 1) >= len)
        System.arraycopy(buffer, bufpos - len + 1, ret, 0, len);
     else
     {
        System.arraycopy(buffer, bufsize - (len - bufpos - 1), ret, 0,
                                                          len - bufpos - 1);
        System.arraycopy(buffer, 0, ret, len - bufpos - 1, bufpos + 1);
     }

     return ret;
  }

  public void Done()
  {
     buffer = null;
     bufline = null;
     bufcolumn = null;
  }

  /**
   * Method to adjust line and column numbers for the start of a token.
   */
  public void adjustBeginLineColumn(int newLine, int newCol)
  {
     int start = tokenBegin;
     int len;

     if (bufpos >= tokenBegin)
     {
        len = bufpos - tokenBegin + inBuf + 1;
     }
     else
     {
        len = bufsize - tokenBegin + bufpos + 1 + inBuf;
     }

     int i = 0, j = 0, k = 0;
     int nextColDiff = 0, columnDiff = 0;

     while (i < len &&
            bufline[j = start % bufsize] == bufline[k = ++start % bufsize])
     {
        bufline[j] = newLine;
        nextColDiff = columnDiff + bufcolumn[k] - bufcolumn[j];
        bufcolumn[j] = newCol + columnDiff;
        columnDiff = nextColDiff;
        i++;
     } 

     if (i < len)
     {
        bufline[j] = newLine++;
        bufcolumn[j] = newCol + columnDiff;

        while (i++ < len)
        {
           if (bufline[j = start % bufsize] != bufline[++start % bufsize])
              bufline[j] = newLine++;
           else
              bufline[j] = newLine;
        }
     }

     line = bufline[j];
     column = bufcolumn[j];
  }

}
/* Generated By:JavaCC: Do not edit this line. ParseException.java Version 3.0 */
/**
 * This exception is thrown when parse errors are encountered.
 * You can explicitly create objects of this exception type by
 * calling the method generateParseException in the generated
 * parser.
 *
 * You can modify this class to customize your error reporting
 * mechanisms so long as you retain the public fields.
 */
 class ParseException extends Exception {

  /**
   * This constructor is used by the method "generateParseException"
   * in the generated parser.  Calling this constructor generates
   * a new object of this type with the fields "currentToken",
   * "expectedTokenSequences", and "tokenImage" set.  The boolean
   * flag "specialConstructor" is also set to true to indicate that
   * this constructor was used to create this object.
   * This constructor calls its super class with the empty string
   * to force the "toString" method of parent class "Throwable" to
   * print the error message in the form:
   *     ParseException: <result of getMessage>
   */
  public ParseException(Token currentTokenVal,
                        int[][] expectedTokenSequencesVal,
                        String[] tokenImageVal
                       )
  {
    super("");
    specialConstructor = true;
    currentToken = currentTokenVal;
    expectedTokenSequences = expectedTokenSequencesVal;
    tokenImage = tokenImageVal;
  }

  /**
   * The following constructors are for use by you for whatever
   * purpose you can think of.  Constructing the exception in this
   * manner makes the exception behave in the normal way - i.e., as
   * documented in the class "Throwable".  The fields "errorToken",
   * "expectedTokenSequences", and "tokenImage" do not contain
   * relevant information.  The JavaCC generated code does not use
   * these constructors.
   */

  public ParseException() {
    super();
    specialConstructor = false;
  }

  public ParseException(String message) {
    super(message);
    specialConstructor = false;
  }

  /**
   * This variable determines which constructor was used to create
   * this object and thereby affects the semantics of the
   * "getMessage" method (see below).
   */
  protected boolean specialConstructor;

  /**
   * This is the last token that has been consumed successfully.  If
   * this object has been created due to a parse error, the token
   * followng this token will (therefore) be the first error token.
   */
  public Token currentToken;

  /**
   * Each entry in this array is an array of integers.  Each array
   * of integers represents a sequence of tokens (by their ordinal
   * values) that is expected at this point of the parse.
   */
  public int[][] expectedTokenSequences;

  /**
   * This is a reference to the "tokenImage" array of the generated
   * parser within which the parse error occurred.  This array is
   * defined in the generated ...Constants interface.
   */
  public String[] tokenImage;

  /**
   * This method has the standard behavior when this object has been
   * created using the standard constructors.  Otherwise, it uses
   * "currentToken" and "expectedTokenSequences" to generate a parse
   * error message and returns it.  If this object has been created
   * due to a parse error, and you do not catch it (it gets thrown
   * from the parser), then this method is called during the printing
   * of the final stack trace, and hence the correct error message
   * gets displayed.
   */
  public String getMessage() {
    if (!specialConstructor) {
      return super.getMessage();
    }
    StringBuffer expected = new StringBuffer();
    int maxSize = 0;
    for (int i = 0; i < expectedTokenSequences.length; i++) {
      if (maxSize < expectedTokenSequences[i].length) {
        maxSize = expectedTokenSequences[i].length;
      }
      for (int j = 0; j < expectedTokenSequences[i].length; j++) {
        expected.append(tokenImage[expectedTokenSequences[i][j]]).append(" ");
      }
      if (expectedTokenSequences[i][expectedTokenSequences[i].length - 1] != 0) {
        expected.append("...");
      }
      expected.append(eol).append("    ");
    }
    String retval = "Encountered \"";
    Token tok = currentToken.next;
    for (int i = 0; i < maxSize; i++) {
      if (i != 0) retval += " ";
      if (tok.kind == 0) {
        retval += tokenImage[0];
        break;
      }
      retval += add_escapes(tok.image);
      tok = tok.next; 
    }
    retval += "\" at line " + currentToken.next.beginLine + ", column " + currentToken.next.beginColumn;
    retval += "." + eol;
    if (expectedTokenSequences.length == 1) {
      retval += "Was expecting:" + eol + "    ";
    } else {
      retval += "Was expecting one of:" + eol + "    ";
    }
    retval += expected.toString();
    return retval;
  }

  /**
   * The end of line string for this machine.
   */
  protected String eol = System.getProperty("line.separator", "\n");
 
  /**
   * Used to convert raw characters to their escaped version
   * when these raw version cannot be used as part of an ASCII
   * string literal.
   */
  protected String add_escapes(String str) {
      StringBuffer retval = new StringBuffer();
      char ch;
      for (int i = 0; i < str.length(); i++) {
        switch (str.charAt(i))
        {
           case 0 :
              continue;
           case '\b':
              retval.append("\\b");
              continue;
           case '\t':
              retval.append("\\t");
              continue;
           case '\n':
              retval.append("\\n");
              continue;
           case '\f':
              retval.append("\\f");
              continue;
           case '\r':
              retval.append("\\r");
              continue;
           case '\"':
              retval.append("\\\"");
              continue;
           case '\'':
              retval.append("\\\'");
              continue;
           case '\\':
              retval.append("\\\\");
              continue;
           default:
              if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                 String s = "0000" + Integer.toString(ch, 16);
                 retval.append("\\u" + s.substring(s.length() - 4, s.length()));
              } else {
                 retval.append(ch);
              }
              continue;
        }
      }
      return retval.toString();
   }

}
/* Generated By:JavaCC: Do not edit this line. CPPParserTokenManager.java */

 class CPPParserTokenManager implements CPPParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1, long active2)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x40000000000L) != 0L || (active1 & 0x9000L) != 0L)
            return 1;
         if ((active1 & 0xfffffffffffe0000L) != 0L || (active2 & 0x7L) != 0L)
         {
            jjmatchedKind = 147;
            return 33;
         }
         return -1;
      case 1:
         if ((active1 & 0x80c000000L) != 0L)
            return 33;
         if ((active1 & 0xfffffff7f3fe0000L) != 0L || (active2 & 0x7L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 147;
               jjmatchedPos = 1;
            }
            return 33;
         }
         return -1;
      case 2:
         if ((active1 & 0xff7fff56fbfe0000L) != 0L || (active2 & 0x7L) != 0L)
         {
            jjmatchedKind = 147;
            jjmatchedPos = 2;
            return 33;
         }
         if ((active1 & 0x8000a100000000L) != 0L)
            return 33;
         return -1;
      case 3:
         if ((active1 & 0xef3fff12cbd40000L) != 0L || (active2 & 0x6L) != 0L)
         {
            jjmatchedKind = 147;
            jjmatchedPos = 3;
            return 33;
         }
         if ((active1 & 0x10400044302a0000L) != 0L || (active2 & 0x1L) != 0L)
            return 33;
         return -1;
      case 4:
         if ((active1 & 0x4208400080540000L) != 0L || (active2 & 0x6L) != 0L)
            return 33;
         if ((active1 & 0xad37bf124b800000L) != 0L)
         {
            jjmatchedKind = 147;
            jjmatchedPos = 4;
            return 33;
         }
         return -1;
      case 5:
         if ((active1 & 0xad201b0001800000L) != 0L)
         {
            jjmatchedKind = 147;
            jjmatchedPos = 5;
            return 33;
         }
         if ((active1 & 0x17a4124a000000L) != 0L)
            return 33;
         return -1;
      case 6:
         if ((active1 & 0x900010001000000L) != 0L)
            return 33;
         if ((active1 & 0xa4201a0000800000L) != 0L)
         {
            jjmatchedKind = 147;
            jjmatchedPos = 6;
            return 33;
         }
         return -1;
      case 7:
         if ((active1 & 0xa420100000800000L) != 0L)
            return 33;
         if ((active1 & 0xa0000000000L) != 0L)
         {
            jjmatchedKind = 147;
            jjmatchedPos = 7;
            return 33;
         }
         return -1;
      case 8:
         if ((active1 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 147;
            jjmatchedPos = 8;
            return 33;
         }
         if ((active1 & 0x20000000000L) != 0L)
            return 33;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1, long active2)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1, active2), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         return jjMoveStringLiteralDfa1_0(0x40L, 0x0L, 0x0L);
      case 33:
         jjmatchedKind = 75;
         return jjMoveStringLiteralDfa1_0(0x1000000000000000L, 0x0L, 0x0L);
      case 36:
         return jjStopAtPos(0, 77);
      case 37:
         jjmatchedKind = 71;
         return jjMoveStringLiteralDfa1_0(0x400000000000L, 0x0L, 0x0L);
      case 38:
         jjmatchedKind = 58;
         return jjMoveStringLiteralDfa1_0(0x88000000000000L, 0x0L, 0x0L);
      case 40:
         return jjStopAtPos(0, 35);
      case 41:
         return jjStopAtPos(0, 36);
      case 42:
         jjmatchedKind = 69;
         return jjMoveStringLiteralDfa1_0(0x100000000000L, 0x0L, 0x0L);
      case 43:
         jjmatchedKind = 67;
         return jjMoveStringLiteralDfa1_0(0x800000000000L, 0x100L, 0x0L);
      case 44:
         return jjStopAtPos(0, 40);
      case 45:
         jjmatchedKind = 68;
         return jjMoveStringLiteralDfa1_0(0x1000000000000L, 0x14200L, 0x0L);
      case 46:
         jjmatchedKind = 76;
         return jjMoveStringLiteralDfa1_0(0x40000000000L, 0x8000L, 0x0L);
      case 47:
         jjmatchedKind = 70;
         return jjMoveStringLiteralDfa1_0(0x200000000600L, 0x0L, 0x0L);
      case 58:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x2000000000L, 0x0L, 0x0L);
      case 59:
         return jjStopAtPos(0, 39);
      case 60:
         jjmatchedKind = 61;
         return jjMoveStringLiteralDfa1_0(0x8002000000000000L, 0x2L, 0x0L);
      case 61:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x800000000000000L, 0x0L, 0x0L);
      case 62:
         jjmatchedKind = 62;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L, 0x5L, 0x0L);
      case 63:
         return jjStopAtPos(0, 41);
      case 91:
         return jjStopAtPos(0, 33);
      case 92:
         return jjMoveStringLiteralDfa1_0(0x1cL, 0x0L, 0x0L);
      case 93:
         return jjStopAtPos(0, 34);
      case 94:
         jjmatchedKind = 57;
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0x0L, 0x0L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20000L, 0x0L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8000000f80000L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x0L, 0xf000000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x70000000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x380000000L, 0x2L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x400000000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x3800000000L, 0x0L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4000000000L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8000000000L, 0x0L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8000000000000000L, 0x0L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x70000000000L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x380000000000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x17c00000000000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1e0000000000000L, 0x5L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x600000000000000L, 0x0L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x3800000000000000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4000000000000000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 31);
      case 124:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x60000000000000L, 0x0L, 0x0L);
      case 125:
         return jjStopAtPos(0, 32);
      case 126:
         return jjStopAtPos(0, 74);
      default :
         return jjMoveNfa_0(32, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0, long active1, long active2)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1, active2);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         else if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 13:
         if ((active0 & 0x4L) != 0L)
         {
            jjmatchedKind = 2;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x8L, active1, 0L, active2, 0L);
      case 38:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(1, 55);
         break;
      case 42:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         else if ((active1 & 0x8000L) != 0L)
            return jjStopAtPos(1, 79);
         break;
      case 43:
         if ((active1 & 0x100L) != 0L)
            return jjStopAtPos(1, 72);
         break;
      case 45:
         if ((active1 & 0x200L) != 0L)
            return jjStopAtPos(1, 73);
         break;
      case 46:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L, active1, 0L, active2, 0L);
      case 47:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         break;
      case 58:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 60:
         if ((active1 & 0x2L) != 0L)
         {
            jjmatchedKind = 65;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000L, active1, 0L, active2, 0L);
      case 61:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(1, 48);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(1, 53);
         else if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         else if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         else if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         else if ((active1 & 0x1L) != 0L)
            return jjStopAtPos(1, 64);
         break;
      case 62:
         if ((active1 & 0x4L) != 0L)
         {
            jjmatchedKind = 66;
            jjmatchedPos = 1;
         }
         else if ((active1 & 0x4000L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L, active1, 0x10000L, active2, 0L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x180000L, active2, 0x2L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x20388003000000L, active2, 0L);
      case 102:
         if ((active1 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(1, 99, 33);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x4040400000200000L, active2, 0x4L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x801800000000000L, active2, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x8000090000000L, active2, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x600003020000000L, active2, 0L);
      case 111:
         if ((active1 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 90;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x3000004508c00000L, active2, 0L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x8000000000000000L, active2, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x80030200040000L, active2, 0x1L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x6000000000000L, active2, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x40000020000L, active2, 0L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x10000000000000L, active2, 0L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x40000000L, active2, 0L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x100000000000000L, active2, 0L);
      case 124:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1, active2);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1, long old2, long active2)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2)) == 0L)
      return jjStartNfa_0(0, old0, old1, old2); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1, active2);
      return 2;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x8L) != 0L)
            return jjStopAtPos(2, 3);
         break;
      case 42:
         if ((active1 & 0x10000L) != 0L)
            return jjStopAtPos(2, 80);
         break;
      case 46:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(2, 42);
         break;
      case 61:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(2, 49);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(2, 50);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0xa000000200000L, active2, 0L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x40000000000L, active2, 0L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x80000000000L, active2, 0L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x8000000000040000L, active2, 0L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x1000000L, active2, 0L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x900000000000L, active2, 0L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x5250010200000000L, active2, 0L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x2000001002000000L, active2, 0x2L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x20000000000000L, active2, 0L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x4000c00000L, active2, 0L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x420080000000L, active2, 0L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x100000000000000L, active2, 0L);
      case 114:
         if ((active1 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 96, 33);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x804000000000000L, active2, 0x4L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x400000010080000L, active2, 0L);
      case 116:
         if ((active1 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 101, 33);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x200440120000L, active2, 0L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x28000000L, active2, 0x1L);
      case 119:
         if ((active1 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 103, 33);
         break;
      case 121:
         if ((active1 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 119, 33);
         break;
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x1000000000000L, active2, 0L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1, active2);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1, long old2, long active2)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2)) == 0L)
      return jjStartNfa_0(1, old0, old1, old2); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, 0L, active1, active2);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active1, 0x2000000081040000L, active2, 0L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active1, 0x8000000L, active2, 0L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active1, 0x100000L, active2, 0L);
      case 100:
         if ((active1 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 124, 33);
         break;
      case 101:
         if ((active1 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 83, 33);
         else if ((active1 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 92, 33);
         else if ((active2 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(3, 128, 33);
         return jjMoveStringLiteralDfa4_0(active1, 0x101080242000000L, active2, 0L);
      case 103:
         if ((active1 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 102, 33);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active1, 0x400101000000000L, active2, 0L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active1, 0x4000040000000000L, active2, 0L);
      case 109:
         if ((active1 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 93, 33);
         break;
      case 110:
         return jjMoveStringLiteralDfa4_0(active1, 0x800000000000L, active2, 0L);
      case 111:
         if ((active1 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 81, 33);
         else if ((active1 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 98, 33);
         return jjMoveStringLiteralDfa4_0(active1, 0x200000000000000L, active2, 0x4L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active1, 0x20000000000000L, active2, 0L);
      case 114:
         if ((active1 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 85, 33);
         return jjMoveStringLiteralDfa4_0(active1, 0x8000400000000000L, active2, 0L);
      case 115:
         if ((active1 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 118, 33);
         return jjMoveStringLiteralDfa4_0(active1, 0x8000000400000L, active2, 0x2L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active1, 0x812020000800000L, active2, 0L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active1, 0x4200000000000L, active2, 0L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active1, 0x10000000000L, active2, 0L);
      default :
         break;
   }
   return jjStartNfa_0(2, 0L, active1, active2);
}
private final int jjMoveStringLiteralDfa4_0(long old1, long active1, long old2, long active2)
{
   if (((active1 &= old1) | (active2 &= old2)) == 0L)
      return jjStartNfa_0(2, 0L, old1, old2); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, 0L, active1, active2);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active1, 0x8000010000000000L, active2, 0L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active1, 0x14080000000000L, active2, 0L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active1, 0x100000000000000L, active2, 0L);
      case 101:
         if ((active1 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 126, 33);
         else if ((active2 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(4, 129, 33);
         return jjMoveStringLiteralDfa5_0(active1, 0x820000000000L, active2, 0L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active1, 0x400000000000000L, active2, 0L);
      case 104:
         if ((active1 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 84, 33);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active1, 0x2040000800000L, active2, 0L);
      case 107:
         if ((active1 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 82, 33);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active1, 0x20000008000000L, active2, 0L);
      case 110:
         if ((active1 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 121, 33);
         return jjMoveStringLiteralDfa5_0(active1, 0x1200000000L, active2, 0L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active1, 0x1000000000000L, active2, 0L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active1, 0x200040000000L, active2, 0L);
      case 115:
         if ((active1 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 115, 33);
         return jjMoveStringLiteralDfa5_0(active1, 0x100000000000L, active2, 0L);
      case 116:
         if ((active1 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 86, 33);
         else if ((active1 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 95, 33);
         else if ((active1 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 110, 33);
         return jjMoveStringLiteralDfa5_0(active1, 0x2000000002000000L, active2, 0L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active1, 0x800000001000000L, active2, 0L);
      case 119:
         if ((active2 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(4, 130, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, 0L, active1, active2);
}
private final int jjMoveStringLiteralDfa5_0(long old1, long active1, long old2, long active2)
{
   if (((active1 &= old1) | (active2 &= old2)) == 0L)
      return jjStartNfa_0(3, 0L, old1, old2); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, 0L, active1, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active1, 0x820000000000000L);
      case 99:
         if ((active1 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 106, 33);
         else if ((active1 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 113, 33);
         return jjMoveStringLiteralDfa6_0(active1, 0x20000000000L);
      case 100:
         if ((active1 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 97, 33);
         else if ((active1 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 111, 33);
         break;
      case 101:
         if ((active1 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 89, 33);
         else if ((active1 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 91, 33);
         else if ((active1 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 100, 33);
         return jjMoveStringLiteralDfa6_0(active1, 0x100000000000000L);
      case 102:
         if ((active1 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 112, 33);
         break;
      case 104:
         if ((active1 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 116, 33);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active1, 0x2000000000000000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active1, 0x80001000000L);
      case 110:
         if ((active1 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 94, 33);
         else if ((active1 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 109, 33);
         return jjMoveStringLiteralDfa6_0(active1, 0x400000000800000L);
      case 116:
         if ((active1 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 114, 33);
         return jjMoveStringLiteralDfa6_0(active1, 0x8000110000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, 0L, active1, 0L);
}
private final int jjMoveStringLiteralDfa6_0(long old1, long active1)
{
   if (((active1 &= old1)) == 0L)
      return jjStartNfa_0(4, 0L, old1, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, 0L, active1, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active1, 0x80000000000L);
      case 101:
         if ((active1 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 104, 33);
         return jjMoveStringLiteralDfa7_0(active1, 0x400100000000000L);
      case 102:
         if ((active1 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 120, 33);
         break;
      case 108:
         if ((active1 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 123, 33);
         return jjMoveStringLiteralDfa7_0(active1, 0x2000000000000000L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active1, 0x8000000000000000L);
      case 116:
         if ((active1 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(6, 88, 33);
         return jjMoveStringLiteralDfa7_0(active1, 0x20020000000000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active1, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(5, 0L, active1, 0L);
}
private final int jjMoveStringLiteralDfa7_0(long old1, long active1)
{
   if (((active1 &= old1)) == 0L)
      return jjStartNfa_0(5, 0L, old1, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, 0L, active1, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         if ((active1 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 122, 33);
         break;
      case 101:
         if ((active1 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 87, 33);
         else if ((active1 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 117, 33);
         else if ((active1 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 125, 33);
         return jjMoveStringLiteralDfa8_0(active1, 0x20000000000L);
      case 114:
         if ((active1 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 108, 33);
         else if ((active1 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 127, 33);
         return jjMoveStringLiteralDfa8_0(active1, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, 0L, active1, 0L);
}
private final int jjMoveStringLiteralDfa8_0(long old1, long active1)
{
   if (((active1 &= old1)) == 0L)
      return jjStartNfa_0(6, 0L, old1, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, 0L, active1, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 100:
         if ((active1 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 105, 33);
         break;
      case 101:
         return jjMoveStringLiteralDfa9_0(active1, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, 0L, active1, 0L);
}
private final int jjMoveStringLiteralDfa9_0(long old1, long active1)
{
   if (((active1 &= old1)) == 0L)
      return jjStartNfa_0(7, 0L, old1, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, 0L, active1, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 100:
         if ((active1 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 107, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, 0L, active1, 0L);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 154;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 5);
                  else if (curChar == 35)
                     jjCheckNAddStates(6, 29);
                  else if (curChar == 34)
                     jjCheckNAddStates(30, 32);
                  else if (curChar == 39)
                     jjAddStates(33, 34);
                  else if (curChar == 46)
                     jjCheckNAdd(1);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 135)
                        kind = 135;
                     jjCheckNAddStates(35, 42);
                  }
                  else if (curChar == 48)
                     jjAddStates(43, 46);
                  if (curChar == 48)
                  {
                     if (kind > 131)
                        kind = 131;
                     jjCheckNAddStates(47, 54);
                  }
                  break;
               case 0:
                  if (curChar == 46)
                     jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 143)
                     kind = 143;
                  jjCheckNAddStates(55, 57);
                  break;
               case 3:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 143)
                     kind = 143;
                  jjCheckNAddTwoStates(4, 5);
                  break;
               case 6:
                  if (curChar == 39)
                     jjAddStates(33, 34);
                  break;
               case 7:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 8:
                  if (curChar == 39 && kind > 145)
                     kind = 145;
                  break;
               case 10:
                  if ((0x8000008400000000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 11:
                  if (curChar == 48)
                     jjCheckNAddTwoStates(12, 8);
                  break;
               case 12:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(12, 8);
                  break;
               case 13:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(14, 8);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(14, 8);
                  break;
               case 15:
                  if (curChar == 48)
                     jjAddStates(58, 59);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(17, 8);
                  break;
               case 19:
                  if (curChar == 34)
                     jjCheckNAddStates(30, 32);
                  break;
               case 20:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(30, 32);
                  break;
               case 22:
                  if ((0x8000008400000000L & l) != 0L)
                     jjCheckNAddStates(30, 32);
                  break;
               case 23:
                  if (curChar == 34 && kind > 146)
                     kind = 146;
                  break;
               case 24:
                  if (curChar == 48)
                     jjCheckNAddStates(60, 63);
                  break;
               case 25:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(60, 63);
                  break;
               case 26:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(64, 67);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(64, 67);
                  break;
               case 28:
                  if (curChar == 48)
                     jjAddStates(68, 69);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(70, 73);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 147)
                     kind = 147;
                  jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 34:
                  if (curChar == 35)
                     jjCheckNAddStates(6, 29);
                  break;
               case 35:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(35, 42);
                  break;
               case 43:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(43, 49);
                  break;
               case 50:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(50, 55);
                  break;
               case 56:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(56, 62);
                  break;
               case 63:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(63, 65);
                  break;
               case 66:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(66, 71);
                  break;
               case 72:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(72, 76);
                  break;
               case 77:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(77, 81);
                  break;
               case 82:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(82, 86);
                  break;
               case 87:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(87, 92);
                  break;
               case 93:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(93, 99);
                  break;
               case 100:
                  if (curChar == 32)
                     jjCheckNAddTwoStates(100, 105);
                  break;
               case 106:
                  if (curChar != 48)
                     break;
                  if (kind > 131)
                     kind = 131;
                  jjCheckNAddStates(47, 54);
                  break;
               case 107:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 131)
                     kind = 131;
                  jjCheckNAdd(107);
                  break;
               case 108:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(108, 109);
                  break;
               case 110:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(110, 111);
                  break;
               case 112:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(74, 76);
                  break;
               case 117:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 135)
                     kind = 135;
                  jjCheckNAddStates(35, 42);
                  break;
               case 118:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 135)
                     kind = 135;
                  jjCheckNAdd(118);
                  break;
               case 119:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(119, 120);
                  break;
               case 121:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(121, 122);
                  break;
               case 123:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(77, 79);
                  break;
               case 128:
                  if (curChar == 48)
                     jjAddStates(43, 46);
                  break;
               case 130:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 139)
                     kind = 139;
                  jjstateSet[jjnewStateCnt++] = 130;
                  break;
               case 132:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 140)
                     kind = 140;
                  jjAddStates(80, 81);
                  break;
               case 135:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(82, 83);
                  break;
               case 138:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(84, 86);
                  break;
               case 143:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 5);
                  break;
               case 144:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(144, 145);
                  break;
               case 145:
                  if (curChar != 46)
                     break;
                  if (kind > 143)
                     kind = 143;
                  jjCheckNAddStates(87, 89);
                  break;
               case 146:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 143)
                     kind = 143;
                  jjCheckNAddStates(87, 89);
                  break;
               case 147:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(147, 0);
                  break;
               case 148:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(148, 149);
                  break;
               case 150:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(151);
                  break;
               case 151:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 144)
                     kind = 144;
                  jjCheckNAddTwoStates(151, 152);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 32:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 147)
                        kind = 147;
                     jjCheckNAdd(33);
                  }
                  if (curChar == 76)
                     jjAddStates(90, 91);
                  break;
               case 2:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(92, 93);
                  break;
               case 5:
                  if ((0x104000001040L & l) != 0L && kind > 143)
                     kind = 143;
                  break;
               case 7:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 9:
                  if (curChar == 92)
                     jjAddStates(94, 97);
                  break;
               case 10:
                  if ((0x54404610000000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 16:
                  if (curChar == 120)
                     jjCheckNAdd(17);
                  break;
               case 17:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddTwoStates(17, 8);
                  break;
               case 18:
                  if (curChar == 88)
                     jjCheckNAdd(17);
                  break;
               case 20:
                  jjCheckNAddStates(30, 32);
                  break;
               case 21:
                  if (curChar == 92)
                     jjAddStates(98, 101);
                  break;
               case 22:
                  if ((0x54404610000000L & l) != 0L)
                     jjCheckNAddStates(30, 32);
                  break;
               case 29:
                  if (curChar == 120)
                     jjCheckNAdd(30);
                  break;
               case 30:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddStates(70, 73);
                  break;
               case 31:
                  if (curChar == 88)
                     jjCheckNAdd(30);
                  break;
               case 33:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 147)
                     kind = 147;
                  jjCheckNAdd(33);
                  break;
               case 36:
                  if (curChar == 101 && kind > 19)
                     kind = 19;
                  break;
               case 37:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 44:
                  if (curChar == 101 && kind > 20)
                     kind = 20;
                  break;
               case 45:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 51:
                  if (curChar == 102 && kind > 21)
                     kind = 21;
                  break;
               case 52:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 53:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 52;
                  break;
               case 54:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 57:
                  if (curChar == 102 && kind > 22)
                     kind = 22;
                  break;
               case 58:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 60:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 64:
                  if (curChar == 102 && kind > 23)
                     kind = 23;
                  break;
               case 65:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 67:
                  if (curChar == 102 && kind > 24)
                     kind = 24;
                  break;
               case 68:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 68;
                  break;
               case 70:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 70;
                  break;
               case 73:
                  if (curChar == 101 && kind > 25)
                     kind = 25;
                  break;
               case 74:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 78:
                  if (curChar == 102 && kind > 26)
                     kind = 26;
                  break;
               case 79:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 78;
                  break;
               case 80:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 83:
                  if (curChar == 101 && kind > 27)
                     kind = 27;
                  break;
               case 84:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 83;
                  break;
               case 85:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 88:
                  if (curChar == 114 && kind > 28)
                     kind = 28;
                  break;
               case 89:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 92:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 94:
                  if (curChar == 97 && kind > 29)
                     kind = 29;
                  break;
               case 95:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 96:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 97:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 96;
                  break;
               case 98:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 99:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 101:
                  if (curChar == 102 && kind > 30)
                     kind = 30;
                  break;
               case 102:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 101;
                  break;
               case 103:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 102;
                  break;
               case 104:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 103;
                  break;
               case 105:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 104;
                  break;
               case 109:
                  if ((0x100000001000L & l) != 0L && kind > 132)
                     kind = 132;
                  break;
               case 111:
                  if ((0x20000000200000L & l) != 0L && kind > 133)
                     kind = 133;
                  break;
               case 113:
                  if ((0x100000001000L & l) != 0L && kind > 134)
                     kind = 134;
                  break;
               case 114:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 113;
                  break;
               case 115:
                  if ((0x20000000200000L & l) != 0L && kind > 134)
                     kind = 134;
                  break;
               case 116:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 115;
                  break;
               case 120:
                  if ((0x20100000201000L & l) != 0L && kind > 136)
                     kind = 136;
                  break;
               case 122:
                  if ((0x20000000200000L & l) != 0L && kind > 137)
                     kind = 137;
                  break;
               case 124:
                  if ((0x100000001000L & l) != 0L && kind > 138)
                     kind = 138;
                  break;
               case 125:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 124;
                  break;
               case 126:
                  if ((0x20000000200000L & l) != 0L && kind > 138)
                     kind = 138;
                  break;
               case 127:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 126;
                  break;
               case 129:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(130);
                  break;
               case 130:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 139)
                     kind = 139;
                  jjCheckNAdd(130);
                  break;
               case 131:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(132);
                  break;
               case 132:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 140)
                     kind = 140;
                  jjCheckNAddTwoStates(132, 133);
                  break;
               case 133:
                  if ((0x20100000201000L & l) != 0L && kind > 140)
                     kind = 140;
                  break;
               case 134:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(135);
                  break;
               case 135:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddTwoStates(135, 136);
                  break;
               case 136:
                  if ((0x20000000200000L & l) != 0L && kind > 141)
                     kind = 141;
                  break;
               case 137:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(138);
                  break;
               case 138:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddStates(84, 86);
                  break;
               case 139:
                  if ((0x100000001000L & l) != 0L && kind > 142)
                     kind = 142;
                  break;
               case 140:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 139;
                  break;
               case 141:
                  if ((0x20000000200000L & l) != 0L && kind > 142)
                     kind = 142;
                  break;
               case 142:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 141;
                  break;
               case 149:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(102, 103);
                  break;
               case 152:
                  if ((0x104000001040L & l) != 0L && kind > 144)
                     kind = 144;
                  break;
               case 153:
                  if (curChar == 76)
                     jjAddStates(90, 91);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 7:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(30, 32);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 154 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 11);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 15);
      case 92:
         return jjMoveStringLiteralDfa1_3(0x30000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 13:
         return jjMoveStringLiteralDfa2_3(active0, 0x20000L);
      default :
         return 2;
   }
   return 2;
}
private final int jjMoveStringLiteralDfa2_3(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(2, 17);
         break;
      default :
         return 3;
   }
   return 3;
}
private final int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x2000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   144, 145, 147, 0, 148, 149, 35, 42, 43, 49, 50, 55, 56, 62, 63, 65, 
   66, 71, 72, 76, 77, 81, 82, 86, 87, 92, 93, 99, 100, 105, 20, 21, 
   23, 7, 9, 118, 119, 120, 121, 122, 123, 125, 127, 129, 131, 134, 137, 107, 
   108, 109, 110, 111, 112, 114, 116, 1, 2, 5, 16, 18, 20, 21, 25, 23, 
   20, 21, 27, 23, 29, 31, 20, 21, 30, 23, 112, 114, 116, 123, 125, 127, 
   132, 133, 135, 136, 138, 140, 142, 146, 2, 5, 6, 19, 3, 4, 10, 11, 
   13, 15, 22, 24, 26, 28, 150, 151, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, "\173", "\175", "\133", "\135", "\50", "\51", "\72\72", 
"\72", "\73", "\54", "\77", "\56\56\56", "\75", "\52\75", "\57\75", "\45\75", 
"\53\75", "\55\75", "\74\74\75", "\76\76\75", "\46\75", "\136\75", "\174\75", 
"\174\174", "\46\46", "\174", "\136", "\46", "\75\75", "\41\75", "\74", "\76", "\74\75", 
"\76\75", "\74\74", "\76\76", "\53", "\55", "\52", "\57", "\45", "\53\53", "\55\55", 
"\176", "\41", "\56", "\44", "\55\76", "\56\52", "\55\76\52", "\141\165\164\157", 
"\142\162\145\141\153", "\143\141\163\145", "\143\141\164\143\150", "\143\150\141\162", 
"\143\157\156\163\164", "\143\157\156\164\151\156\165\145", "\144\145\146\141\165\154\164", 
"\144\145\154\145\164\145", "\144\157", "\144\157\165\142\154\145", "\145\154\163\145", 
"\145\156\165\155", "\145\170\164\145\162\156", "\146\154\157\141\164", "\146\157\162", 
"\146\162\151\145\156\144", "\147\157\164\157", "\151\146", "\151\156\154\151\156\145", "\151\156\164", 
"\154\157\156\147", "\156\145\167", "\160\162\151\166\141\164\145", 
"\160\162\157\164\145\143\164\145\144", "\160\165\142\154\151\143", "\162\145\144\145\143\154\141\162\145\144", 
"\162\145\147\151\163\164\145\162", "\162\145\164\165\162\156", "\163\150\157\162\164", 
"\163\151\147\156\145\144", "\163\151\172\145\157\146", "\163\164\141\164\151\143", 
"\163\164\162\165\143\164", "\143\154\141\163\163", "\163\167\151\164\143\150", 
"\164\145\155\160\154\141\164\145", "\164\150\151\163", "\164\162\171", "\164\171\160\145\144\145\146", 
"\165\156\151\157\156", "\165\156\163\151\147\156\145\144", "\166\151\162\164\165\141\154", 
"\166\157\151\144", "\166\157\154\141\164\151\154\145", "\167\150\151\154\145", 
"\157\160\145\162\141\164\157\162", "\164\162\165\145", "\146\141\154\163\145", "\164\150\162\157\167", null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "IN_LINE_COMMENT", 
   "IN_COMMENT", 
   "PREPROCESSOR_OUTPUT", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 2, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffff80001L, 0xffffffffffffffffL, 0xfffffL, 
};
static final long[] jjtoSkip = {
   0xaffeL, 0x0L, 0x0L, 
};
static final long[] jjtoMore = {
   0x75000L, 0x0L, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[154];
private final int[] jjstateSet = new int[308];
protected char curChar;
public CPPParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public CPPParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 154; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0) {
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   } else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100001600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 12)
         {
            jjmatchedKind = 12;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 14)
         {
            jjmatchedKind = 14;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 18)
         {
            jjmatchedKind = 18;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

}
