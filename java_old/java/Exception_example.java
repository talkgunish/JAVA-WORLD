class Myexception{

public static void main(String arg[]) // throws Exception
{
try
{ int i=10/0;
}
//catch(Exception e)
/*catch(ArithmeticException e)
{
System.out.println(e);
}*/
finally// finally statement is run at the end...
{
System.out.println("finally");
}
// if catch statement is nt given the ie. exception needs to be handled if not handled by catch then finally block executes n terminates the program
// if catch statement is given n exception is handled by that then rest programs also gets executed therefore hello gets printed..
System.out.print("hello");
}
}
