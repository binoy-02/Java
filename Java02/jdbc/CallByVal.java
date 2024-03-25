package jdbc;


public class CallByVal {
static void swapFn(int a,int b){
		System.out.println("before swap a="+a+"b= "+b);
		int c=a;
		 a=b;
		 b=c;
		 System.out.println("After swap a="+a+"b= "+b);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swap a="+a+"b= "+b);
		System.out.println("before swap a="+a+"b= "+b);
		swapFn(a,b);
		
	}

}
