package com.groot.boxLayOutEx;

import java.applet.Applet;
import java.awt.Col
import java.awt.Color;
import java.awt.Graphics;or;
import java.awt.Frame;
import java.awt.Graphics;

public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
class MyFrame extends Frame{
	public MyFrame() {
		// TODO Auto-generated constructor stub
		double d=898.889D;
		System.out.println();
	}
}

class First extends Applet {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Init called");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start is called");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop is called");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("distroy method is called");
	}
	public void paint(Graphics g) {
		g.setColor(Color.red);  
g.drawString("Welcome",50, 50);  
g.drawLine(20,30,20,300);  
g.drawRect(70,100,30,30);  
g.fillRect(170,100,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.pink);  
g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180);  
	}
}	