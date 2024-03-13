package com.engineersAcademy;

import java.awt.Frame;

public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
class MyFrame extends Frame{
	public MyFrame() {
		setTitle("MY Second Frame");
		
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}
}