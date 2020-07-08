// multilevel inheritance can be used in java using class.
class Parent
{
	void show(int i)
	{
	System.out.println(i);
	}
}
class Parent2 extends Parent {
	int j=10;
	void sum(int i)
	{
	System.out.println(i+i);
	}
}
class Child extends Parent2{
	public static void main(String [] args)
	{
	Child c= new Child();
	c.show(5);
	c.sum(6);
	}
}
