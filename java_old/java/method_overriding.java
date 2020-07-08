//method overriding
class Vehicle
{
	void run()
	{
		System.out.println("run vehicle parent");
	}
}
class Child extends Vehicle
{ 
		void run()
		{ 
		System.out.println("child 1");
		super.run();
		// if method is called from "super" then it can be used in any line but if constructor is called from "super" keyword then it must be called in first line..		
		}
			public static void main( String[] args)
			{
				Child c=new Child();
				c.run();
				
			}
}
