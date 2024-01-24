 class test
{
	public void add()
	{
		int i=10;
		int j=20;
		int sum = i+j;
		System.out.println("Sum is   "+sum);
	}
}
public class noArgNoRet
{
	public static void main(String args[])
	{
		test t1=new test();
		t1.add();
	}
}

