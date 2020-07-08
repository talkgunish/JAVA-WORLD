class Mythread extends Thread // here we are extending the predefined class thread 
{
  Mythread(String s) //default constructor
  {
	super(s);// calling parent constructor first
  }
	public /* "static" static method doesn't overwrite */ void run()
	{
	//System.out.println("MyThread is =    "+Thread.currentThread().getName());
	for(int i=0;i<10;i++)
	{
	  System.out.println("  "+Thread.currentThread().getName() +"  is working ");
	//try { Thread.sleep(5/1000);
		try 
		{
			Thread.sleep(5);
		}
		catch(InterruptedException e)//";"can't be given in the atch statement..
		{
			System.out.print(e);
		}
	}
	}	
	public static void main(String a[])throws Exception
	{
		System.out.println("starting thrad is =  "+Thread.currentThread().getName());
		Thread t1=new Mythread("amit");
		t1.start();// by not giving this start the thread fn start won,t execute n without it the run function won't execute...
		t1.join();// this join lets the frst thread execute frst and after that finishes then it lets the other thread come in...
		t1.join(5);
		Thread t2=new Mythread("Rahul ");
		t2.start();
		Thread t3=new Mythread("sumit ");
		t3.start();
		System.out.println("ending thread is =  "+Thread.currentThread().getName());
	}
}

