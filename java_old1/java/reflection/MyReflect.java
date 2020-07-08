//Reflection 
import java.lang.reflect.*;
import java.io.*;

public class MyReflect 
{
  public static void main(String...ss) throws Exception
  {
	try
	{
	  Class c=Class.forName("Child2");
	  //c.newInstance();
	  Method[] m=c.getDeclaredMethods();
	  Constructor[] co=c.getDeclaredConstructors();
	  Field[] f=c.getDeclaredFields();
		for(Method mm:m)
		{
		 System.out.println(mm);
		}	
		/*	for(Constructor cc:co)
		{	System.out.println(cc);
		}*/
		/*	for(Field ff:f)
		{
			System.out.println(ff);
		}*/
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}