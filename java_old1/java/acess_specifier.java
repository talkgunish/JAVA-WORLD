class A
 { // final static int i=50;......//this works
	// protected static int i=5;.....this works.
 // private static int i=5;...... this works.
 // public static int i=5;...... this works.
 // static int i=5; .....this works
 public static void main(String arg [] ) 
{ // static int i=5;.... this doesn't works cz.
		/* acess_specifier.java:7: error: illegal start of expression
        { static int i=5;*/
// public static int i=5;.... this doesn't works cz.....
		   /* acess_specifier.java:19: error: illegal start of expression
			public static int i=5;
			^
		acess_specifier.java:19: error: illegal start of expression
			public static int i=5;
				   ^
		acess_specifier.java:19: error: ';' expected
			public static int i=5;*/
// private static int i=5; .... this doesn't works cz.....
		/* acess_specifier.java:28: error: illegal start of expression
		private static int i=5;
		^
		acess_specifier.java:28: error: illegal start of expression
		private static int i=5;
				^
		acess_specifier.java:28: error: ';' expected
		private static int i=5;*/
// protected static int i=5;.... this doesn't works ....cz
	/* acess_specifier.java:28: error: illegal start of expression
        protected static int i=5;
        ^
		acess_specifier.java:28: error: illegal start of expression
        protected static int i=5;
                  ^
		acess_specifier.java:28: error: ';' expected
        protected static int i=5;*/
		
		
 //final int i=50; .....// this works
System.out.print(i);
}
}