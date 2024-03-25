class Thread1 implements Runnable{
	private String Threadname;
	public void run() {
		System.out.println("Thread is running");
	}
	Thread1(String name){
		Threadname=name;
	}
}
public class ThreadRunnable {
	public static void main(String[] args) {
		Thread1 m1=new Thread1("My Thread");
		Thread t1=new Thread(m1);
		t1.start();
		System.out.println("Thread Alive "+t1.isAlive());
		System.out.println("Thread Name "+t1.getName());
	}
}
