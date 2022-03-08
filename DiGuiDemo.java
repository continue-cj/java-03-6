package com.java_denmo03;

import java.io.File;

/*
 递归概述
  	以编程的角度来看  递归指的是方法定义中调用方法本身的现象
  */
public class DiGuiDemo {

	public static void main(String[] args) {
		//不死神兔问题 求第20个月兔子的对数		每个月的兔子对数 1 1 2 3 5 8 13
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[19]);
		System.out.println(arr[19]);
		
		
		//求递归 n！的阶乘
		int result=jc(5);
		System.out.println("5的阶乘是:"+result);
		
		//遍历目录
		//根据给定的路径创建一个File对象
		File srcFile=new File("E:\\itcast");
		//调用方法
		getAllFilePath(srcFile);
	}
	
	//递归解决问题首先就是要定义一个方法，
	//定义一个方法f(n),表示第n个月的兔子对数 
public static int f(int n) {
	if(n==1 || n==2) {
		return 1;
	}else {
		return f(n-1)+f(n-2);
	}

}

//求阶乘
public static int jc(int n) {
	if(n==1) {
		return 1;
	}else {
		return n*jc(n-1);
	}	
}  


//遍历目录
//定义一个方法 用于获取给定目录下的所有的文件下的所有内容，参数为第一步创建的File对象
public static void getAllFilePath(File srcFile) {
	//获取给定的File目录下所有的文件或者目录的File数组
	File[] fileArray=srcFile.listFiles();
	//遍历该FIle数组，得到每一个File对象
	if(fileArray !=null) {
		for(File file:fileArray) {
			//判断该File对象是否是目录
			if(file.isDirectory()) {
				//是 递归调用
				getAllFilePath(file);
			}else {
				//不是 获取绝对路径输出在控制台
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
}
