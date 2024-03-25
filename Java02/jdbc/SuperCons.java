package jdbc;

class E{
	 E() {
		System.out.println("EEEEE cConstructor");
	}
}
class F extends E {
	
	F() {
		System.out.println("FFFFF Constructor");
		
	}
	void test() {
		
	}
}
public class SuperCons {
	public static void main(String[] args) {
		F f = new F();
	}
		
	}
	
