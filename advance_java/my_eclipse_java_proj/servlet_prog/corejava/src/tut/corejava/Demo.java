package tut.corejava;

public class Demo {
	
	public static void main(String[] args)throws Exception {
		
		//Class c=MyTest.class;
		Class c=Class.forName("tut.corejava.MyTest");
		
				MyTest t=(MyTest)c.newInstance();
				
				t.show();
		
	}

}
