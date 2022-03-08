package com.java_denmo03;
/*
 try{
 可能出现问题的代码:
 }catch(异常类名 变量名){
 异常的处理代码 
 }
 
  */
public class ExceptionDemo {
public static void main(String[] args) {
	System.out.println("开始");
	method();
	System.out.println("结束");
}

//try{}catch{}处理异常

//public static void method() {
//	try {
//		int[] arr= {1,2,3};
//		System.out.println(arr[3]);  //相当于new了个对象 newArrayIndexOutOfBoundsException();
//	}catch(ArrayIndexOutOfBoundsException e) {
//		//System.out.println("你访问的数组索引不存在");
//		e.printStackTrace();
//	}
//}

//Throwable 的三个成员方法成员方法
public static void method() {
	try {
		int[] arr= {1,2,3};
		System.out.println(arr[3]);  //相当于new了个对象 newArrayIndexOutOfBoundsException();
	}catch(ArrayIndexOutOfBoundsException e) {
		//System.out.println("你访问的数组索引不存在");
		
		//1.public String getMessage(); 返回此 throwable 的详细消息字符串
		//System.out.println(e.getMessage());
		
		//2.public String toString(); 返回此可能抛出的简短描述
		//System.out.println(e.toString()); //异常的原因java.lang.ArrayIndexOutOfBoundsException: 3
	
		//3.public String printStackTrace(); 把异常的错误信息输出在控制台
		e.printStackTrace();
	}
}
}
