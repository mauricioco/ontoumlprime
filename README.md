ontoumlprime
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

1. The PlantUML plugin was added as a submodule, forked from `https://github.com/hallvard/plantuml.git`. So there's no need to install it separately anymore. Also, it is now possible to customize its code and add more features to visualization.
2. You need to install Graphviz (`http://www.graphviz.org/Download.php`). PlantUML uses it for the diagrams to be rendered. Just install it and check your system environment variables (`http://plantuml.com/graphvizdot.html`).

History:
========
created by João Paulo A. Almeida
