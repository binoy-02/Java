package AWT;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;

public class FrameLabel1 {
	public FrameLabel1() {
		Frame f= new Frame("Label");
		f.setSize(200,200);
		f.setVisible(true);
		
		Label l = new Label("This is Label Demo");
		l.setBounds(300,100,100,40);
		f.add(l);
				
	}
	public static void main(String args[])
	{
		FrameLabel1 fl=new FrameLabel1();
	}
}
