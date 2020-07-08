// run by typing "javap classname" to see results
/* result is:-
interface Student {
  public static final int i;
  public abstract void show();
}
*/
// in interface variables are automatically made static n final and methods/fns are made public n abstract..
interface Student
{ int i=0;
 void show();
}
