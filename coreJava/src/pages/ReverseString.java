package pages;

public class ReverseString {
	public static void main(String[] args) {
		String input = "HELLO";
		String output = "";

		System.out.println(input);

//Option1 using charAt() method		
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);

		}
		System.out.println("output using charAt() : " + output);

//Option2 - using StringBuilder and reverse() method
		StringBuilder str = new StringBuilder();
		str.append(input);
		str.reverse();
		System.out.println("using StringBuilder reverse() method : " + str);

//Option3 - using StringBuffer and reverse() method
		// convert from string to StringBuffer
		StringBuffer str1 = new StringBuffer(input);
		// reverser the string
		str1.reverse();

		System.out.println("using StringBuffer reverse() method : : " + str);
	}
}