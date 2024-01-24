import java.lang.Thread.*;
class ThreadDemo implements Runnable 

{
	String tname;
	ThreadDemo(String name)
	{
		tname=name;
		System.out.println("Creating name"+tname);
	}
	
	public void run()
	{
		System.out.println("Running "+tname);
		try
		{
			for(int i=1;i<10;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
	}
}
public class ThreadMeth2
{
	public static void main(String args[]){
		ThreadDemo t1 =new ThreadDemo("Thread 1");
		Thread th1 = new Thread(t1);
		ThreadDemo t2 =new ThreadDemo("Thread 2");
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	}
	
}