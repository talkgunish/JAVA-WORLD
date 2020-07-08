// compile by "javac filename.c" in cmd prmt n run by "java classfilename" that is created after compilation.
 class Constructors {
static int a,b;
public void sum(int a,int b)
 { 
	System.out.println(a+b);
 }

 public Constructors()
 { 
 System.out.println("default constructor");
 }
 public Constructors( int i)
 { 
 System.out.println("single parametrized constructor");
 }
 public Constructors( int i,int n)
 { 
 System.out.println(" double parametrized constructor");
 }
public static void main(String[] aaaa) //after string any variable name can be given args or aaa or any other also
{
Constructors s=new Constructors();
		new Constructors(10);
		new Constructors(10,52);
		s.sum(20,30);
}  
 
 }