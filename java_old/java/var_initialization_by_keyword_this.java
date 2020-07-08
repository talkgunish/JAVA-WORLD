class Addition
{
	String name;
	int id;
			public Addition(int id, String name)
		{
			this.id=id;
			this.name=name;
			/* here if we give like this "id=id;" n "name=name;" above here then that initializes the local variables only but by using the keyword 
			"this" we have initialized the global variables 
			Therefore from this we can conclude that "this" keyword can be used to initialize the global variable*/
		}
			public static void main(String args [])
			{
				Addition a=new Addition(101,"ducat");
				System.out.print(" id and name  are  "+a.id +" and "+a.name);
			}
}