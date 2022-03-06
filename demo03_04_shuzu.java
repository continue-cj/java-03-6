package com.java_zsb1.demo01;

import java.util.Scanner;

public class demo03_04_shuzu {

	public static void main(String[] args) {
		
		//数组 初始化
		int[] arr=new int[3];
		
		//输出数组名
		System.out.println(arr);//数组名存储的内存地址 [I@15db9742
		
			
		//获取最大值
		int[] arr1= {1,2,3,4,5,6};
		int Man=arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>Man) {
				Man=arr1[i];
			}
		}
		System.out.println("Man:"+Man);
	
		
		//调用方法
		isOver();
		getMax();
		//常量参数调用方法
		getNan(20,39);
		//变量参数调用
		int top=10,nr=40;
		getNan(top,nr);
		
		//带返回值方法调用
		boolean ang=getJiou(20);
		System.out.println(ang);
		//带返回值方法调用   练习
		int ant=getJiou(20,40);
		System.out.println(ant);
		//System.out.println(getJiou(20,40));
		
		//方法重载 调用
		int resu=sum(10,20);
		System.out.println(resu);
		double resu2=sum(10.0,20.0);
		System.out.println(resu2);
		int resu3=sum(10,20,40);
		System.out.println(resu3);
		//System.out.println(sum((long)10,(long)20));//强制转换可以在输出里使用
		
		//练习switch语句
		jianf();
		//百钱白鸡
		baiq();
		
		
		//方法参数传递基本数据类型
		int qb=100;
		System.out.println("调用change方法前"+qb);//100
		change(qb);
		System.out.println("调用change方法后"+qb);//100
		
		
		
		//练习数组遍历
		int[] bli= {12,13,44,53,56};
		shuzu(bli);
		
	}
	
	
	//方法(先定义后调用)  定义:是具有独立功能的代码块组织成为一个整体，十七具有特殊功能的代码集
	
			//定义方法
			public static void isOver() {
				//定义变量
				int number=10;
				//判断是否奇或偶
				if(number%2==0) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}
			
			//方法练习
			public static void getMax() {
				int a=20;
				int b=10;
				if(a>b) {
					System.out.println(a);
				}else {
					System.out.println(b);
				}
			}

			//带参数调用方法
			//形参(方法定义中的参数是由数据类型和变变量名组成的)
			//和实参(方法调用中的参数不带数据类型 要么是常量值或变量名)
			public static void getNan(int kun,int bukun) {
				if(kun>bukun) {
					System.out.println("困了");
				}else {
					System.out.println("不困");
				}
			}
			
			//带返回值方法定义和调用
			public static boolean getJiou(int ang) {
				//判断是否奇或偶
				if(ang%2==0) {
					return true;
				}else {
					return false;
				}
			}
			//练习
			public static int getJiou(int an,int jpg) {
				//判断是否奇或偶
				if(an>jpg) {
					return an;
				}else {
					return jpg;
				}
			}
			
			
			//方法重载
			//概念:1.多个放噶在同一个类中 
			//	   2.多个方法相同的方法名 
			//	   3.多个方法的参数不相同，类型不同或者数量不同
			//方法重载与1.返回值无关 2.在调用时 Java虚拟机会通过参数的不同来区分同名的方法
			public static int sum(int ip,int id) {
				return ip+id;
			}
			public static double sum(double ip,double id) {
				return ip+id;
			}
			public static int sum(int ip,int id,int io) {
				return ip+id+io;
			}
			
			
			//方法参数传递基本数据类型
			public static void change(int qb) {
				qb=200;
			}
			
			
			//练习方法调用 数组遍历 输出结果 [12,13,44,53,56]
			public static void shuzu(int[] bli) {
				System.out.print("[");
				for(int i=0;i<bli.length;i++) {
					if(i==bli.length-1) {
						System.out.print(bli[i] );
					}else {
						System.out.print(bli[i]+",");
					}
					
				}
				System.out.println("]");	
			}
			
			
			
			//练习
			public static void jianf() {
				System.out.println("请输入");
				Scanner n12=new Scanner(System.in);
				int n2=n12.nextInt();
				switch(n2) {
				case 1:
					System.out.println("跑步");
					break;
				case 2:
					System.out.println("游泳");
					break;
				case 3:
					System.out.println("慢走");
					break;
				case 4:
					System.out.println("动感单车");
					break;
				case 5:
					System.out.println("拳击");
					break;
				case 6:
					System.out.println("爬山");
					break;
				default:
					System.out.println("好好吃一顿");
					break;
				}
				
			}
			
			//百钱白鸡 鸡公一值钱五 鸡母一值钱三 鸡仔三值一钱 共白鸡 满足z%3==0，5x+3x+z/3=100
			public static void baiq() {
				for(int x=0;x<=20;x++) {
					for(int y=0;y<=33;y++) {
						int z=100-x-y;
						if(z%3==0 && 5*x+3*y+z/3==100) {
							System.out.println(x+","+y+","+z);
						}
					}
				}
			}
			
			
}
