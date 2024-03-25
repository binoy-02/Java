

public class CustomExcep {
	public static void main(String[] args) {
		float x=5;
		float y=1000;
		try {
			float z=x/y;
			if(z<.01 ) throw new CustomException("Number too small");
		} catch (CustomException e) {
			System.out.println("Caught Custom Execption");
			System.out.println(e);
		}
	}
}

class CustomExecption extends Exception{
	CustomExecption(String msg) {
		super(msg);
	}
}
