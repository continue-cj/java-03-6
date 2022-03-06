package com.java_zsb1.demo01;

/*
 * 基本数据类型   赋值运算符   逻辑运算符 二进制码
 * 
 *
 */

public class HelloaWorld {
	public static void main(String args[]) {
		System.out.println("HelloWorld!");
		//class用来定义一个类
		//main方法是程序的入口方法，就是当程序被运行的时候，会调用入口方法 
		
		//基本数据类型
		//整型
		short a=1;
		int Name=20;
		System.out.println(a);
		
		//浮点型
		float e= 1.2f;
		double f=4.55;
		System.out.println(e);
		System.out.println(f);
		
		//字符型
		char in='a';
		char iny='张';//char只占两个字节 所以只能存一个汉字
		
		//boolean 型
		boolean h=true;
		boolean fo=false;
		System.out.println(h);
		System.out.println(fo);
		
		final int pi=34;//此时的值不能被修改的 final-最终的(不能修改)
		
		
		
		//自增++ 自减--
		int ziz=9;
		int zij=2;
		//ziz++;
		//zij--;
		//++ziz;
		//--zij;
		int res1=ziz++;//先执行后自增
		int res2=++zij;//先自增后执行
		System.out.println(ziz);
		System.out.println(zij);
		System.out.println(res1);
		System.out.println(res2);
		
		
		//类型转换
		
		//自动类型转换
		double d=10;
		System.out.println(d);
		
		//定义byte类型的变量
		byte b=10;
		short b2=b;
		int i=b;
		
		//强制类型转换
		int k=(int)8.88;
		System.out.println(k);//会有数据的丢失
		
		
		
		//赋值运算符
		int and=13;
		int anf=2;
		
		System.out.println(and+anf);
		System.out.println(and*anf);
		System.out.println(and*1.0/anf);//6.5
		System.out.println(and/anf);
		System.out.println(and%anf);
		
		
		//比较运算符
		int ji1=10;
		int ji2=4;
		System.out.println(ji1<ji2); //false
		System.out.println(ji1!=ji2);//true
		System.out.println(ji1>ji2); //true
		System.out.println(ji1==ji2); //falue
		
		
		//逻辑运算符
		//逻辑 与 && 全部为真 则为真 一个为假 则为假
		int age=70;
		boolean isluoji=age>35 && age<50;//false 
		System.out.println(isluoji);
		
		//逻辑 或 || 一个为真 则为真 全部为假 则为假
		boolean isluoji2=age<35 || age>50;//true
		System.out.println(isluoji2);
		
		//异或 ^ 一个为真一个为假 则为真 两个为真或为假 则为假
		boolean isluoji3=age>35 ^ age<50;//true
		System.out.println(isluoji3);
		
		//逻辑 非 ! 取反 为真 则为假 为假 则为真
		boolean isluoji4=!(age>35);//false
		System.out.println(isluoji4);
		
		
		//二进制码
		//正数 原码 补码 反码相同
		//负数 
		//原码 符号位为1
		//反码 符号位不变 其余位数按位取反
		//补码 (反码+1)
		//-9
		//原码:10000000 00000000 00000000 00001001
		//反码:11111111 11111111 11111111 11110110
		//补码:11111111 11111111 11111111 11110111
		
		
	}
}

