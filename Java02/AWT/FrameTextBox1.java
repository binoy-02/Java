package AWT;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class FrameTextBox1 {
	public FrameTextBox1() {
		Frame f= new Frame("FrameTextBox");
		f.setSize(200,200);
		f.setVisible(true);
		f.setBackground(Color.red);
		
		TextField tf = new TextField();
		tf.setBounds(300,100,100,40);
		f.add(tf);
				
	}
	public static void main(String args[])
	{
		FrameTextBox1 fl=new FrameTextBox1();
	}
}

