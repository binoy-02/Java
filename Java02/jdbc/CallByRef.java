package jdbc;
class Cnum{
	public int a;
}
class SwapFn1{
	static void swapFn2(Cnum p,Cnum q){
		System.out.println("inside function before swap a="+p.a+"b= "+q.a);
		int c=p.a;
		 p.a=q.a;
		 q.a=c;
		 System.out.println("inside function After swap a="+p.a+"b= "+q.a);
	}
}


public class CallByRef {
	
	public static void main(String[] args) {
		Cnum obj1= new Cnum();obj1.a=10;
		Cnum obj2= new Cnum();obj2.a=20;
		SwapFn1 sf = new SwapFn1();
		System.out.println("before swap a="+obj1.a+"b= "+obj2.a);
		sf.swapFn2(obj1,obj2);
		
		System.out.println("After swap a="+obj1.a+"b= "+obj2.a);
		
		
	}

}
