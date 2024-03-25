class ThreadDemo extends Thread
{
	String name;
	ThreadDemo(String name1) {
		name=name1;
		System.out.println("Creating Thread "+name);
	}
	public void run(){
		System.out.println("Running Thread is "+name);
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread "+i);
				//t1.sleep(1000);
			}
		}
			
		 catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

public class ThreadExtends {
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo("Binoy");
		t1.start();
		//ThreadDemo t2=new ThreadDemo();
		//t2.start();
	}
}
