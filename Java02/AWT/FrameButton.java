package AWT;
import java.awt.*;

public class FrameButton {
	FrameButton(){
		Frame f= new Frame("My Frame");
		f.setSize(300,200);
		f.setBackground(Color.red);
		f.setLayout(null);
		f.setForeground(Color.blue);
		f.setVisible(true);
		Image i= Toolkit.getDefaultToolkit().getImage("C:/Users/USER/Downloads/sharingan.png");
		f.setIconImage(i);
		
		Button b=new Button("Click Here!!!");
		b.setBounds(50,100,80,40); //x-axis,y-axis,width,height
		f.add(b);
		
	}
	public static void main(String args[]){
		FrameButton fb=new FrameButton();
	}
}