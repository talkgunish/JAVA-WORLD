// "final" keyword -- if final keyword is used then a variable value can't be initialized again in the whole program.. 
/* "super" keyword-- used to call the default parent constructor directly....this is written in first line of the child constructor
firstly child constructor is called by default and from that by super parent constructor is being called*/
// both keywords are used in the first line of constructors...super in child constructor and final can be used anywhere where variable is being initialized. 
	 class Bank
	{
		static final int i=50; // final keyword
		Bank(int i,int j)
		{
		System.out.println("sum is "+(i+j));
		}

		 void rateOfInterest()
		{
		System.out.println("rateOfInterest is 10% ");
		}
	}
		class SBI extends Bank
		{
          // child class SBI extends the properties of parent class Bank. 
			void rateOfInterest() // overriding the function/method.
			{
				System.out.println("rateOfInterest is  20% ");
		
			}
			SBI(int k)
			{
				super(10,20);
			System.out.println("this is sbi bank " + k);
					//super.rateOfInterest();		
			}
			public static void main(String[] arg)
			{	
				Bank b=new SBI(20); // in reference variable "b" of bank class an object is created for SBI class and constructor is also being called here
					b.rateOfInterest(); // overridden fn ie. in child is being called here.
				/* i=60*/
				/* here this value "i=60;" for i cant be again initialized again since at starting of the program "final" keyword has been 
				used to initialize value for i.*/
				System.out.println(i);
			}
		}