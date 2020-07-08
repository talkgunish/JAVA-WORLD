//This is a word guess game....admin logins and putsa word and the user has to guess the word..
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
					 Console con=System.console(); // console is a class which is being used here so that when the user enters the word to be guessed then that doesn't shows up on the console
					 char gameword[]=con.readPassword(); // readpassword is a method of console class that automatically returns the input in char array...
					 //String gw=sc.next(); //here in gw the word was being entered earlier but now that is being done by the above line of readpassword method
					 char []dash=new char[gameword.length]; //creates an array named dash of length = the length of array in which admin gave the word to be guessed ie.gameword  array
					 chance=gameword.length; // total chance equals the number of letters
					//char gameword[]=gw.toCharArray();
						for(int i=0; i<dash.length;i++)// loop that stores "_" ie. dashes in the dash array
						{
							dash[i]='_';
						}
					System.out.println("WELCOME PLAYER");
					System.out.println("You have got "+/*gameword.length*/chance+" chances to win!!"); // player gets chances equal to number of letters in word
					System.out.println("Lets Play");			
						for(int j=0;j<gameword.length;)// outer loop for every new chance as new iteration
						{ 
							System.out.println("Enter your guess");
								for(int i=0; i<gameword.length;i++)// printing dash array with till then guessed words 
								{
									System.out.print(dash[i]);
								}			
							System.out.println(" ");
							char letter=sc.next().charAt(0); //this takes the new guessed letter as string with the help of scanner class object and stores it in a variable "letter" and converts it into character array by "charAt" method					
								for(int x=0;x<gameword.length;x++)// loop for checking if guessed character is there in the toguess word...if such then it replaces that position of "_" in dash array by the correctly guessed word...
								{ 
									if(letter==gameword[x])
									{  
									dash[x]=letter;
									}
								}
								for(int z=0;z<gameword.length;z++)// this prints out the new dash array with the correctly guessed letter
								{
									System.out.print(dash[z]);
								}
							chance--;// this iterator reduces chance at every guess
							System.out.println("Left chances="+chance);
							System.out.println("Try again");
							j++;//incrementor for outer loop
						}		
							for(int p=0;p<gameword.length;p++)//loop to check at end that does the dash array contains all characters or still has "_" due to wrongly guessed character. 
							{ 
								String convdash=String.valueOf(dash[p]);// converts character at each index from dash array to a variable convdash
									if(convdash.equals("_"))//checks each n every value stored in dash array by converting char value stored in char dash array into string 
									{  
										set--;
									}
									else
									{
										set++;
									}
							}
									if(set==gameword.length)//if set equals to total length of letters entered by the admin that means user guessed the characters rightly hence he won
									{		 
										System.out.print("YOU WON!!!!");
									}	 
									else// if still at any place there is a "_" left then the persons loses...
									{
										System.out.print("YOU LOOSE!!!");
									}
				}	
					else // if anything apart from the admin login ie. "yes" is being entered then its an invalid input...
					{
						System.out.print("Invalid Input!!!");
					}
		}
	}