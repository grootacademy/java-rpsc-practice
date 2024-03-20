import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JApplet;

public class MyApplet extends Applet{
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init method is called");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start method is called");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop method id called");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method is called");
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("Welcome", 100, 100);
		g.drawRect(200, 200, 50, 50);
	}
}
