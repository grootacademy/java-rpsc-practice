package ccom.groot.checkBoxEx;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
class MyFrame extends Frame{
	public MyFrame() {
		setTitle("Check Box Example");
		Label hobbiesLabel=new Label("Hobbies");
		hobbiesLabel.setBackground(Color.green);
		hobbiesLabel.setBounds(100, 50, 100, 30);
		add(hobbiesLabel);
		addWindowListener(new HandleWindowListner(this));
		Checkbox circketCheckbox=new Checkbox("Cricket");
		circketCheckbox.setBounds(220, 50, 150, 30);
		add(circketCheckbox);
		
		Checkbox fooballCheckbox=new Checkbox("Cricket");
		fooballCheckbox.setBounds(220, 90, 150, 30);
		add(fooballCheckbox);
		
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
	}
}
class HandleWindowListner implements WindowListener{
	MyFrame myFrame;
	HandleWindowListner(MyFrame myFrame){
		this.myFrame=myFrame;
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		myFrame.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
		
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
	
}