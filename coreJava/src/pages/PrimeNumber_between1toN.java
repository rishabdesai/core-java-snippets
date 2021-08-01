package pages;

public class PrimeNumber_between1toN {

	public static void primeNo(int num) {
		int i, j;
		for (i = 0; i <= num; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (j == i)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		primeNo(10);
	}

}
