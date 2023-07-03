package Inheritance;

public class MainClass extends Test1 {

	//static Test2 obj = new Test2();
	public static void main(String[] args) {
		
		lisna();
		jisna(4,6);
		Test2.delna();
	}

}


//things studies

//1. We extended test1. So we do not create an objecy to call the methods on test 1
//2. We can only extend one class, so if we need to call the methods on test 2 we need to create the objetc. or if it is a static then call use class name.