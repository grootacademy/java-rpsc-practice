package com.groot.ex;

public class Test {
	public static void main(String[] args)  throws ClassNotFoundException{
		try {
		Class.forName("com.mysq.jdbc.Driver");
		System.out.println("Driver loaded");
		}catch (Exception e) {
//			System.out.println(e.pr);
			e.printStackTrace();
		}
		System.out.println("After exception");
	}
}
