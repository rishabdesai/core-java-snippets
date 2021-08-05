package pages;

public class FactorialOfNumber {

	public static int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}
	
	  public static int recFactorial(int n) {
	        if(n<0)
	            return -1;
	        if (n == 1 || n == 0)
	            return 1;
	        return n * recFactorial(n - 1);
	    }
	  

	public static void main(String[] args) {
		int fact1 = factorial(5);
		System.out.println("factorial is : "+fact1);
		
		int fact2 = recFactorial(5);
		System.out.println("recursive factorial is : "+fact2);
	}

}
