//call by value

package pages;

class Swapping {
	int num1;
	int num2;

	public void swap(int num1, int num2) { //call by value
		this.num1 = num1;
		this.num2 = num2;

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("inside swap(int num1, int num2)  num1 : " + num1 + "   :   " + num2);
	}
	
	public void swap(Swapping s) {  //call by reference
		int temp = s.num1;
		s.num1 = s.num2;
		s.num2=temp;
		System.out.println("inside swap(Swapping s) num1 : " + num1 + "   :   " + num2);
	}
	

}

public class SwapValues {

	public static void main(String[] args) {
		
		Swapping s = new Swapping();
		int n1=10;
		int n2=20;
		System.out.println("Before swap swap(int num1, int num2) = "+n1+"  :  "+n2);
		s.swap(n1, n2);
		System.out.println("After swap swap(int num1, int num2) = "+n1+"  :  "+n2);
		System.out.println("---------------------------------------------");
		Swapping s1 = new Swapping();
		s1.num1=10;
		s1.num2=20;
		System.out.println("Before swap swap(Swapping s) = "+s1.num1+"  :  "+s1.num2);
		s.swap(s1);
		System.out.println("After swap swap(Swapping s) = "+s1.num1+"  :  "+s1.num2);

	}

}
