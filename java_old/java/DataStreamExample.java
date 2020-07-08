import java.io.FileInputstream;
public class DataStreamExample
{
public static void main(String arg [])
{
try{
FileInputstream fin=new FileInputstream("abc.txt");
int i=fin.read();
System.out.print((char)i);
fin.close();
}
catch(Exception e)
{ System.out.print(e);
}
}
}
