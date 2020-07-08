 abstract class Student
{	Student()
    {
    this(4);
	System.out.println("this is parent default contructor");
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
	abstract void get(int x); /// an abstract method is only defined inside abstract class but not given body but a nrml fn must be given body if it is declared in abstract class 
	// and if the class is not abstract then the fn sed inside the class must be a nrml fn with body declared rather than being abstract or having no body.. 
	}
	class Middle extends Student
	{ 
	Middle()
	{
	super(); 
	}
	 void get(int x) // the abstract fn must be given body in the child class for abstract fn declared in the parent abstract class...
		{ 
		System.out.println("no. passed is "+x);
		}
	}
class Child extends Middle
	{ Child	()
	{ System.out.println("this is child default constructor");
		}
	public static void main(String [] arg)
		{ Child c=new Child(); /* here firstly by creating obj before the child constructor the parent constructor gets called then the 
		child constructor gets called n then the get method...*/
		//whenever a parent class is extended to a child then when object is made then firstly parent constructor is called then child constructor.
			c.get(9);
		}
	}	