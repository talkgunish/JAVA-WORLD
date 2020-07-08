import java.util.*;
class shape extends Exception
{ 
	public static void main(String args[]) throws Exception 
	{ 
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter or more three coordinates of polygon continuosly");
	String points = scan.next();
	char point[]=points.toCharArray();
	int count= points.length();
	//System.out.print(count);	
	if ( count>=6 )
	{
		
		if (count%2==0)
		{
			for(int y=0;y<100;)
			{   if ( y+5<count)
				{
				int a=point[y];
				int b=point[y+1];
				int c=point[y+2];
				int d=point[y+3];
				int e=point[y+4];
				int f=point[y+5];
				float slope1=((d-b)/(c-a));
				float slope2=((f-d)/(e-c));
				
			if ( slope1==slope2)
			{
				System.out.print("coolinear");
				break;
			}
			else
				y=y+2;
				
			continue;}
			else
				break;
			}
			scan.close();
			
			}
		else
				System.out.print("Figure can't be ");
		}
	
	else 
		System.out.print("enter atleast three coordinates");
}}
	 
	 