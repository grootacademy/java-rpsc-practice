package com.engineersAcademy;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class FrameEx3 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		a|=4;
		System.out.println(a);
		b>>=1;
		System.out.println(b);
		c<<=1;
		System.out.println(c);
	}
}
class MyFrame2 extends Frame{
	MyFrame2(){
		setTitle("From Ex");
		
		Label nameLabel=new Label("Name");
		nameLabel.setBounds(100, 40, 100, 30);
		nameLabel.setBackground(Color.green);
		add(nameLabel);
		
		TextField nameTextField=new TextField();
		nameTextField.setBounds(220, 40, 150, 30);
		nameTextField.setBackground(Color.green);
		add(nameTextField);
		
		Label emailLabel=new Label("Email");
		emailLabel.setBounds(100, 90, 100, 30);
		emailLabel.setBackground(Color.green);
		add(emailLabel);
		
		TextField emailTextField=new TextField();
		emailTextField.setBounds(220, 90, 150, 30);
		nameTextField.setBackground(Color.green);
		add(nameTextField);
		
		Label addressLabel=new Label("Address");
		addressLabel.setBounds(100, 140, 100, 30);
		addressLabel.setBackground(Color.green);
		add(addressLabel);
		
		TextArea addressTextArea=new TextArea();
		addressTextArea.setBounds(220, 140, 150, 200);
		addressTextArea.setBackground(Color.green);
		add(addressTextArea);
		
		
		Label cityLabel=new Label("City");
		cityLabel.setBounds(100, 360, 100, 30);
		cityLabel.setBackground(Color.green);
		add(cityLabel);
		
		Choice cityChoice=new Choice();
		cityChoice.add("Jaipur");
		cityChoice.add("Ajmer");
		cityChoice.add("Alwar");
		cityChoice.add("Jodhpur");
		cityChoice.setBounds(220, 360, 100, 30);
		add(cityChoice);
		
		setLayout(null);
		setSize(700, 700);
		setVisible(true);
	}
}
