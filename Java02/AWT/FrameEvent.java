package AWT;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;

public class FrameEvent implements WindowListener{
	
	 FrameEvent() {
		
		Frame f=new Frame("My demo event");
	
		f.setSize(300,300);
		f.setVisible(true);
		
	 }
	 @Override
	public void windowClosing(WindowEvent e) {
		 System.out.println("hi");
		System.exit(0);
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	 public static void main(String[] args) {
			FrameEvent fe = new FrameEvent();
		}
}
