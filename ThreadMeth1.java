import java.lang.Thread.*;
class ThreadDemo extends Thread

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
public class ThreadMeth1
{
	public static void main(String args[]){
		ThreadDemo t1 =new ThreadDemo("Thread 1");
		t1.start();
		ThreadDemo t2 =new ThreadDemo("Thread 2");
		t2.start();
	}
	
}