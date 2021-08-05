package pages;

public class ReverseNumber {

	public static int revNumber(int num) {
		int reverse = 0;

		while (num != 0) {
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		return reverse;
	}
	
	public static void recurviceRevNumber(int num) {
		if(num <10) {
			System.out.print(num);
			return;
		} else {
			System.out.print(num%10);
			recurviceRevNumber(num/10);
		}
		
	}

	public static void main(String[] args) {
		int num = 123;
		System.out.println(num);
		int result = revNumber(num);
		System.out.println(result);
		System.out.println("-----------------");

		recurviceRevNumber(num);
		System.out.println();
		System.out.print(num);
		

	}

}
