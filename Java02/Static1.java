//Satic variable,Static Block and Static Method

public class Static1 {
	static int x=10;
	static int y;
	static void func(int a) {
		System.out.println("X "+x);
		System.out.println("Y "+y);
		System.out.println("A "+a);
	}
	public static void main(String[] args) {
		System.out.println("Main block is running");
		func(20);
	}
	static {
		// Stsic block executed before main
		System.out.println("Static block is running first");
		y=x*2;
	}
}
