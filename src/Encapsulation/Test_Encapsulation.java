
package Encapsulation;

public class Test_Encapsulation {

	//encapsualation all variables are in private
	//to make this accesible in another class we need setter and getter
	
	//setter method
	private int a = 40;
	public void setvalue(int a) {
		
		this.a = a;
	}
	
	//getter method
	public int getvalue() {
		return(a);
	}
}
