package com.java_zsb1.demo01;

import java.util.Random;
import java.util.Scanner;

public class demo03_04 {
	public static void main(String args[]) {
		
		//1.if���
		int hp=50;
		if(hp<=0) {
			System.out.println("GameOver");
		}else if(hp>=0 && hp<=90){
			System.out.println("������");
		}else {
			System.out.println("�ϲ���");
		}
		
		//2.��Ԫ�����
		int a=9,b=30;
		int Man=a<b?a:b;
		System.out.println(Man);
		
		//3.switch ���
		int c=2;
		switch(c) {
		case 1:
			System.out.println("����һ");	
			break;
		case 2:
			System.out.println("���ڶ�");	
			break;
		case 3:
			System.out.println("������");	
			break;
		default:
			System.out.println("������");	
			break;
		}
		
		//4.while ѭ��
		int d=1;
		int sun=0;
//		while(d<=100) {
//			 sun +=d;
//			d++;
//		}
//		System.out.println(sun);//1��100�ĺ�
		
		
		//5.do whileѭ��
		do {
			sun +=d;
			d++;
		}while(d<=100);
		System.out.println(sun); //����
		
		
		//6.forѭ��
		int total=0;
//		for(int i=0;i<=100;i++) {
//			total+=i;
//		}
//		System.out.println(sun);
		
		//�žų˷���
//		for(int n=1;n<=9;n++) {
//			
//			for(int j =1;j<=n;j++) {
//				System.out.print(n+"*"+j+"="+n*j+"\t");
//			}
//			System.out.println();
//				
//		}
		
		//������1-100���ۼ�ֵ���������и�λΪ3����
//		int to=0;
//		for(int i=1;i<=100;i++) {
//			if(i%10!=3) {
//				to+=i;
//			}
//		}
//		System.out.println(to);
		
//		��һ������=�����Զ� �ڶ�������=�������� Ȼ�����
//		for(int i=1;i<21;i++) {
//			int op1=i*2;
//			int op2=i*5;
//			int te=op1*op2;
//			System.out.println(op1+"*"+op2+"="+te);
//		}

		
		//7.������� �����û��������� s.nextlnt();
//		Scanner s=new Scanner(System.in);
//		int and=s.nextInt();
//		int ans=s.nextInt();
//		System.out.println("�û�����"+(and+ans));
		

		//8.���������
		//��������
//		Random r=new Random();
//		//��ѭ����ȡ10�������
//		for(int i=0;i<=10;i++) {
//			//��ȡ�����
//			int number=r.nextInt(10);
//			System.out.println("number:"+number);
//		}
//		//��ȡһ��1-100֮��������
//		int x=r.nextInt(100)+1;
//		System.out.println(x);
		
		
		//9.�ַ��� String
		String str1="����";
		String str2=new String("lisi");
		System.out.println(str1.length());//length �����ַ�������
		
		
		
		
		
		//��ϰ
		//1.�����û������һ���������ж�������������ż��
//		Scanner as=new Scanner(System.in);
//		int red=as.nextInt();
//		if(red%2==0) {
//			System.out.println(red+"��ż��");
//		}else {
//			System.out.println(red+"������");
//		}
		
		
		//2.ʹ��ѭ��������20�Ľ׳ˡ�20!
//		long tolr=1;
//		for(int i=1;i<=20;i++) {
//			tolr*=i;
//		}
//		System.out.println(tolr);
		
		
		//3.ʹ��ѭ��������1-20!�ĺ͡�1!+2!+...+20!
//		long nan=0;
//		for(int i=1;i<=20;i++) {
//			long tolr=1;
//			for(int j=1;j<=i;j++) {
//				tolr*=j;
//			}
//			nan+=tolr;
//		}
//		System.out.println(nan);
//		
		//4.������������abc ���������������մ�С�����˳������
//		Scanner aj=new Scanner(System.in);
//		int a1=aj.nextInt();
//		int b2=aj.nextInt();
//		int c3=aj.nextInt();
//		if(a1>b2) {
//			int temp=a1;
//			a1=b2;
//			b2=temp;
//		}
//		if(b2>c3) {
//			int temp=b2;
//			b2=c3;
//			c3=temp;
//		}
//		if(a1>b2) {
//			int temp=a1;
//			a1=b2;
//			b2=temp;
//		}
//		System.out.println(a1+""+b2+""+c3);
		
		
		//5.����һ����ĸ���ж������ĸ��Сд���Ǵ�д�������Сд��ת���ɴ�д
//		Scanner aj=new Scanner(System.in);
//		String str=aj.next();
//		char c1=str.charAt(0);
//		if(c1>=97 && c1<=122) {
//			c1=(char)(c1-32);
//		}
//		System.out.println(c1);
		
		
		//6.��������Ϸ
		Random z=new Random();
		int number=z.nextInt(100)+1;
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("��������Ҫ�µ����֣�");
			int gun=sc.nextInt();
			
			if(gun>number) {
				System.out.println("��µ�����"+gun+"����");
			}else if(gun<number) {
				System.out.println("��µ�����"+gun+"С��");
			}else {
				System.out.println("��ϲ��¶���");
				break;
			}
		}
		
	}
}
