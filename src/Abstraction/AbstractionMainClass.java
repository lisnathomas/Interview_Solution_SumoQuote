package Abstraction;

public class AbstractionMainClass {

	static BMW obj1= new BMW();
	static Audi obj2 = new Audi();
	public static void main(String[] args) {
		
		obj1.color();
		obj2.color();
		
	}

}

//things to remember
//1. In this case methods engine and gear will be common for all cars. But color will be different. So we created abstract for color
//2. If there is one abstract method we need to create the class as abstract by default. 
//3. When we create a child class for this class there wil be an error, it can resolve by implementing the abstarct method to child class
//4. Basically if parent class has a method which has a different behaviour in all child classes we can make it as abstract.
//5.Abstract does not have a body.The body will be provided by the inherited child class.
//5. Abstract class can't create an object. so it is non-access modifier
//6. Abstract class is a restricted class, it must be inherited from another class.
//7. Abstract class can have regulat methods as well as abstract methods.
