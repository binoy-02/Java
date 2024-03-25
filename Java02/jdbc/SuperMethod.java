package jdbc;

class C{
	void display() {
		System.out.println("CCCCC");
	}
}
class D extends C {
	
	void display() {
		System.out.println("DDDDD");
		super.display();
	}
	void test() {
		display();
	}
}
public class SuperMethod {
	public static void main(String[] args) {
		D d= new D();
		d.test();
		
	}
	
}
