package com.groot.borderLayoutEx;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 {
	public static void main(String[] args) {
		JFrame f=new JFrame("Border Layout Ex");
		
		JButton northButton=new JButton("For North location");
		
		JButton southButton=new JButton("For South location");

		JButton eastButton=new JButton("For East location");
		
		JButton westButton=new JButton("For West location");
		
		JButton centerButton=new JButton("For center location");
		f.setLayout(new BorderLayout(20,30));
		f.add(northButton,BorderLayout.NORTH);
		f.add(southButton,BorderLayout.SOUTH);
		f.add(eastButton,BorderLayout.EAST);
		f.add(westButton,BorderLayout.WEST);
		f.add(centerButton,BorderLayout.CENTER);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
