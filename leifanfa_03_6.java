package com.java_zsb1.demo01;

public class leifanfa_03_6 {

/*		//成员变量
		String brand;
		int price;
		
		//成员方法
		public void call() {
			System.out.println("打电话");
		}
		public void call2() {
			System.out.println("发短信");
		}
		*/

	
	
/*	
		//private关键字
	
	private String name;
	private int age;
	
	//get/set方法
	public void setName(String n) {
		name= n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println(name+","+age);
	}
	*/
	
	
	/*
	//this关键字
	//成员变量
	private String name;
	private int age;
	
	//set、get方法
	public void setName(String name) {
		this.name= name; //this.name成员变量  name局部变量
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println(name+","+age);
	}
	*/
	
	
	//构造方法
	public class Student{
		//成员变量
		private String name;
		private int age;
		
		//构造方法
		public Student() {
			System.out.println("无参构造方法");
		}
		public void show() {
			System.out.println(name+","+age);
		}
	}

	
	
	}
