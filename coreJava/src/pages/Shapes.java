/*
  "In your program, create a parent class named Shape. This class will have two variables: 
  height and width. It will have a method to enter the values for height and width. 
  Create a separate child class named Rectangle. This class will have a method to calculate 
  the area of a rectangle with the height and width entered and output the result. 
  Create a separate child class named Triangle. This class will have a method to calculate 
  the area of a triangle with the height and width entered and output the result. 
  In your main method, create a scanner to have the user enter height and width, 
  then create new rectangle and triangle objects and output their areas."
  */
package pages;
import java.util.Scanner;

class Shape {
	 int height;
	 int width;
}

class Rec extends Shape {

	public int area_cal() {
		return height * width;
	}
}

class Tri extends Shape {

	public int area_cal() {
		return (int)(0.5 * height * width);
	}
}

public class Shapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter height ");
		int h = sc.nextInt();
		
		System.out.println("enter width ");
		int w = sc.nextInt();
		
		Rec r = new Rec();
		r.height=h;
		r.width=w;
		int area1 = r.area_cal();
		System.out.println("rec are is "+area1);
		
		Tri t = new Tri();
		t.height=h;
		t.width=w;
		int area2 = t.area_cal();
		System.out.println("tri are is "+area2);
		
		sc.close();
	}

}
