// Static block.
class Mystatic 
{
	Mystatic()//default constructor.
	{
	System.out.println("this is default constructor");
	}
	// static block needs to be specified static in front but still this block doesn't has any other name.
	// this below one is static block...
	static {
	System.out.println("static block");	
		   }
public static void main(String arg [])
{
	// static block is called automatically and also before the default constructor..
	new Mystatic(); //default contructor is not called automatically its called by creating an object w/o the obj only static block gets called..

}
}