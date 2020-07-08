abstract class Student
{	Student()
    {
    this(4);
	System.out.println("default contructor");
	}
	 Student(int x)
	 { 
	 this(5,4);
	 System.out.println("square is "+(x*x));
	}
		Student(int x,int y)
	{
			System.out.println("sum is "+(x+y));
	}
	}
	class Middle extends Student
	{ 
	Middle()
	{
	super(); 
	}
	static void get(int a)
		{ 
		System.out.println("no. passed is "+a);
		}
	}
class Child extends Middle
	{
	public static void main(String [] arg)
		{ new Child();
			get(9);
			/* here if "new Child()" is that means obj of child class is craeted then o/p is..
			"sum is 9
			square is 16
			default contructor
			no. passed is 9"
			 since by creating obj the default constructor of child class is being called but ...
			 NOTE: since parent constructor gets called before the child constructor therefore middle class constructor 
			 gets called therefore our process gets executed */
			 
			 /* but if this obj is not created here then child default constructor won,t be called neither the parent constructor gets called 
			 threfore our process doesn't gets executed.
			 if obj is not created then the o/p comes as:--
			 no. passed is 9
			 */
			

		}
	}	