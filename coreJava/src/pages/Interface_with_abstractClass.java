package pages;

interface A {
	void one();
	void two();
	void three();
}

abstract class B implements A {
	public void two() {
		System.out.println("hello two");
	}
}

class C extends B {
	public void one() {
		System.out.println("hello one");
	}

	public void three() {
		System.out.println("hello three");
	}
}

public class Interface_with_abstractClass {
	public static void main(String[] args) {
		A a = new C();
		a.one();
		a.two();
		a.three();
	}

}
