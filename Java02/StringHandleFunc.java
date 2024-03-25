
public class StringHandleFunc {
	public static void main(String[] args) {
		String s1= new String("  abcde");
		String s2 = new String("Binoy");
		System.out.println(s1.length());
		System.out.println(s1.codePointAt(1));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1,5));
		System.out.println(s1.replace("ab","xz"));
		System.out.println(s1.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s2));
		
		
	}
}
