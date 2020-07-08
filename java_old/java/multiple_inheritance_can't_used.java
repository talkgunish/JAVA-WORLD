//multiple inheritance can't be used in java
class Parent
{
	static int i,x;
	void show(int i)
	{
	System.out.print(i);
	}
}
class Parent2{
int j=10;
	void show(int x)
	{
	System.out.print("sum"+(x+x));
	}
}
class Child extends Parent2,Parent // multiple inheritance cant be used in "java" using class but can be used using "interface"...
{
	public static void main(String [] args)
	{  int x=5,i;
	Child c=new Child();
	c.show(x);
	//c.sum(i);
	}
}
