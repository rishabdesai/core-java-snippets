// Given an array of integer, write a function to return minimum element from this input array.

package pages;

public class LowestNumberInArray {
	public static int lowestNumber(int[] arr) {
		
		
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(min> arr[i])
				min =arr[i];
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,3,9,2};
		int result = lowestNumber(arr);
		System.out.println(result);
		
	}

}
