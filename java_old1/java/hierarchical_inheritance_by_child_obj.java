//hierarchical inheritance
class Parent
{
	void show(int i)
	{
	System.out.println(i);
	}
}
class Child extends Parent
{
int k=50;
static String name="child1";
	static void display()
	{
	System.out.println(name);
	}
}
class Child2 extends Parent
{
int id=101;
String name ="Child2";
	void display()
	{
	System.out.println(id +"and "+ name);
	}
}
class demo
{
	public static void main(String [] args)
	{
	Child c=new Child();
	 c.display();
	 System.out.println(c.k);
	 c.show(20);
	Child2 c2= new Child2();
	 System.out.println(c2.name);
	 System.out.println(c2.id);
	 c2.show(10);
	 }
 }