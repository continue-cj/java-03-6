package com.java_zsb1.demo01;

public class leifanfa_03_6 {

/*		//��Ա����
		String brand;
		int price;
		
		//��Ա����
		public void call() {
			System.out.println("��绰");
		}
		public void call2() {
			System.out.println("������");
		}
		*/

	
	
/*	
		//private�ؼ���
	
	private String name;
	private int age;
	
	//get/set����
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
	//this�ؼ���
	//��Ա����
	private String name;
	private int age;
	
	//set��get����
	public void setName(String name) {
		this.name= name; //this.name��Ա����  name�ֲ�����
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
	
	
	//���췽��
	public class Student{
		//��Ա����
		private String name;
		private int age;
		
		//���췽��
		public Student() {
			System.out.println("�޲ι��췽��");
		}
		public void show() {
			System.out.println(name+","+age);
		}
	}

	
	
	}
