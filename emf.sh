workspace=`pwd`/tmp/org.eclipse.gmp/org.eclipse.gmf.tooling/plugins
project=org.eclipse.gmf.map
genmodel=models/gmfmap.genmodel

# create an initial Eclipse project with minimal project metadata
function init() {
	mkdir -p $workspace/Examples/src/example
	if [ ! -f $workspace/Examples/src/example/Entity.java ]; then
		cat > $workspace/Examples/src/example/Entity.java <<EOF
package example;
/** @model */
public interface Entity {
 /** @model */ public String getName();
}
EOF
	fi
	mkdir -p $workspace/Examples/META-INF
	cat > $workspace/Examples/META-INF/MANIFEST.MF << EOF
Manifest-Version: 1.0
Bundle-ManifestVersion: 2
Bundle-Name: %pluginName
Bundle-SymbolicName: MacOS;singleton:=true
Bundle-Version: 1.0.0
Bundle-ClassPath: .
Bundle-Vendor: %providerName
Bundle-Localization: plugin
Bundle-RequiredExecutionEnvironment: JavaSE-1.6
Export-Package: example,
 example.impl,
 example.util
Require-Bundle: org.eclipse.core.runtime,
 org.eclipse.emf.ecore;visibility:=reexport
Bundle-ActivationPolicy: lazy
EOF
	cat > $workspace/Examples/.project <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>Examples</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.eclipse.pde.ManifestBuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.eclipse.pde.SchemaBuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.eclipse.xtext.ui.shared.xtextBuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
		<nature>org.eclipse.pde.PluginNature</nature>
		<nature>org.eclipse.xtext.ui.shared.xtextNature</nature>
	</natures>
</projectDescription>
EOF
	cat > $workspace/Examples/.classpath <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="src" path="src"/>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6"/>
	<classpathentry kind="con" path="org.eclipse.pde.core.requiredPlugins"/>
	<classpathentry kind="output" path="bin"/>
</classpath>
EOF
}

# generate Java code from an EMF genmodel
function codegen() { 
	model=$workspace/$project/$genmodel
	mkdir -p $(dirname $model)
	if [ ! -f $model ]; then
		mkdir -p $(dirname $model)
		~/IDE/sdk/3.6/eclipse/eclipse -noSplash -data $workspace -application org.eclipse.emf.importer.java.Java2GenModel /$project/$genmodel -modelProject /$project
	else
		~/IDE/sdk/3.6/eclipse/eclipse -noSplash -data $workspace -application org.eclipse.emf.importer.java.Java2GenModel /$project/$genmodel -reload -modelProject $project
	fi
	if [ -f $model ]; then
		~/IDE/sdk/3.6/eclipse/eclipse -noSplash -data $workspace -application org.eclipse.emf.codegen.ecore.Generator -codeFormatting default -forceOverwrite -model $model 
	fi
}

# extract the model
function model() {
	if [ ! -f test-model.txt ]; then
		find $workspace/$project -name "*.java" > test-model.txt
	fi
	for f in `cat test-model.txt`; do
	 g=$(grep -l "@model" $f)
	 if [ -f $g ]; then
		 ../mct/scripts/mct-model -comment $f > $f.model
	 fi
	done
}

# extract @generated
function generated() {
	if [ ! -f test-generated.txt ]; then
		find $workspace/Examples -name "*.java" > test-generated.txt
	fi
	for f in `cat test-generated.txt`; do
	     ../mct/scripts/mct-mdsd -comment $f > $f.generated
	done
}


# extract @generated NOT
function invariant() {
	if [ ! -f test-generated-not.txt ]; then
		find $workspace/Examples -name "*.java" > test-generated-not.txt
	fi
	for f in `cat test-generated-not.txt`; do
	     ../mct/scripts/mct-mdsd-not -comment $f > $f.generated_not
	done
}

# we assume that the Java project Examples has been created by using the Eclipse IDE
#init
codegen
#generated
#invariant
