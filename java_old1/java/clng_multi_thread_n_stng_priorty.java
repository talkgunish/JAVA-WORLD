class A1 extends Thread // here predefined class thread has been extended
{
  A1(String s)// default constructor
  {
	super(s);// calling the parent constructor
  }
public void run()// here run method has been overridden
{
	for(int i=0;i<10;i++)
	{ 
		System.out.println("name is = "+Thread.currentThread().getName()+ "   priority is = "+Thread.currentThread().getPriority()+i );
	}
}
 public static void main(String a[])
{ 
	Thread t1=new A1("sumit");//here the default constructor gets called nby passing a string arguement "sumit"
	Thread t2=new A1("amit");
	Thread t3=new A1("rahul");
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	/* OR 
	t1.setPriority(1);
	t2.setPriority(10);
	t3.setPriority(5);
	this is since min=1,norm=5,max=10 in priority terms..*/	
	t1.start();// here since the start is being called it automatically calls up the run fn n since it has been overridden then it calls up the overriddenfn 
	t2.start();// if these start is not given then also it compiles but no result is being displayed
	t3.start();
}
}
