

class A{
	final void display() {
		System.out.println("This is class A");
	}
}
 class B2 extends A{
	void display() {
		System.out.println("This is class B");
	}
}
class C2 {
 void display() {
		System.out.println("This is class C");
	}
}
public class FinalMeth {
	public static void main(String[] args) {
		C2 c =new C2();
		c.display(); //method overriding
	}
}

