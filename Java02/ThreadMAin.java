
public class ThreadMAin {
	public static void main(String[] args) {
		Thread t = new  Thread();
		System.out.println("Current thread is "+t);//name,priority,where
		t.setName("binoy");
		System.out.println("Current thread is "+t);
		System.out.println("Current thread is "+t.getName());
		System.out.println("Current thread Priority is "+t.getPriority());
		t.setPriority(4); 
		System.out.println("New Priority is "+t.getPriority());
		try {
			for(int n=5;n>0;n--)
			{
				System.out.println(n);
				t.sleep(1000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	}
