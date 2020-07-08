import java.io.*;
import java.util.*;
import java.text.*;
import java.sql.*;
interface feeder
{
 public void ratings() throws IOException;
 public void review() throws IOException;
}
class customer
{
 public boolean r1=true,r2=true,r3=true,r4=true,r5=true;
 private String dburl="jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false";                                               
 private String username="root";                                                                           
 private String password="boobnoob";                                                                       
 public void checkrooms(int []checkin,int []checkout)
 {
  try
  {
   Connection myconn1=DriverManager.getConnection(dburl,username,password);
   Statement myst1=myconn1.createStatement();
   System.out.println("done");
   ResultSet myres1=myst1.executeQuery("SELECT * FROM room1");
   while(myres1.next())
   {
    int inmm=Integer.parseInt(myres1.getString("inmm"));
    int outmm=Integer.parseInt(myres1.getString("outmm"));
    if((checkin[1]==inmm) || (checkout[1]==outmm))
    {
     int indd=Integer.parseInt(myres1.getString("indd"));
     int outdd=Integer.parseInt(myres1.getString("outdd"));
     if((checkin[1]==inmm) && (indd<=checkin[0]))
      r1=false;
     if((checkout[1]==outmm) && (outdd>=checkout[0]))
      r1=false;
    }
   }
  }
  catch(Exception e)
  {
   System.out.println("Error");
  }
  try
  {
   Connection myconn2=DriverManager.getConnection(dburl,username,password);
   Statement myst2=myconn2.createStatement();
   ResultSet myres2=myst2.executeQuery("SELECT * FROM room2");
   while(myres2.next())
   {
    int inmm=Integer.parseInt(myres2.getString("inmm"));
    int outmm=Integer.parseInt(myres2.getString("outmm"));
    if((checkin[1]==inmm) || (checkout[1]==outmm))
    {
     int indd=Integer.parseInt(myres2.getString("indd"));
     int outdd=Integer.parseInt(myres2.getString("outdd"));
     if((checkin[1]==inmm) && (indd<=checkin[0]))
      r2=false;
     if((checkout[1]==outmm) && (outdd>=checkout[0]))
      r2=false;
    } 
   }
  }
  catch(Exception e)
  {
   System.out.println("Error");
  }
  try
  {
   Connection myconn3=DriverManager.getConnection(dburl,username,password);
   Statement myst3=myconn3.createStatement();
   ResultSet myres3=myst3.executeQuery("SELECT * FROM room3");
   while(myres3.next())
   {
    int inmm=Integer.parseInt(myres3.getString("inmm"));
    int outmm=Integer.parseInt(myres3.getString("outmm"));
    if((checkin[1]==inmm) || (checkout[1]==outmm))
    {
     int indd=Integer.parseInt(myres3.getString("indd"));
     int outdd=Integer.parseInt(myres3.getString("outdd"));
     if((checkin[1]==inmm) && (indd<=checkin[0]))
      r3=false;
     if((checkout[1]==outmm) && (outdd>=checkout[0]))
      r3=false;
    }
   }
  }
  catch(Exception e)
  {
   System.out.println("Error");
  }
  try
  {
   Connection myconn4=DriverManager.getConnection(dburl,username,password);
   Statement myst4=myconn4.createStatement();
   ResultSet myres4=myst4.executeQuery("SELECT * FROM room4");
   while(myres4.next())
   {
    int inmm=Integer.parseInt(myres4.getString("inmm"));
    int outmm=Integer.parseInt(myres4.getString("outmm"));
    if((checkin[1]==inmm) || (checkout[1]==outmm))
    {
     int indd=Integer.parseInt(myres4.getString("indd"));
     int outdd=Integer.parseInt(myres4.getString("outdd"));
     if((checkin[1]==inmm) && (indd<=checkin[0]))
      r4=false;
     if((checkout[1]==outmm) && (outdd>=checkout[0]))
      r4=false;
    }
   }
  }
  catch(Exception e)
  {
   System.out.println("Error");
  }
  try
  {
   Connection myconn5=DriverManager.getConnection(dburl,username,password);
   Statement myst5=myconn5.createStatement();
   ResultSet myres5=myst5.executeQuery("SELECT * FROM room5");
   while(myres5.next())
   {
    int inmm=Integer.parseInt(myres5.getString("inmm"));
    int outmm=Integer.parseInt(myres5.getString("outmm"));
    if((checkin[1]==inmm) || (checkout[1]==outmm))
    {
     int indd=Integer.parseInt(myres5.getString("indd"));
     int outdd=Integer.parseInt(myres5.getString("outdd"));
     if((checkin[1]==inmm) && (indd<=checkin[0]))
      r5=false;
     if((checkout[1]==outmm) && (outdd>=checkout[0]))
      r5=false;
    }
   }
  }
  catch(Exception e)
  {
   System.out.println("Error");
  } 
 }
 void confirmbooking(String n,String str,String c,String s,int p,long ph,int cdin,int cmin,int cdout,int cmout,int roo)
 {
  try
  {
   Connection myconn=DriverManager.getConnection(dburl,username,password);
   Statement myst=myconn.createStatement();
   ResultSet myres=myst.executeQuery("SELECT * FROM customer");
   String query="insert into customer(name,street,city,state,pin,phonenum,indd,inmm,outdd,outmm,room) values('"+n+"','"+str+"','"+c+"','"+s+"',"+p+","+ph+","+cdin+","+cmin+","+cdout+","+cmout+","+roo+");";
   myst.executeUpdate(query);
   System.out.println("done");
   String q=null;
   if(roo==1)
    q="insert into room1(name,indd,inmm,outdd,outmm,bill) values('"+n+"',"+cdin+","+cmin+","+cdout+","+cmout+",0);";
   else
   if(roo==2)
    q="insert into room2(name,indd,inmm,outdd,outmm,bill) values('"+n+"',"+cdin+","+cmin+","+cdout+","+cmout+",0);";  
   else
   if(roo==3)
    q="insert into room3(name,indd,inmm,outdd,outmm,bill) values('"+n+"',"+cdin+","+cmin+","+cdout+","+cmout+",0);";
   else
   if(roo==4)
    q="insert into room4(name,indd,inmm,outdd,outmm,bill) values('"+n+"',"+cdin+","+cmin+","+cdout+","+cmout+",0);"; 
   else
   if(roo==5)
    q="insert into room5(name,indd,inmm,outdd,outmm,bill) values('"+n+"',"+cdin+","+cmin+","+cdout+","+cmout+",0);"; 
   myst.executeUpdate(q);
   System.out.println("done");
  }
  catch(Exception e)
  {
   System.out.println("Error");
  } 
 }
} 
class book
{
 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
 private byte room=0;
 private int dentry=0,mentry=0,dexit=0,mexit=0,pin=0,rm=0,loop=0;
 private long phonenum=0;
 private String name,street,city,state,com;
 private boolean payment=false;
 customer enter=new customer();
 public void getInfo(int cin[],int cout[]) throws IOException
 {
  System.out.println("PLEASE ENTER YOUR NAME         :");
  name=buf.readLine();
  System.out.println("PLEASE ENTER YOUR STREET       :");
  street=buf.readLine();
  System.out.println("PLEASE ENTER YOUR CITY         :");
  city=buf.readLine();
  System.out.println("PLEASE ENTER YOUR STATE        :");
  state=buf.readLine();
  System.out.println("PLEASE ENTER YOUR PINCODE      :");
  com=buf.readLine();
  pin=Integer.parseInt(com);
  System.out.println("PLEASE ENTER YOUR PHONE NUMBER :");
  com=buf.readLine();
  phonenum=Long.parseLong(com);
  dentry=cin[0];
  mentry=cin[1];
  dexit=cout[0];
  mexit=cout[1];
 }
 public int makepayment(boolean r1,boolean r2,boolean r3,boolean r4,boolean r5) throws IOException
 {
  while(loop==0)
  {
   System.out.println("****************************************************************************************************************************");
   System.out.println("DELUX ROOM         :Rs.5000.00/per Night");
   System.out.println("SUITE              :Rs.7000.00/per Night");
   System.out.println("PRESIDENTIAL SUITE :Rs.10000.0/per Night");
   System.out.println("PLEASE SELECT YOUR ROOM :(PRESS 1 FOR OPTION 1 , 2 FOR OPTION 2 AND 3 FOR OPTION 3)");
   com=buf.readLine();
   rm=Integer.parseInt(com);
   switch(rm)
   {
     case 1:  System.out.println("PRESS ONE TO CONFIRM YOUR BOOKING FOR DELUX ROOM AND FOR RESELECTION PRESS 0");
              com=buf.readLine();
              loop=Integer.parseInt(com);
              if(loop!=0)
              { 
               if(r1==false)
               {
                System.out.println("SORRY THIS ROOM IS UNAVAILABLE FOR THIS DATE");
                room=0;
                return room;
               } 
              else
               room=1;
              }   
              break;
     case 2:  System.out.println("PRESS ONE TO CONFIRM YOUR BOOKING FOR SUITE AND FOR RESELECTION PRESS 0");
              com=buf.readLine();
              loop=Integer.parseInt(com);
              if(loop!=0)
              { 
               if(r2==false && r3==false)
               {
                System.out.println("SORRY THIS ROOM IS UNAVAILABLE FOR THIS DATE");
                room=0;
                return room;
               }    
               else
               if(r2==true)
                room=2;
               else
                room=3;
              }
              break;
     case 3:  System.out.println(" PRESS ONE TO CONFIRM YOUR BOOKING FOR PRESIDENTIAL SUITE AND FOR RESELECTION PRESS 0");
              com=buf.readLine();
              loop=Integer.parseInt(com);
              if(loop!=0)
              { 
               if(r4==false && r5==false)
               {
                System.out.println("SORRY THIS ROOM IS UNAVAILABLE FOR THIS DATE");
                room=0;
                return room;
               } 
               else
               if(r4==true)
                room=4;
               else
                room=5;
              }
              break;
   }
  }
  System.out.println("SPECIFY PAYMENT STATUS:(1->DONE , 0->INCOMPLETE)");
  com=buf.readLine();
  loop=Integer.parseInt(com);
  if(loop==1)
  payment=true;
  return 1;
 }
 public void displayconfirmation()
 {
  enter.confirmbooking(name,street,city,state,pin,phonenum,dentry,mentry,dexit,mexit,room); 
  System.out.println("NAME           : "+name);
  System.out.println("ADDRESS        : "+street+" , "+city);
  if(payment==true)
   System.out.println("PAYMENT STATUS : COMPLETED");
  else
   System.out.println("PAYMENT STATUS : PENDING  ");
 }
}
class Services
{
  double checkout=0.0,restaurantbill=0.0,extraservice=0.0,totcout=0.0,gst=5.0;
  private int staffstrength=0,i=0,tb=0,x=1,rm=0;
  private String[] staffname=new String[20];
  private String y="done",nm=null,date=null,dt=null;
  private String dburl="jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false";                                               
  private String username="root";                                                                           
  private String password="boobnoob";                                                                
 public void staff_entry() throws IOException
 {
  try
  {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   Connection myconn1=DriverManager.getConnection(dburl,username,password);
   Statement myst1=myconn1.createStatement();
   System.out.println("Please enter today's date as dd/mm");
    date=br.readLine();
   do
    {
     System.out.println("Enter name, (when done enter 'done')");
     staffname[i]=br.readLine();
     if(staffname[i].equals(y)==true)
      x=0;
     else
      myst1.executeUpdate("insert into staff(date,name) values('"+date+"','"+staffname[i]+"');");
     i++;
    }
   while(x==1);
  }
  catch(Exception e)
  {
   System.out.println("error staff");
  }
 }
 public void staffcount()
 {
  try
  {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
   System.out.println("Please enter a date for staff attendance");
   dt=br.readLine();
   Connection myconn1=DriverManager.getConnection(dburl,username,password);
   Statement myst1=myconn1.createStatement();
   ResultSet s=myst1.executeQuery("select * from staff where date in ('"+dt+"') ;");
   while(s.next())
   {
    staffstrength++;
   }
   System.out.println("********************************************************");
   System.out.println("********************************************************");
   System.out.println("********************************************************");
   System.out.println("The total count is = "+staffstrength+" on the date : "+dt);
   System.out.println("********************************************************");
   System.out.println("********************************************************");
   System.out.println("********************************************************");
  }
  catch(Exception e)
  {
   System.out.println("error sf"); 
  }  
 }
 public void checkout_bill() throws IOException
 {
  try 
  {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   Connection myconn1=DriverManager.getConnection(dburl,username,password);
   Statement myst1=myconn1.createStatement();
   System.out.println("Please enter your room number");
   rm=Integer.parseInt(br.readLine());
   System.out.println("Please enter your name");
   nm=br.readLine();
   System.out.println("Enter restaurant bill:");
   restaurantbill=Double.parseDouble(br.readLine());
   System.out.println("Enter other service bill:");
   extraservice=Double.parseDouble(br.readLine());
   checkout=restaurantbill+extraservice;
   totcout=checkout+((checkout*gst)/100.0);
   totcout=Math.ceil(totcout);
   tb=(int)totcout;
   myst1.executeUpdate("update room"+rm+" set bill = "+tb+" where name='"+nm+"';"); 
  }
  catch(Exception e)
  {
   System.out.println("error serv");
  }
 }
 public void billprint()
 {
  System.out.println("Total Bill= Rs."+totcout);
 }
} 
class booking          
{
 public void book() throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String cin,cout;
  book conf=new book(); 
  int t=0,i=0;;
  int ci[]=new int[3];
  int co[]=new int[3];
  System.out.println("WELCOME TO HOTEL BOOKING SERVICES");
  System.out.println("WE HAVE A VARIETY OF ROOMS AVAILABLE");
  System.out.println("CHECK IN TIME IS 12:00 PM AND CHECK OUT TIME IS 1:00 PM");
  System.out.println("PLEASE GIVE US YOUR CHECK IN DATE  (ENTER IT AS DD/MM) ");
  cin=br.readLine();
  String[] enter=cin.split("/");
  System.out.println("PLEASE GIVE US YOUR CHECK OUT DATE (ENTER IT AS DD/MM) ");
  cout=br.readLine();
  String[] exit=cout.split("/");
  for(i=0;i<2;i++)
  {
   ci[i]=Integer.parseInt(enter[i]);
   co[i]=Integer.parseInt(exit[i]);
  }
  customer create=new customer();
  create.checkrooms(ci,co);
  if((create.r1==false) && (create.r2==false) && (create.r3==false) && (create.r4==false) && (create.r5==false)) 
   System.out.println("Sorry no rooms are available for this date");
  else
  {
   t=conf.makepayment(create.r1,create.r2,create.r3,create.r4,create.r5);
   if(t!=0)
   {
    conf.getInfo(ci,co);
    conf.displayconfirmation();
   }
  }
 }
}
class feedback implements feeder
{
 private String dburl="jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false";                                               
 private String username="root";                                                                           
 private String password="boobnoob";
 private String improv=null,complaint=null,praise=null,com,query=null; 
 private int room,ratser=0,ratamb=0,ratstaf=0,ratroom=0,select=0;
 public void ratings() throws IOException
 {
  BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("******************** PLEASE GIVE US YOUR FEEDBACK ********************");
  System.out.println("PLEASE ENTER YOUR ROOM NUMBER");
  com=buf.readLine();
  room=Integer.parseInt(com);
  System.out.println("PLEASE RATE ON THE SCALE OF 5");
  System.out.println("RATE OUR ROOM INTERIOR");
  com=buf.readLine();
  ratroom=Integer.parseInt(com);
  System.out.println("RATE OUR ROOM SERVICE");
  com=buf.readLine();
  ratser=Integer.parseInt(com);
  System.out.println("RATE OUR AMBIENCE");
  com=buf.readLine();
  ratamb=Integer.parseInt(com);
  System.out.println("RATE OUR STAFF");
  com=buf.readLine();
  ratstaf=Integer.parseInt(com);
 }
 public void review() throws IOException
 {
  BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("FOR FURTHER SUGGESTIONS PLEASE :");
  System.out.println("PRESS 1 FOR IMPROVEMENTS :");
  System.out.println("PRESS 2 FOR COMPLAINT    :");
  System.out.println("PRESS 3 FOR COMPLIMENT   :");
  com=buf.readLine();
  select=Integer.parseInt(com);
  switch(select)
  {
   case 1: System.out.println("PLEASE TELL US WHERE WE CAN IMPROVE");
           improv=buf.readLine();
           break;
   case 2: System.out.println("PLEASE SPECIFY YOUR COMPLAINT");
           complaint=buf.readLine();
           break;
   case 3: System.out.println("PLEASE TELL US WHAT DID YOU LIKE");
           praise=buf.readLine();
           break;
  }
  System.out.println("THANK YOU FOR YOUR FEEDBACK WE HOPE YOU DO VISIT US AGAIN");
  System.out.println("*********************************************************");
  System.out.println("*********************************************************");
  System.out.println("*********************************************************"); 
 }
 public void datasend()
 {
  try
  {
   Connection myconn1=DriverManager.getConnection(dburl,username,password);
   Statement myst1=myconn1.createStatement();
   if(select==1)
    query="insert into feedback(room,inter,ser,amb,staff,ext) values("+room+","+ratroom+","+ratser+","+ratamb+","+ratstaf+",'"+improv+"');";
   else 
   if(select==2)
    query="insert into feedback(room,inter,ser,amb,staff,ext) values("+room+","+ratroom+","+ratser+","+ratamb+","+ratstaf+",'"+complaint+"');";
   else
   if(select==3)
    query="insert into feedback(room,inter,ser,amb,staff,ext) values("+room+","+ratroom+","+ratser+","+ratamb+","+ratstaf+",'"+praise+"');";
   myst1.executeUpdate(query);
  }
  catch(Exception e)
  {
   System.out.println("error");
  }  
 }
}  
public class hm
{
 public static void (String [] args) throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int ch,c=1;
  System.out.println("menu");
  while(true)
  {
   System.out.println("1.Room booking");
   System.out.println("2.Staff entry");
   System.out.println("3.Staff count");
   System.out.println("4.Checkout bill");
   System.out.println("5.Feedback");
   System.out.println("Press any key to exit");
   Scanner in= new Scanner(System.in);
   ch=in.nextInt();
   switch (ch) 
   {
    case 1:booking b1=new booking();
           b1.book();
           break;
    case 2:Services s1=new Services();
           s1.staff_entry();
           break;
    case 3:Services s=new Services();
           s.staffcount();
           break;
    case 4:Services s2=new Services();
           s2.checkout_bill();
           s2.billprint();
           break;
    case 5:feedback f1=new feedback();
           f1.ratings();
           f1.review();
           f1.datasend();
           break;
    default : c=0; 
   }  
   if(c==0)
    break;
  }
  System.out.println("END");
 }
}