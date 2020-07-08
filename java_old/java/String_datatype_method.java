class String
{
   
   static String getvalue1(String s1)
    { 
		return s1;
	}
      static String getvalue2(String s2)
		{ 
			return s2;
		}
		
	public static void main(String args [])
	{
		String a=getvalue1("ducat"); // since the fns are static therefore we don't need to create object we can directly call
		String b=getvalue2("fbd"); // and in these fns we are passing their return values of string type in another string variables declared overhere as "a" n "b"
		System.out.print(a+" " +b);
	}
}