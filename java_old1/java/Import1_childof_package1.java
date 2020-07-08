import P1.Package1;
//class Test
class Test extends Package1
{
	public static void main (String arg[])
	{
		//new Package1().sum(5,4);//.....this is direct way to call the method...can also be used without inheritance...
		Package1 t=new Test();// its not allowed here unless inheritance is achieved since it requires parent class reference variable...
		t.sum(5,6);
		t.sub(9,6);
	}
}