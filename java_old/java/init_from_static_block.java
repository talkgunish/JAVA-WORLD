// static block
// static  block is called first than initialisation block cz static is already given memory but instance need to be given memory.
class Mystatic 
{   // default constructor..
	Mystatic()
	{
	System.out.println("this is default constructor");
	}
//init block.
	{ 
	System.out.println("this is init block");
	}
static {
		System.out.println("static block");
		new Mystatic();
/*here static block automatically gets called since it already has memory
 and in that we have created an object thus init block gets called from static block and then default constructor also gets called from that.*/
		}
public static void main(String arg [])
// here the main method has no use but it needs to be specified since it has been made a condn to give main from java 1.7 version..
{
}
}