import java.util.*;
import java.io.*;
class Game
{ 
public static void main(String arg[]) throws Exception
{   

	//int chance=0;	
	int chance=0; //variable for giving chances equal to letters entered
	int set=0; //counter variable to check in dash array if there is any dash left or not to provide the win or loose condition at end
	
	Scanner sc=new Scanner(System.in); //creating obj of scanner class
	System.out.println("are you admin!!!???");
	String check=sc.next(); // taking input in check variable
	if(check.equals("yes")) // if yes then it logins
	{ 
	 System.out.println("Enter the game word");
	 Console con=System.console(); // console is a class which is being used here so that when the user enters
			char gameword[]=con.readPassword();
	 //String gw=sc.next();
	 char []dash=new char[gameword.length];
	 chance=gameword.length;
	//=gw.toCharArray();
	for(int i=0; i<dash.length;i++)
	{
		dash[i]='_';
	}
					
			System.out.println("WELCOME PLAYER");
			System.out.println("You have got "+/*gameword.length*/chance+" chances to win!!");
			System.out.println("Lets Play");
					
			for(int j=0;j<gameword.length;)
			{ 
			System.out.println("Enter your guess");
			for(int i=0; i<gameword.length;i++)
			{
				System.out.print(dash[i]);
			}			
			System.out.println(" ");
			char letter=sc.next().charAt(0);
			
			 for(int x=0;x<gameword.length;x++)
			 { 
				 
				if(letter==gameword[x])
				{  
				dash[x]=letter;
				}
			 }
			  for(int z=0;z<gameword.length;z++)
				{
				System.out.print(dash[z]);
				}
				 chance--;
				System.out.println("Left chances="+chance);
				System.out.println("Try again");
				
			j++;
			
	
	}		
	for(int p=0;p<gameword.length;p++)
			 { String convdash=String.valueOf(dash[p]);
		 
				 if(convdash.equals("_"))
				 {  set--;
				 }
				 else
				 {
				  set++;
			 }
			 }
			 if(set==gameword.length)
			 { System.out.print("YOU WON!!!!");
			 } 
			 else {
				 System.out.print("YOU LOOSE!!!");
			 }
	
	
	
	
}	
			else {
				System.out.print("Invalid Input!!!");
			}
			
}
}

