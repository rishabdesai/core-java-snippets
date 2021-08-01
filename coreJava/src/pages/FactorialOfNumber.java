package pages;

public class FactorialOfNumber {

	public static int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		int fact = factorial(5);
		System.out.println(fact);
	}

}
