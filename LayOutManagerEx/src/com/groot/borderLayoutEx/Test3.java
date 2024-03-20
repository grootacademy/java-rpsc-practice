package com.groot.borderLayoutEx;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.applet.Applet;
import java.awt.Graphics;

public class Test3 {
	public static void main(String[] args) {
		new First();
	}
}

class First extends Applet {

	public void paint(Graphics g) {
		g.drawString("welcome", 150, 150);
	}
}
