package com.java_zsb1.demo01;

import java.util.Scanner;

public class demo03_o6duixianghelei {

	public static void main(String[] args) {
/*		
 //��������
		leifanfa_03_6 sn=new leifanfa_03_6();
		//����ֵ
		sn.brand="xioai";
		sn.price=299;
		System.out.println(sn.brand);
		System.out.println(sn.price);

		//ʹ�ó�Ա����
		sn.call();
		sn.call2();
		
		*/
		
		
		/*
		//private�ؼ���   //this�ؼ���
		leifanfa_03_6 s=new leifanfa_03_6();
		//ʹ��set��������Ա������ֵ
		s.setName("����");
		s.setAge(24);
		
		s.show();
		//ʹ��get������ȡ��Ա������ֵ
		System.out.println(s.getName()+"---"+s.getAge());
		*/
		
		
		
		//ģ���û�����
//		String username="index";
//		String password="crke";
//		
//		for(int i=0;i<3;i++) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("�������û���: ");
//			String name=sc.nextLine();
//			System.out.println("����������: ");
//			String pass=sc.nextLine();
//			
//			if(name.equals(username) && pass.equals(password)) {
//				System.out.println("����ɹ�");
//				break;
//			}else {
//				if(2-i==0) {
//					System.out.println("����˻����������������Ա��ϵ");					
//				}else {
//					System.out.println("����ʧ�ܣ��㻹��"+(2-i)+"�λ���");
//				}
//			}
//		}
		
		
		
		//�ַ�������
//		Scanner s=new Scanner(System.in);
//		System.out.println("������һ���ַ���");
//		String Link=s.nextLine();
//		
//		//��ȡ�ַ�������
//		//System.out.println(Link.length());
//		//����
//		for(int i=0;i<Link.length();i++) {
//			System.out.println(Link.charAt(i));
//		}
		
		//ͳ���ַ�����
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("������һ���ַ���");
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
		System.out.println("��д��ĸ"+bi+"��");
		System.out.println("Сд��ĸ"+bo+"��");
		System.out.println("����"+bn+"��");
		*/
		
		
		//StringBuilber ��Ӻͷ�ת  .append();���   .reverse()��ת
		
//		StringBuilder sb=new StringBuilder();
//		sb.append("hollw");
//		sb.append("world");
//		sb.append(100);
//		
//		//��ʽ���
//		sb.append("hollw").append("world").append("100");
//		System.out.println("sb="+sb);
//		//�ַ�����ת
//		sb.reverse();
//		System.out.println("sb="+sb);
		
		
		
		//String��StringBuilder�໥ת��   .toString()ת��
		
		//1.StringBuilderת����String
//		StringBuilder sb=new StringBuilder();
//		sb.append("hollw");
//		String s=sb.toString();
//		System.out.println(s);
		
		//2.Stringת����StringBuilder
//		String s="holle";
//		StringBuilder sb=new StringBuilder(s);
//		System.out.println(sb);
		
		
		
		//�ַ�����ת
//		Scanner s=new Scanner(System.in);
//		System.out.println("������һ���ַ���");
//		String Link=s.nextLine();
//		
//		//���÷���
//		String li=revt(Link);
//		System.out.println("li="+li);
	}
	

	//����һ������ ʵ���ַ�����ת
public static String revt(String sc) {
	String dd="";
	for(int i=sc.length()-1;i>=0;i--) {
		dd+=sc.charAt(i);
	}
	return dd;
		
	}
	}
