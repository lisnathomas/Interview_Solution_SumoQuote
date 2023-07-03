package core_Java;

public class Methods_java {

	static Methods_java obj1 = new Methods_java();
	//static Arrays_Java obj2 = new Arrays_Java();//there is a method in Arrays_java class. So, in order to call that creating an object for the class
	public static void main(String[] args) {
		
		sum(); //Does not need an object since we decaled sum() method as static
	    
		obj1.multiply();//calling using the object since it wasn't a static method
	    
	    Arrays_Java.multy(); //if we declared a static method on different class we can call it here using the class name of that class. No obejct needed since it was a static class.
	    
	    division(4,2); //passing values for the method that has parameters.
	    
	    int d =   sub(90,30);//returned method. When a value is returned from a method it needs an another variable to hold it. That is here "d".
	    System.out.println("the sub is:" +d);
	}

	public static void sum() { //static method
		
		int x=2;
		int y=9;
		System.out.println("sum is" +(x+y));
	}
	
	public void multiply() { //non static method
		
		int a=2;
		int b=8;
		System.out.println("Multiply" +(a*b));
	}
	
	//with parameters. 
	
	public static void division(int c, int d) {
	int z =  c/d;
	System.out.println("Division is:" +z);
}
	public static int sub (int x, int y) {
		int c = x-y;
		return c;
		
	}
}


//=================================================================================================================

//Here we studied following things:

//1. Creating a method using static keyword, so we can call the method without creating an object.
//2. Creating an object without using static keyword, so we have to create an object using the class name and static keyword. Then use the objct to call the method.
//3. Methods with parameter.
//4. Methods which will return values.
//5. Static methods in this class can be called in another class using the class name.method name. See eg: Arrays_Java.multy();Multy is the static method on arrays class.
//5. We can call these method in a different class by creating the object of this class (Methods_java) in the other class. Examples creted in arrays class
//6. If we are returning a value, we need an another variable to hold it. Here we returned c, then we have 'd' to hold it. Then we print d




