class Reader extends Thread {
Calculator c;
public Reader ( Calculator calc)
{
c= calc;
}
public void run()
{ Synchronised(c); {
//line9
try {
System.out.println("waiting for calulation....");
c.wait();
}
catch (InterruptedException e)
{}
System.out.print("total is : " += c.total());
}
}
public static void main(String [] args)
{ Calculator calculator = new Calculator();
new Reader(calculator).start();
new Reader(calculator).start();
new Reader(calculator).start();
calculator.start();
}
}
class Calculator extends Thread {
int total;
public void run() {
synchronised(this);  {
// line 23
for(int i=0;i<100;i++)
{
total += i;
}
notifyAll();
}}}