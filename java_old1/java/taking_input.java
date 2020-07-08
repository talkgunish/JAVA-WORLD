class Addition 
{
static int p=10;
	static int sum(int i, int j)
	{
	//s.o.p(p);
	int c=i+j;
	return c;
	}
		int sum2(int i, int j, int k)
		{
		int z=i+j+k;
		return z;
		}
public static void main(String  args [] ) throws Exception	 
{
	String s=args[0];//  to take input in the string from the cmd prmt...."this is called Variable Length Arguement.."
	// take input from the cmd prmpt " java Addition 20 50" like this... 
	String s1=args[1];// same as above
	System.out.println(Integer.valueOf(s)+Integer.valueOf(s1));// for summing up the values passed above through cmd prmpt
	Addition a=new Addition();
	int q=a.sum(10,20);
	int p=a.sum2(10,20,30);
	System.out.print(q +" "+ p);	
}
}
/*Catch(ArrayIndexOutOfBoundsException e)
}
}*/