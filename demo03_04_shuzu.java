package com.java_zsb1.demo01;

import java.util.Scanner;

public class demo03_04_shuzu {

	public static void main(String[] args) {
		
		//���� ��ʼ��
		int[] arr=new int[3];
		
		//���������
		System.out.println(arr);//�������洢���ڴ��ַ [I@15db9742
		
			
		//��ȡ���ֵ
		int[] arr1= {1,2,3,4,5,6};
		int Man=arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>Man) {
				Man=arr1[i];
			}
		}
		System.out.println("Man:"+Man);
	
		
		//���÷���
		isOver();
		getMax();
		//�����������÷���
		getNan(20,39);
		//������������
		int top=10,nr=40;
		getNan(top,nr);
		
		//������ֵ��������
		boolean ang=getJiou(20);
		System.out.println(ang);
		//������ֵ��������   ��ϰ
		int ant=getJiou(20,40);
		System.out.println(ant);
		//System.out.println(getJiou(20,40));
		
		//�������� ����
		int resu=sum(10,20);
		System.out.println(resu);
		double resu2=sum(10.0,20.0);
		System.out.println(resu2);
		int resu3=sum(10,20,40);
		System.out.println(resu3);
		//System.out.println(sum((long)10,(long)20));//ǿ��ת�������������ʹ��
		
		//��ϰswitch���
		jianf();
		//��Ǯ�׼�
		baiq();
		
		
		//�����������ݻ�����������
		int qb=100;
		System.out.println("����change����ǰ"+qb);//100
		change(qb);
		System.out.println("����change������"+qb);//100
		
		
		
		//��ϰ�������
		int[] bli= {12,13,44,53,56};
		shuzu(bli);
		
	}
	
	
	//����(�ȶ�������)  ����:�Ǿ��ж������ܵĴ������֯��Ϊһ�����壬ʮ�߾������⹦�ܵĴ��뼯
	
			//���巽��
			public static void isOver() {
				//�������
				int number=10;
				//�ж��Ƿ����ż
				if(number%2==0) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}
			
			//������ϰ
			public static void getMax() {
				int a=20;
				int b=10;
				if(a>b) {
					System.out.println(a);
				}else {
					System.out.println(b);
				}
			}

			//���������÷���
			//�β�(���������еĲ��������������ͺͱ��������ɵ�)
			//��ʵ��(���������еĲ��������������� Ҫô�ǳ���ֵ�������)
			public static void getNan(int kun,int bukun) {
				if(kun>bukun) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
			}
			
			//������ֵ��������͵���
			public static boolean getJiou(int ang) {
				//�ж��Ƿ����ż
				if(ang%2==0) {
					return true;
				}else {
					return false;
				}
			}
			//��ϰ
			public static int getJiou(int an,int jpg) {
				//�ж��Ƿ����ż
				if(an>jpg) {
					return an;
				}else {
					return jpg;
				}
			}
			
			
			//��������
			//����:1.����Ÿ���ͬһ������ 
			//	   2.���������ͬ�ķ����� 
			//	   3.��������Ĳ�������ͬ�����Ͳ�ͬ����������ͬ
			//����������1.����ֵ�޹� 2.�ڵ���ʱ Java�������ͨ�������Ĳ�ͬ������ͬ���ķ���
			public static int sum(int ip,int id) {
				return ip+id;
			}
			public static double sum(double ip,double id) {
				return ip+id;
			}
			public static int sum(int ip,int id,int io) {
				return ip+id+io;
			}
			
			
			//�����������ݻ�����������
			public static void change(int qb) {
				qb=200;
			}
			
			
			//��ϰ�������� ������� ������ [12,13,44,53,56]
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
			
			
			
			//��ϰ
			public static void jianf() {
				System.out.println("������");
				Scanner n12=new Scanner(System.in);
				int n2=n12.nextInt();
				switch(n2) {
				case 1:
					System.out.println("�ܲ�");
					break;
				case 2:
					System.out.println("��Ӿ");
					break;
				case 3:
					System.out.println("����");
					break;
				case 4:
					System.out.println("���е���");
					break;
				case 5:
					System.out.println("ȭ��");
					break;
				case 6:
					System.out.println("��ɽ");
					break;
				default:
					System.out.println("�úó�һ��");
					break;
				}
				
			}
			
			//��Ǯ�׼� ����һֵǮ�� ��ĸһֵǮ�� ������ֵһǮ ���׼� ����z%3==0��5x+3x+z/3=100
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
