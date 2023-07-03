package Abstraction;

public class InterfaceMain {

	
	//static BMW obj1= new BMW();
	static Audi obj2 = new Audi();
	
	public static void main(String[] args) {
		obj2.gear(); //from parent class cars
		obj2.color();//from parent class cars
		obj2.engine(); //from parent class cars
		
		obj2.run();//from test1_interface which implemented to Audi
		
		obj2.happy();//from test2_interface which implemented to Audi 
		obj2.sad();//from test12_interface which implemented to Audi
		
	}

}

//1. Interface is to achive 100 percent abstarction.
//2. Cannot create an object for an interface.
//3. use the keyford to "implement" to use interface in another class
//4. Once implemented in a different class we can change the behaviour of the interface.
//eg: we are going to implement this on Audi class
//5. Can implement n number of class
//interface only have abstract method which does not have body
//6. if we are implementing an interface all methods in interface will be get into the other class.