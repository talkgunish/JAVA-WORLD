interface MyAnnonymous_class
{
void sum();
}
class Test
{
public static void main(String arg[])
{
MyAnnonymous_class a=new MyAnnonymous_class()
/* here an Annonymous class gets generated automatically named "Test$1" check in Annonymous folder in desktop java folder*/{
public void sum()
{
System.out.print("this is inetraface fn");
}
};
a.sum();
}
}