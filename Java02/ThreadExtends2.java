class ThreadDemo2 extends Thread
{
	String name;
	private Thread t;
	ThreadDemo2(String name1) {
		name=name1;
		System.out.println("Creating Thread "+name);
	}
	@SuppressWarnings("deprecation")
	public void run(){
		System.out.println("Running Thread is "+name);
		
			for(int i=0;i<5;i++) {
				System.out.println("Thread "+name+" "+i);
				try {
					if(i==3)stop();
					t.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			
		
	}
	
}

public class ThreadExtends2 {
	public static void main(String[] args) {
		ThreadDemo2 t1=new ThreadDemo2(" A");
		t1.start();
		ThreadDemo2 t2=new ThreadDemo2("B");
		t2.start();
		ThreadDemo2 t3=new ThreadDemo2("C");
		t3.start();
	}
}