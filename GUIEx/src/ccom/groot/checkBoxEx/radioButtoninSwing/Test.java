package ccom.groot.checkBoxEx.radioButtoninSwing;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;


public class Test {
	public static void main(String[] args) {
		new MyFrame();
	}
}
class MyFrame extends Frame{
	public MyFrame() {
		setTitle("Check Box Example");
		Label genderLabel=new Label("Gender");
		genderLabel.setBackground(Color.green);
		genderLabel.setBounds(100, 50, 100, 30);
		add(genderLabel);
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox maleCheckbox=new Checkbox("Male",cg,false);
		maleCheckbox.setBounds(220, 50, 100, 30);
		add(maleCheckbox);
		
		Checkbox femaleCheckbox=new Checkbox("Female",cg,false);
		femaleCheckbox.setBounds(220, 120, 100, 30);
		add(femaleCheckbox);
		
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
	}
}