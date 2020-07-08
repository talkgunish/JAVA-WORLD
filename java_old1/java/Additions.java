 class Additions{ 
// global variables are of no use here "(int a,b,c,d;)".
 void sum(int a,int b)
 { System.out.println(" sum is "+(a+b));
 }
 void sum(int a,int b,int c)
 { System.out.println(" sum is "+(a+b+c));
 }
 void sum(int a,int b,int c,int d)
 { System.out.println(" sum is "+(a+b+c+d)); // this is how summing is done by + symbol
 }
 public static void main( String [] agr)
 { Addition a= new Addition();
  a.sum(10,20);
  a.sum(10,20,30);
  a.sum(10,20,30,40);
  }
  }