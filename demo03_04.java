package com.java_zsb1.demo01;

import java.util.Random;
import java.util.Scanner;

public class demo03_04 {
	public static void main(String args[]) {
		
		//1.if语句
		int hp=50;
		if(hp<=0) {
			System.out.println("GameOver");
		}else if(hp>=0 && hp<=90){
			System.out.println("还活着");
		}else {
			System.out.println("老不死");
		}
		
		//2.三元运算符
		int a=9,b=30;
		int Man=a<b?a:b;
		System.out.println(Man);
		
		//3.switch 语句
		int c=2;
		switch(c) {
		case 1:
			System.out.println("星期一");	
			break;
		case 2:
			System.out.println("星期二");	
			break;
		case 3:
			System.out.println("星期三");	
			break;
		default:
			System.out.println("星期四");	
			break;
		}
		
		//4.while 循环
		int d=1;
		int sun=0;
//		while(d<=100) {
//			 sun +=d;
//			d++;
//		}
//		System.out.println(sun);//1到100的和
		
		
		//5.do while循环
		do {
			sun +=d;
			d++;
		}while(d<=100);
		System.out.println(sun); //少用
		
		
		//6.for循环
		int total=0;
//		for(int i=0;i<=100;i++) {
//			total+=i;
//		}
//		System.out.println(sun);
		
		//九九乘法表
//		for(int n=1;n<=9;n++) {
//			
//			for(int j =1;j<=n;j++) {
//				System.out.print(n+"*"+j+"="+n*j+"\t");
//			}
//			System.out.println();
//				
//		}
		
		//求整数1-100的累加值，跳过所有个位为3的数
//		int to=0;
//		for(int i=1;i<=100;i++) {
//			if(i%10!=3) {
//				to+=i;
//			}
//		}
//		System.out.println(to);
		
//		第一个乘数=都乘以二 第二个乘数=都乘以五 然后相乘
//		for(int i=1;i<21;i++) {
//			int op1=i*2;
//			int op2=i*5;
//			int te=op1*op2;
//			System.out.println(op1+"*"+op2+"="+te);
//		}

		
		//7.输出数据 接受用户键盘输入 s.nextlnt();
//		Scanner s=new Scanner(System.in);
//		int and=s.nextInt();
//		int ans=s.nextInt();
//		System.out.println("用户输入"+(and+ans));
		

		//8.创建随机数
		//创建对象
//		Random r=new Random();
//		//用循环获取10个随机数
//		for(int i=0;i<=10;i++) {
//			//获取随机数
//			int number=r.nextInt(10);
//			System.out.println("number:"+number);
//		}
//		//获取一个1-100之间的随机数
//		int x=r.nextInt(100)+1;
//		System.out.println(x);
		
		
		//9.字符串 String
		String str1="张三";
		String str2=new String("lisi");
		System.out.println(str1.length());//length 查找字符串长度
		
		
		
		
		
		//练习
		//1.接收用户输入的一个整数，判断它是奇数还是偶数
//		Scanner as=new Scanner(System.in);
//		int red=as.nextInt();
//		if(red%2==0) {
//			System.out.println(red+"是偶数");
//		}else {
//			System.out.println(red+"是奇数");
//		}
		
		
		//2.使用循环语句计算20的阶乘。20!
//		long tolr=1;
//		for(int i=1;i<=20;i++) {
//			tolr*=i;
//		}
//		System.out.println(tolr);
		
		
		//3.使用循环语句计算1-20!的和。1!+2!+...+20!
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
		//4.接收三个整数abc 对这三个整数按照从小到大的顺序排列
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
		
		
		//5.输入一个字母，判断这个字母是小写还是大写，如果是小写就转换成大写
//		Scanner aj=new Scanner(System.in);
//		String str=aj.next();
//		char c1=str.charAt(0);
//		if(c1>=97 && c1<=122) {
//			c1=(char)(c1-32);
//		}
//		System.out.println(c1);
		
		
		//6.猜数字游戏
		Random z=new Random();
		int number=z.nextInt(100)+1;
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("请输入你要猜的数字：");
			int gun=sc.nextInt();
			
			if(gun>number) {
				System.out.println("你猜的数字"+gun+"大了");
			}else if(gun<number) {
				System.out.println("你猜的数字"+gun+"小了");
			}else {
				System.out.println("恭喜你猜对了");
				break;
			}
		}
		
	}
}
