package core_Java;

public class Arrays_Java {
	

	//static Methods_java ob= new Methods_java();
	public static void main(String[] args) {
		
		//Methods_java.sum(); --static method of a different class can be called using the class name.
		//ob.multiply();
//=======================================================================================================================	
		String[] strarray = {"Hello", "Hi", "hey"};
		for (int i=0;i<strarray.length;i++) { //if we know the size we can put the number eg:4
			System.out.println(strarray[i]);
		}

		
		
//================================================================================================
		//creating array using second method

		String[] strarray1 = new String[3];
		strarray1 [0] = "HI";
		strarray1 [1] = "sit";
		strarray1 [2] = "walk";
		
		
		for (int i=0;i<strarray1.length;i++) { 
			System.out.println(strarray1[i]);
		}

		
//====================================================================================================
		//multidimensional array
		
		int[][] marray = new int[2][3];//dynamic size--size has allocated
		marray[0][0] = 1;
		marray[0][1] = 2;
		marray[0][2] = 3;
		marray[1][0] = 4;
		marray[1][1] = 5;
		marray[1][2] = 6;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.println(marray[i][j]);
				
			}
		}

		
//=============================================================================================================
		//second way to use multidimensional array and printing smallest of the array.
		
		int [][] tarray = {{9,2,3},{4,5,6}}; //dynamic size -->no size mentioned
		
		int min = tarray[0][0];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				if(tarray[i][j]<min) {
					min = tarray[i][j];
				}
			}
			
		}
		
	System.out.println("min is" +min);
	
	}
	
	
	
	
//==============================================================================================================	
	
	//just a method for tetsing 
	
public static void multy() {
		
		int x = 10;
		int y = 5;	
System.out.println("Multiplication is:" +(x*y));
	}

	}


