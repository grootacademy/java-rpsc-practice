package com.groot.EventHandlingEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
		public static void main(String[] args) {
			new MyFrame();
		}
}
class MyFrame extends Frame{
	public MyFrame() {
		setTitle("Event Handling Ex");
		Button b=new Button("Clicke ME");
		b.setBounds(100, 100, 100, 40);
		add(b);
		b.addActionListener(new HandleEvent(this));
		setLayout(null);
		setVisible(true);
		setSize(500,500);	
	}
}
class MyFrame2 extends Frame{
	public MyFrame2() {
		setTitle("Frame 2");
		Button b=new Button("Clicke ME on frame 2");
		b.setBounds(100, 100, 100, 40);
		add(b);
//		b.addActionListener(new HandleEvent(this));
		setLayout(null);
		setVisible(true);
		setSize(500,500);
	}
}

class HandleEvent implements ActionListener{
	private MyFrame frame;
	
	public HandleEvent(MyFrame frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		new MyFrame2();
		
	}
	
}
