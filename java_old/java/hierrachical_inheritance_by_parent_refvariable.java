// hierrachical inheritance
class Vehicle
{
	void run()
	{	
		System.out.println("run vehicle");
	}
}
class Hero extends Vehicle
{
		void run()
	{
		System.out.println("hero is running");
	}
	void show()
	{
		System.out.println("show function");
	}
}
class Yamaha extends Vehicle
{
	void run()
	{
		System.out.println("yamaha is running");
	}
}
class Test
{
	public static void main(String args [])
	{
		Vehicle v=new Hero(); // here "Vehicle v1=new Hero()" is used since Vehicle is the parent of Hero and Yamaha both....
		Vehicle v1=new Yamaha();// here "Hero v1=new Yamaha()" can't be used since Hero is not the parent of Yamaha...
		v.run();
		v1.run();
		
	}
}

