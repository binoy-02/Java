
public class ExceptionJava1 {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println("Lengthof string "+s.length());
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred");
			
		}
		try {
			int a=10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			int num[]= {1,2,3,4};
			System.out.println(num[10]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String s="abcde";
			int a=Integer.parseInt(s);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
