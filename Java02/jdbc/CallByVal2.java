package jdbc;

class SwapFn{
	static void swapFn(int a,int b){
		System.out.println("before swap a="+a+"b= "+b);//a=10 b=20
		int c=a;
		 a=b;
		 b=c;
		 System.out.println("After swap a="+a+"b= "+b);//a=20 b=10
	}
}


public class CallByVal2 {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		SwapFn sf = new SwapFn();
		sf.swapFn(a,b);
		System.out.println("before swap a="+a+"b= "+b);//a=10 b=20
		System.out.println("After swap a="+a+"b= "+b);//a=10 b=20
	
		
	}

}
