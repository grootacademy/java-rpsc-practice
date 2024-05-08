package com.groot;

import java.io.Serializable;


public class Student implements Serializable{
	String name;
	float fee;
	String address;
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
