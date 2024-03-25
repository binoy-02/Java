import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRead1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Enter your String");
		String s=br.readLine();
		System.out.println("Entered String is"+s);
	}
}
 