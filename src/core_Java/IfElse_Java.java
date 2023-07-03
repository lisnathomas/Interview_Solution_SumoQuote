package core_Java;

public class IfElse_Java {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		String str1 = "Hello";
		String str2 = "Hi";
		
		if(str1.equals(str2)){ // In string, we can use equals method instead of ==
			System.out.println("Condition is true");
		}else {
			System.out.println("Condition false");
		}
		
		//======================================================
		if(a>b){
			System.out.println("Condition is matching");
		}else if(b==10){
			System.out.println("Condition is matching for b");
		}else 
			System.out.println("No condition matches");
		}
	}

