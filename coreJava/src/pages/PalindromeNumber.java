package pages;

public class PalindromeNumber {
	public static void reverserNumber(int num) {
		int original = num;
		int reverse = 0;

		while (num != 0) {
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		if (original == reverse)
			System.out.println("number " + original + " is Palindrome ");
		else
			System.out.println("number " + original + " is not Palindrome");
	}

	public static void main(String[] args) {
		int num = 12321;
		reverserNumber(num);
	}
}