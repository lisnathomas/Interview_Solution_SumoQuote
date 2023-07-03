package core_Java;

public class Test_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// All keywords are in Red colour and starts with lower case
		
		System.out.println("Hello World");
		System.out.print("How is your day");
		System.out.println("How are you");
		System.out.println("Hi");
		
		// Different data Types in Java
		//byte range is -127 to 127
		byte a=30;
		byte b = 20;
		byte c = (byte) (a+b);
		System.out.println(c);
	
		// short range is -32,768 to 32,767
		short d = 890;
		System.out.println(d);
		
		// int range is -2,147,483,648 to 2,147,483,648 -2^32 to 2^32
		int e = 55585;
		 e = 6789;
		System.out.println(e);
		
		long f = 65641256; //-2^64 to 2^64
		System.out.println(f);
		
		float x = (float) 2.10;
		System.out.println(x);
		
		double y = 3.12456;
		double z = 53687;
		System.out.println(y);
		System.out.println(z);
		
		char k='a';
		System.out.println(k);
		
		//String is a class in Java not a datatype
		String str = "How are you";
		// Classname Odjname = new Classname();
		String newstr = new String("Hello World");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(newstr);
		
		boolean t = false;
		System.out.println(t);
				
		
		
	}
	
	

}
