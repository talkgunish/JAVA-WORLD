//initialization block
class Myinit
{
	Myinit()//default constructor.
	{
	System.out.println("this is default constructor");
	}
	//initialization block does not needs any name similarly as instance.
	//this below one is initialization block..
	{ 
	System.out.println("this is initialization block");
	}
	public static void main(String args [])
	{ // here block gets called automatically and also before the constructor even the default constructor
	new Myinit();
	}
}