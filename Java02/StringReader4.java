import java.util.Scanner;

public class StringReader4 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your  String");
		sb.append(s.nextLine());
		System.out.print("Entered String: "+sb);
	}
}
