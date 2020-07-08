class Addition
 {
static int x,y;
	void sum(int x,int y) // why identifier expected since its globally declared cz in paranthesis we declare always..
	{ 	
	System.out.println("sum is"+ (x+y));
	}
	void sub(int x,int y)
	{
	System.out.println("sub is"+ (x-y));
	}
public static void main(String [] args)
	{
	Addition a=new Addition();
	a.sum(1,2);
	a.sub(3,4);
	a.sum(5,6);
	a.sub(4,3);
	}
}
	