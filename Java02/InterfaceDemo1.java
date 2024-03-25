class Computer{
	
}
class Laptop extends Computer{
	public void show() {
		System.out.println("Slower");
	}
}
class Desktop extends Computer{
	public void show() {
		System.out.println("Faster");
	}
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		void work() {
			
		}
		Computer obj =new Laptop();
		Computer obj2 =new Desktop();
		obj.disp();
		
	}
	
}
