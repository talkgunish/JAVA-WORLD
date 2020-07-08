// package creation
// this package made will contain ".class" file..
package P1; // this creates a package/folder..
public class Package1// this class is made public so that it can be imported into other file..similarly is done with fn 
{
 public void sum(int x, int y)
 {
  System.out.println("sum is"+(x+y));
  }
  public void sub(int x, int y)
 {
  System.out.println("sub is"+(x-y));
  }
  /* main is not needed here since no calculation is performed public static void main(String arg[])
  {
  }*/
 }
 /* this file is compiled like this to create the package:--
 1). if u want to create the package in same directory where this file is being saved then type this is cmd prmpt
 "javac -d . Package1.java"
this creates P1 named package in same directory where this file is saved.
2). if u want to create the package in different directory then type this is cmd prmpt\
"javac -d E:\java\Package1.java"
this "E:\java" is the path of different directory where u want to make this package...*/
