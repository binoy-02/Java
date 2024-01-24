public class Writeonfile
{
	public static void main(String args[])
	{
		FileOutputStream f = new FileOutputStream("E:\\Binoy/JAVA/test.txt");
		System.out.println("ENter data ..... Stop with #");
		while(true)
		{
			DataInputStream dis = new DataInputStream(System.in);
			String d=dis.readLine();
			if (d.equals('#'))break;
			else
			{
				f.write(d.getBytes());
				f.write("\r\n".getBytes());
			}
		}
	}
}