//Abstraction using Abstract class

package pages;

abstract class Shape {
	abstract void area();
}

class Rectangle extends Shape {
	void area() {
		System.out.println("Area is L * B");
	}
}

class Circle extends Shape{
	void area() {
		System.out.println("Area is 0.5 * L * B");
	}
}

public class Abstraction_using_abstractClass {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.area();
	}

}
