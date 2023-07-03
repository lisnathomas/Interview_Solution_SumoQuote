

package core_Java;

public class Constructor {

	 int x;
	 int y;
	 int a;
	 int b;
	 
	 public Constructor(){
		 x=8;
		 y=9;
	 }
	 
	 //constructor with parameter
	 
	 public Constructor(int a, int b) {
		 
		//x=a;
		//y=b;
		 
		 this.a = a; //here we are using the variable a and b declared to hold the value of parametered
		 this.b = b;//variable a will hold 100 and b will hold 80/ Thus java will know which a, b is used to hold valu
		 
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		Constructor obj2 = new Constructor(100, 80);
		System.out.println("x is:" +obj.x);
		System.out.println("y is:" +obj.y);
		System.out.println("x is:" +obj2.a);
		System.out.println("y is:" +obj2.b);
		 
	}

}

//Things to remember
//1. constructor is used to initialze objects
//2. same as class name and does not have return type.
//3. constructore will called by creating objects.
//4. Every java program has constructors and whenver we create an object for that class constructors will execute by default.
//5. Even if we don't initialize a constructor java will exceuted a constructor automatically upon creation of object using class.
//6. When we call constuctor, using object, the object will only have the values onitialise
//eg: obj.x, obj.y --->u will only get these two variables from the constructor object.
