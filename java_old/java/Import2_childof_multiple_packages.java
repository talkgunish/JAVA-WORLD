package test;
// for creating the package type "javac -d . Import2_childof_multiple_packages.java"...
/* to store this class in a package run by
run by java test.Demo*/
/*import A1.A2.A3.multiple_packages_parentof_import2;
import A1.A2.A3.multiple_packages_parentof_import2;*/
import A1.A2.A3.*; // this star is used to import all classes present in that package
class Demo //extends multiple_packages_parentof_import2
{
	
 public static void main(String [] arg)
 {
	// new A1.A2.A3.multiple_packages2_parentof_import2().sub(5,1); //sometimes directly class file is not called then v have to specify the full path while creating object also like "A1.A2.A3.multiple_packages_parentof_import2()"..
	  // new A1.A2.A3.multiple_packages_parentof_import2().sum(4,2);
	 /* multiple_packages_parentof_import2 t2=new multiple_packages_parentof_import2();
	  multiple_packages_parentof_import2 t1=new multiple_packages_parentof_import2();
	  t1.sub(5,4);
	  t2.sum(5,6);*/
	  A1.A2.A3.multiple_packages_parentof_import2 t1=new A1.A2.A3.multiple_packages_parentof_import2();
 }
}
here for running this class file type this in cmd "java test.Demo" since Demo class file is created in a package called test....