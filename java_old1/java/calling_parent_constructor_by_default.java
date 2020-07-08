class Student
	{ 
	Student()
	{
		this(4);
		System.out.println("default constructor");
	}
	Student(int x)
	{
		this(5,4);
	 System.out.println("square is "+(x*x));
		
	}
		Student(int x,int y)
		{	 System.out.println("sum is "+(x+y));
		
	}
	}
class Child extends Student
	{
	public static void main(String [] arg)
		{ new Child(); // here since the obj is created therefore the parent constructor gets called before the child constructor
			
			
		}
	}	