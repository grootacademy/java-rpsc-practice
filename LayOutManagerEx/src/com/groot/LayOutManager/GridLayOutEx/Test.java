package com.groot.LayOutManager.GridLayOutEx;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
		public static void main(String[] args) {
			JFrame f=new JFrame("Grid LayoutEx");
			JButton button1=new JButton("Btn1");
			JButton button2=new JButton("Btn2");
			JButton button3=new JButton("Btn3");
			JButton button4=new JButton("Btn4");
			JButton button5=new JButton("Btn5");
			JButton button6=new JButton("Btn6");
			JButton button7=new JButton("Btn7");
			JButton button8=new JButton("Btn8");
			JButton button9=new JButton("Btn9");
			f.add(button1);
			f.add(button2);
			f.add(button3);
			f.add(button4);
			f.add(button5);
			f.add(button6);
			f.add(button7);
			f.add(button8);
			f.add(button9);
			f.setLayout(new GridLayout(3,3));
			f.setVisible(true);
			f.setSize(500, 500);
		}
}
