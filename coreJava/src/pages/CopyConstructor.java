package pages;

class Test {
	int i, j;

	public Test(int i, int j) { 
		this.i = i;
		this.j = j;
	}

	public Test(Test obj) { // copy constructor- call by reference
		this.i = obj.i;
		this.j = obj.j;
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		Test t = new Test(5,10); 
		System.out.println(t.i+" :  "+t.j);
		
		Test t1 = new Test(t); 
		System.out.println(t1.i+" :  "+t1.j);
		
		
		String s = "Hello";
		s.toLowerCase();
		System.out.println(s);
		
 
	}

}
 