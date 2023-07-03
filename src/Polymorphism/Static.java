package Polymorphism;

public class Static {

	static Dynamic obj1 = new Dynamic();
	static Main obj2 = new Main();
	public static void main(String[] args) {
		
		sum();
		sum(7,8); //method overloading
		obj1.lisna();
		obj2.lisna();
		

	}
	
	public static void sum() {
		
		int a=2;
		int b=3;
		
		System.out.println((a+b));
	}
	
	public static void sum(int a, int b) {
		
		System.out.println((a+b));
	}

}
