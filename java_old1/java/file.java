// here we are counting the no. of files n folders present in a given specific location..
import java.io.*;//here we have imported the io package from java cz these file and directory fns are in the io package
class MyFile 
{
	public static void main(String arg [])throws IOException // since an io excepion for the file not found can come
{ 
int t=0,fi=0,d=0; // t=total,fi=no. of files,d=no. of directories.. 
	//File f=new File("E:/java/abc.txt"); // for creating file in specified path
//File f=new File("abc.txt"); // for creating file in same directory
//System.out.print(f.exists()); // this checks whether the files exists there or not
//f.createNewFile(); // this creates a new file
//File f=new File("E:/Sem 1/ducat/java(dec17)/javaprac");
//f.mkdir(); // this creates a folder
File f=new File("E:/Sem 1/ducat/java(dec17)/javaprac"); // creates a new folder
//f.isDirectory(); // checks for the directroy
String s[]=f.list(); // this h=checks for each item in that path may it be file or folder n counts all n stores n a string array s[]...
System.out.println("total length = "+s.length); // length is a predefined fn
/*for(int i=0;i<s.length;i++)
{ System.out.println(s);

//f.isFile(); 
String c[]=f.listFiles();*/
for( String ss: s)
{
	/*
if(c==s)
{
	//System.out.println(ss);
fi++;
}
*/

File ff=new File(f ,ss);
if(ff.isDirectory()){ // this checks for the directory
	
	d++;

}
else if(ff.isFile())// this checks for the file
{
		System.out.println(ss);
		fi++;
}

}
System.out.println(" file is = "+fi + " directory is = " + d);
//d=t-fi;
//System.out.print( " total directory are = " + d + " total files are " + fi);
}
}