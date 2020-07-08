class My_outerclass// this is an outerclass
{ 
	static int i=5;
static class Inner_class// this is an inner class
{
	static void show()//method inside an inner class
{
	System.out.print(i);
}
}
	public static void main(String arg [])
{
	//My_outerclass o=new My_outerclass();// here obj of outerclass is created whose ref. gets stored in variable o...
	My_outerclass.Inner_class.show();/*here we can directly call since inner class n method both are static....if there had been something more in 
	outer class then we must create an object for the outer class  */
	//My_outerclass.Inner_class i=o.new Inner_class();
	/* now "My_outerclass.Inner_class i=" is used here to create an obj for the inner class now since this inner class is contained in the outerclass therefore we 
	we need to frst specify the outer class n then by "." we call the next inner class	*/
	
	/* now "i" here is taken as the ref. variable */
	
	/* now "i=o.new Inner_class();" this means an obj of inner class is being created whose ref. gets stored in i 
	NOTE:-- here to create an obj of inner class we need the help of outerclass obj that means with the help of 
	outerclass obj we can create the obj for inner class*/
	
	//i.show();// then we are calling the show fn by the obj of inner class...
}
} 