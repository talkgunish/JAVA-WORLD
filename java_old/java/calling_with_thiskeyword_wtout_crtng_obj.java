// here we have used the function of student class without making new object nd by only using "this" keyword we have used sum fn
class Student
{
 public Student getobject()
{ 
return this; // returns the current class reference
}
public void sum(int x,int y)
{
System.out.print(x+y);
}
}
class Test extends Student
{
		static Student st; // here st gets the reference of the Student class n then it gets used to call the sum function below..
	Test()
	{ 
	st=super.getobject(); 
	}
public static void main(String arg [])
{
	new Test(); // constructor gets called
 st.sum(10,20);
}
}
