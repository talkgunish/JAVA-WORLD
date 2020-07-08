// here we are using the predefined sleep function of thread class ....
class A
{
public static void main(String arg [])
	{
		System.out.println("main thread start");

		try 
			// this try block \is used when an exception can come n that exception is written in this try block..
			// here since sleep stops a program for a while thus thats an "InterruptedException" since program has been interrupted.
	{
		Thread.sleep(2000);
			// this time in () for sleep is always given in nanoseconds
			//sleep is a method that already exists in a already existing java class "Thread" is called here
	}
		catch(InterruptedException e) 
			// here the specific exception is given ie. "Interrupted"
			// try n catch are used together when an exception is to come individually cant be used since try takes the exception and catch catches it.
			// catch(Exception e) this can also be used if we arent specific about which exception will come since this contains all the exceptions...
	{ 
		System.out.println(e); 
			/* here this exception doesn't gets printed cz no exception gets generated if it vld have been then try vld have held it n 
			catch vld have caught n then displayed*/
			/* now if exception is not generated then why try n catch are being used? Ans. cz this here is an checked exception therefore it vl b generated at 
			compile time therefore we need to use catch n try .*/
	} 
			/* this error comes in cmd prompt when we don't write try n catch n directly use sleep method "one.java:12: error: unreported exception InterruptedException; must be caught or declared to be thrown" */
			// "Thread.sleep(3000);" this makes thread sleep for a while n then executes further statement..
		System.out.println("work complete.....");
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.print("main thread stop");
	}
	}
