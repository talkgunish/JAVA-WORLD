class Parent
{
Parent get()
{System.out.print("this is parent get fn");
return this;
}
/*void sum(int i,int j)
{
	System.out.print(i+j);
}*/
/* here this fn gets called cz its in the parent class n ref. variable is being used of parent class...*/
}
class Child extends Parent
{
public Child get()
{
System.out.print("this is child get fn");
return this;
}
void sum(int i,int j)
{
	System.out.print(i+j);
}/*this fn doesn't works cz this is child fn n since ref. variable of parent class is being used..*/ 
public static void main(String arg[])
{
Parent p=new Child();// here since ref. variable is taken of parent class then we can only acces fns of child class which it has overrided from parent class rest fns we can't use cz ref. variable is of parent class... 
// here since ref. of parent is being taken therefore when get fn is called below using the ref. var of parent then it goes to the parent get fn and then since get fn has been overrided therefore it goes to the child get fn n prints the value of sop but the sum fn doesn't runs cz since "p" is a parent ref. variable therefore it has the the ref. for class parent therefore fns of child we can only use those which have been oerriden rest we can't use..
p.get().sum(10,10);
/*here the fn works till get() but sum doesn't gets executed cz see here carefully....
here first this fn  */
}
}
