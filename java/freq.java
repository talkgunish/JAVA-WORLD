class Frequency {


public static void freq(String f ) {
 int freq=1;
String s=f;
 char c[]=s.toCharArray();
   for(int j=0;j<c.length;j++)
   {
	   freq=0;
	   
     for(int i=0;i<c.length;i++)
	{ if(j>i && c[j]==c[i])
		{break;
		}
		if(c[j]==c[i])
		{ 
			freq++;
			
		}
		
	
	if(i==c.length-1)
	{
		System.out.println(c[j]+"="+freq);
   }
	}
   }
 }
 
 
public static void main ( String arg[]){
	new Frequency().freq(arg[0]);
}
}
 