package com.engineersAcademy;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class FrameEx2 {
		public static void main(String[] args) {
			Frame f=new Frame("My Frame");
			Label nameLabel=new Label("Name");
			nameLabel.setBounds(100, 20, 100, 30);
			nameLabel.setBackground(Color.green);
			f.add(nameLabel);
			
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(500, 500);
		}
}
