class Student {
int sid;
String sname;
String saddress;
public Student(int id, String name, String address)
{
	sid= id;
	sname= name;
	saddress= address;
}
public static void main(String args[] )
{
	Student s= new Student(101, "ducat" , "fbd");
	System.out.println(s.sid + " " + s.sname + "  " + s.saddress);
Student ss=new Student(102,"amcad","dl");
	System.out.println(ss.sid + " " + ss.sname + "  " + ss.saddress);
}
}	
	