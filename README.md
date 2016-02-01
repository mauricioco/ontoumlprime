OntoUMLPrime
============
The purpose of this is to reimplement a metamodel for OntoUML that is independent of the UML. 
The previous OntoUML metamodel implementation by Carraretto was based on the UML 2.0 implementation
in Eclipse. This means that it is too polluted with UML constraints. Strictly speaking this is not 
UML anymore (so OntoUMLPrime is strictly speaking a misnomer). 
 
We have used the Xcore syntax. If you want to export a genmodel and ecore model from it, this can be done by following the steps in:
http://wiki.eclipse.org/Xcore#Converting_an_Xcore_Model_to_a_GenModel
This is not necessary if you just want to create dynamic instances of the model, and if you want to generate code, as it is generated
automatically when you save the xcore file. However, this is necessary to use the OCL constraints in ontoumlprime.ocl, as that refers
to the ecore and not the xcore file, and also to use tools that depend on ecore (diagramming tool, xtext). 
 
If you create a genmodel/ecore, make sure you do not generate code from the genmodel. The code is already produced at src-gen
when the xcore file is saved.

Instructions
============

1. `mvn install`
2. Look at `target` folders for the built artifacts.
3. Upload `br.ufes.inf.nemo.ontouml.ontoumlprime.updatesite/target/` to your
   update site server.

Instructions - PlantUML visualization
=====================================

These instructions work for the following Eclipse version:

**Eclipse DSL Tools**

**Version: Mars.1 Release (4.5.1)**
**Build id: 20150924-1200**

1. Install the prerequesites:
  1. Graphviz (`http://www.graphviz.org/Download.php`). PlantUML uses it for the diagrams to be rendered. Check your system environment variables if you are using windows (`http://plantuml.com/graphvizdot.html`).
  2. The PlantUML plugin was added as a submodule, forked from `https://github.com/hallvard/plantuml.git`. So there's no need to install it separately anymore. Also, it is now possible to customize its code.
  3. Be sure to install the Eclipse Modelling plugins (XText included).

2. Clone the repository and initialize submodules.
  ```
  git clone -b plantuml_visualizer https://github.com/mauricioco/ontoumlprime.git
  git submodule init
  git submodule update
  ```

3. Import the OntoUMLPrime projects to Eclipse.
  1. "File".
  2. "Import...".
  3. "Existing Maven Projects".
  4. Select repository root as "Root Directory" (default is ./ontoumlprime).
  5. Check all projects.
  6. "Finish".

4. Import required PlantUML projects to Eclipse. 
  1. "File".
  2. "Import...".
  3. "Existing Projects into Workspace".
  4. Select the plantuml submodule folder as "Root Directory" (default is ./ontoumlprime/plantuml).
  5. Check "net.sourceforge.plantuml" and "net.sourceforge.plantuml.text".
  6. "Finish".

5. Fix "br.ufes.inf.nemo.ontouml.ontoumlprime.dsl.ui" because it isn't detecting source folders.
  1. Select both project folders "src" and "src-gen".
  2. Right click.
  3. "Build Path".
  4. "Use as Source Folder".

6. Dsl language is already generated. Just run the visualizer project as an "Eclipse Application" and you're good to go!

\* It's likely that errors are detected in Dsl.xtext, but that is just eclipse failing to link to the metamodel project when compiling in real-time.

\*\* An error will be detected in ontoumlprime.xcore from the metamodel project. Ignore them.

History:
========
created by João Paulo A. Almeida
