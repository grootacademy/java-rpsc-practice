package com.groot.abc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame(){
		setTitle("JDBC ex With Swing");
		JLabel nameLabel=new JLabel("Name");
		nameLabel.setBounds(20, 30, 100, 30);
		add(nameLabel);
		
		JTextField nameField=new JTextField();
		nameField.setBounds(140, 30, 150, 30);
		add(nameField);
		
		JLabel passwordLabel=new JLabel("Password");
		passwordLabel.setBounds(20, 70, 100, 30);
		add(passwordLabel);
		
		JPasswordField passwordField=new JPasswordField();
		passwordField.setBounds(140, 70, 150, 30);
		add(passwordField);
		
		JLabel genderdLabel=new JLabel("Gender");
		genderdLabel.setBounds(20, 110, 100, 30);
		add(genderdLabel);
		
		JRadioButton maleJRadioButton=new JRadioButton("Male");
		maleJRadioButton.setBounds(140,110,100,30);
		add(maleJRadioButton);
		JRadioButton femaleJRadioButton=new JRadioButton("Female");
		femaleJRadioButton.setBounds(250,110,100,30);
		add(femaleJRadioButton);
		ButtonGroup bg=new ButtonGroup();
		bg.add(femaleJRadioButton);
		bg.add(maleJRadioButton);
		
		JLabel hobbiesLabel=new JLabel("Hobbies");
		hobbiesLabel.setBounds(20, 150, 100, 30);
		add(hobbiesLabel);
		
		JCheckBox cricketCheckBox=new JCheckBox("Cricket");
		cricketCheckBox.setBounds(140, 150, 150,30 );
		add(cricketCheckBox);
		JCheckBox footballCheckBox=new JCheckBox("Football");
		footballCheckBox.setBounds(140, 190, 150,30 );
		add(footballCheckBox);
		
		JCheckBox badmintonCheckBox=new JCheckBox("Badminton");
		badmintonCheckBox.setBounds(140, 230, 150,30 );
		add(badmintonCheckBox);
		
		JLabel addressLabel=new JLabel("Address");
		addressLabel.setBounds(20, 270, 100, 30);
		add(addressLabel);
		
		JTextArea addressTextArea=new JTextArea();
		addressTextArea.setBounds(140, 270, 150, 100);
		add(addressTextArea);
		
		JLabel cityLabel=new JLabel("City");
		cityLabel.setBounds(20, 380, 100, 30);
		add(cityLabel);

		String cities[]= {"Jaipur","Jodhpur","Uaipur","Hisar"};
		JComboBox cityComboBox=new JComboBox(cities);
		cityComboBox.setBounds(140, 380, 100, 30);
		add(cityComboBox);
		JButton submit=new JButton("Save");
		submit.setBounds(180, 420, 100, 30);
		add(submit);
		ActionListener al=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=nameField.getText();
				String password=passwordField.getText();
				String gender="";
				if(maleJRadioButton.isSelected()) {
					gender=maleJRadioButton.getText();
				}
				if(femaleJRadioButton.isSelected()) {
					gender=femaleJRadioButton.getText();
				}
				String hobbies="";
				if(cricketCheckBox.isSelected()) {
					if(hobbies.equals("")) {
						hobbies=cricketCheckBox.getText();
					}else {
						hobbies=hobbies+", "+cricketCheckBox.getText();	
					}
				}
				if(footballCheckBox.isSelected()) {
					if(hobbies.equals("")) {
						hobbies=footballCheckBox.getText();
					}else {
						hobbies=hobbies+", "+footballCheckBox.getText();
					}
				}
				if(badmintonCheckBox.isSelected()) {
					if(hobbies.equals("")) {
						hobbies=badmintonCheckBox.getText();
					}else {
					hobbies=hobbies+", "+badmintonCheckBox.getText();
					}
				}
				String address=addressTextArea.getText();
				String city=(String) cityComboBox.getSelectedItem();
//				System.out.println(name);
//				System.out.println(password);
//				System.out.println(gender);
//				System.out.println(hobbies);
//				System.out.println(address);
//				System.out.println(city);
//				System.out.println(cityComboBox.getSelectedIndex());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/groot", "root", "root");
					PreparedStatement ps=conn.prepareStatement("insert into swingform (name,password,gender,hobbies,address,city) values(?,?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, password);
				ps.setString(3, gender);
				ps.setString(4, hobbies);
				ps.setString(5, address);
				ps.setString(6, city);
				int i=ps.executeUpdate();
				if(i>0) {
					JOptionPane.showMessageDialog(null,"Record added sucessfull");
				}else {
					JOptionPane.showMessageDialog(null,"Record not added sucessfull");
				}
				System.out.println(i);
				}catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				}
		};
		submit.addActionListener(al);
		setLayout(null);
		setSize(500, 700);
		
		
		setVisible(true);
		
	}
}
