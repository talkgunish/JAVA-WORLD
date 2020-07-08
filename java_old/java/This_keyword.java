// calling static fn instance fns in user defined fn and then calling user defined fn in main fn
// making one default constructor one static method/fn one instance fn/method and one user defined fn which calls both static n instance fn and then call that user defined fn in main fn.. 
// using "this" keyord as used below by printing references
class This_keyword{ 
static int a,b;
 public This_keyword()
 {
	System.out.println("default constructor");
}
public static void sum(int a, int b)
{ 
System.out.println(a+b);
}
public void number(int a) // instance method/fn
{
	System.out.println(a);
	
	System.out.println("vaia this = "+this); //"this"vl have reference here from the main class
	// the statement in ""quotes vl b printed as such and to separate the variable and print it we need to user + symbol
// this is a keyword used to print "class@hexadecimal value" of the current working class.
}
public void display()
{ This_keyword t=new This_keyword();//since here new object is being created therefore it vl have new reference as in"class@hexadecimal".
System.out.println(" object display "+t);
 sum(5,4);
t.number(8);/*since here number fn is called within display fn therefore it gets reference as in "class@hexadecimal" 
value of reference that is stored or made by creating an object in this display fn.*/
}
public static void main(String [] abc)
{
	This_keyword t=new This_keyword();
	t.number(20);
	t.display();
	System.out.println(t);//this is reference stored by creating object in main fn.
	
}
}
