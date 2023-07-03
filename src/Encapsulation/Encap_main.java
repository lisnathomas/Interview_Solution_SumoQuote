package Encapsulation;

public class Encap_main {

	public static void main(String[] args) {
		Test_Encapsulation obj = new Test_Encapsulation();
		System.out.println("The value is:" +obj.getvalue());//this will not have access to set value so no parameters will passed. It will execute getter and returns value of the private integer decalred. 
		
		obj.setvalue(100);//this will go to set value method and prints 100
		System.out.println("The value is:" +obj.getvalue());
	}

}


//thimls to remember:

//1. Encapsualtion will hide sensitive data from users.
//2. To achive this we must declare variables as privat
//3. But if we need these private variable to use in an another class we need getter and setter method.
//4. Setter will set the value and getter will get the value. 
//5. then we can create the object of the private class in the other class. Then we can access the methods. 
//6. If we are just calling the getter, it will prints the valus of private variable in the private class.
//7. Or we can pass value to setter method and setter will take the value passses see example aboue.
//8. If we are passing the value as an argument, we will use the private variable declared to hold the value. For that purpose
//    we will use the keyword "this". This keyword will refer to the current object in a method or condtructor.
//    So that this will help to eliminate the ambiguity between instance variable and paramter