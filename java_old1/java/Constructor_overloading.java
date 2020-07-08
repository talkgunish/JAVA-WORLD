// constructor overloading
class Constructor_overloading {
int a,b;
public Constructor_overloading(int a)
{ System.out.println(a+a);
}
public Constructor_overloading(int a,int b)
{
	System.out.println(a+b);
}
public Constructor_overloading(float a, float b)
{
	System.out.println(a+b);
}
public static void main( String [] args)
{ new Constructor_overloading(5);
new Constructor_overloading(5,6);
new Constructor_overloading(5.0f,6.7f);
}
}
	