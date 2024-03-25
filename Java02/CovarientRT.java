

 class A5{
	public A5 disp() {
		System.out.println("Parent A");
		return(this);
	}
}
class B5 extends A5{
	public  B5 disp() {
		System.out.println("Child B");
		return(this);
	}
}
public class CovarientRT {
	public static void main(String[] args) {
		A5 a = new A5();
		a.disp();
		B5 b  = new B5();
		b.disp();
	}
}
