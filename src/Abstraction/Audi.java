package Abstraction;

public class Audi extends Cars implements Test1_Interface, Test2_Interface {


//==================================================================================================
	//following is the method from super class cars. Also all the method from cars will be in this class
	@Override
	public void color() { //from class car the abstarcted methos
		System.out.println("I am white in color");
		
	}
	
//===================================================================================================
	//following is the method from interface test1_interface

	@Override
	public void run() { // from interface 
		// TODO Auto-generated method stub
		
	}
	
//====================================================================================================
	//following are the mthods from test2_interface

	@Override
	public void happy() { 
		System.out.println("I am so happy");
		
	}

	@Override
	public void sad() {
		System.out.println("I am so sad");
		
		
	}

}
