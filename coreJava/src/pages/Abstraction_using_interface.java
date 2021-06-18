package pages;

interface Shapes{
	void areas();
}

class Rec implements Shapes{
	public void areas() {
		System.out.println("Area is L * B");
	}
}

class Cir implements Shapes{
	public void areas() {
		System.out.println("Area is 0.5 * L * B");
	}
}

public class Abstraction_using_interface {
	public static void main(String[] args) {
		Shapes s = new Rec();
		s.areas();
	}
	
}
