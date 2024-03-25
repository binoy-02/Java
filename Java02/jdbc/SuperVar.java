package jdbc;

class A{
	int i=10;
}
class B extends A{
	int i=20;
	void print() {
		System.out.println("Super variable is "+super.i);
	}
}
public class SuperVar {
	public static void main(String[] args) {
		B b= new B();
		b.print();
		System.out.println("  ");
	}
	
}
