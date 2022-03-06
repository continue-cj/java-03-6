package com.java_zsb1.demo01;

import java.util.Scanner;

public class demo03_o6duixianghelei {

	public static void main(String[] args) {
/*		
 //创建对象
		leifanfa_03_6 sn=new leifanfa_03_6();
		//对象赋值
		sn.brand="xioai";
		sn.price=299;
		System.out.println(sn.brand);
		System.out.println(sn.price);

		//使用成员方法
		sn.call();
		sn.call2();
		
		*/
		
		
		/*
		//private关键字   //this关键字
		leifanfa_03_6 s=new leifanfa_03_6();
		//使用set方法给成员变量赋值
		s.setName("李四");
		s.setAge(24);
		
		s.show();
		//使用get方法获取成员变量的值
		System.out.println(s.getName()+"---"+s.getAge());
		*/
		
		
		
		//模拟用户登入
//		String username="index";
//		String password="crke";
//		
//		for(int i=0;i<3;i++) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("请输入用户名: ");
//			String name=sc.nextLine();
//			System.out.println("请输入密码: ");
//			String pass=sc.nextLine();
//			
//			if(name.equals(username) && pass.equals(password)) {
//				System.out.println("登入成功");
//				break;
//			}else {
//				if(2-i==0) {
//					System.out.println("你的账户被锁定，请与管理员联系");					
//				}else {
//					System.out.println("登入失败，你还有"+(2-i)+"次机会");
//				}
//			}
//		}
		
		
		
		//字符串遍历
//		Scanner s=new Scanner(System.in);
//		System.out.println("请输入一个字符串");
//		String Link=s.nextLine();
//		
//		//获取字符串长度
//		//System.out.println(Link.length());
//		//遍历
//		for(int i=0;i<Link.length();i++) {
//			System.out.println(Link.charAt(i));
//		}
		
		//统计字符次数
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String Link=s.nextLine();
		
		int bi=0;
		int bo=0;
		int bn=0;
		
		for(int i=0;i<Link.length();i++) {
			char ch=Link.charAt(i);
			if(ch>='A' && ch<='Z') {
				bi++;
			}else if(ch>='a' && ch<='z') {
				bo++;
			}else if(ch>='0' && ch<='9'){
				bn++;
			}
		}
		System.out.println("大写字母"+bi+"个");
		System.out.println("小写字母"+bo+"个");
		System.out.println("数字"+bn+"个");
		*/
		
		
		//StringBuilber 添加和反转  .append();添加   .reverse()反转
		
//		StringBuilder sb=new StringBuilder();
//		sb.append("hollw");
//		sb.append("world");
//		sb.append(100);
//		
//		//链式编程
//		sb.append("hollw").append("world").append("100");
//		System.out.println("sb="+sb);
//		//字符串反转
//		sb.reverse();
//		System.out.println("sb="+sb);
		
		
		
		//String和StringBuilder相互转换   .toString()转换
		
		//1.StringBuilder转换成String
//		StringBuilder sb=new StringBuilder();
//		sb.append("hollw");
//		String s=sb.toString();
//		System.out.println(s);
		
		//2.String转换成StringBuilder
//		String s="holle";
//		StringBuilder sb=new StringBuilder(s);
//		System.out.println(sb);
		
		
		
		//字符串反转
//		Scanner s=new Scanner(System.in);
//		System.out.println("请输入一个字符串");
//		String Link=s.nextLine();
//		
//		//调用方法
//		String li=revt(Link);
//		System.out.println("li="+li);
	}
	

	//定义一个方法 实现字符串反转
public static String revt(String sc) {
	String dd="";
	for(int i=sc.length()-1;i>=0;i--) {
		dd+=sc.charAt(i);
	}
	return dd;
		
	}
	}
