package com.groot.SwingEx.radioButtongEx;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Test {
	public static void main(String[] args) {
		new ABC();
	}
}
class ABC extends JFrame{
	public ABC() {
		// TODO Auto-generated constructor stub
		setTitle("Radio Button Ex");
		JRadioButton jRadioButton=new JRadioButton("Male");
		jRadioButton.setBounds(100, 50, 100, 30);
		JRadioButton jRadioButton2=new JRadioButton("Female");
		jRadioButton2.setBounds(100, 100, 100, 30);
		add(jRadioButton2);
		add(jRadioButton);
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
	}
}