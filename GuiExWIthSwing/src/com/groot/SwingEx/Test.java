package com.groot.SwingEx;

import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("My First Swing Ex");
		JPasswordField jPasswordField=new JPasswordField();
		jPasswordField.setBounds(100, 100, 100, 30);
		add(jPasswordField);
		Button b=new Button("Click ME");
		b.setBounds(100, 150, 100, 30);
		add(b);
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
	}
}
  