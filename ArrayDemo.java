package com.java_denmo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArrayDemo {

	public static void main(String[] args) throws ParseException {

		int[] arr= {23,43,35,96,30,10};
		//Arrays 排序
		System.out.println("排序前："+Arrays.toString(arr));
		Arrays.sort(arr); //直接排序
		System.out.println("排序后："+Arrays.toString(arr));

		
		//冒泡排序
		for(int x=0;x<arr.length-1;x++) {
		for(int i=0;i<arr.length-1-x;i++) {
			if(arr[i]>arr[i+1]) {
				int top=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=top;
			}
		}
		}
		System.out.println("冒泡排序后 "+arrayToString(arr));
		
		//基本类型包装类
		//需要我们判断一个数据是否在int 范围
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		//Integer 包装类:包装一个对象中的原始类型Int的值
		
		//使用构造方法来得到Integer对象  (过时了)
		Integer il=new Integer(100);
		System.out.println(il);
		Integer i2=new Integer("100");
		//Integer i2=new Integer("abc");//报错NumberFormatException 不是数字字符串
		System.out.println(i2);
		
		//使用静态方法获取Integer对象
		Integer i3=Integer.valueOf(100);
		System.out.println(i3);
		Integer i4=Integer.valueOf(100);
		//Integer i4=Integer.valueOf("abc");//报错NumberFormatException 不是数字字符串
		System.out.println(i4);
		
		
		
		//Date 时间关键字
		//两个构造方法
		Date d1=new Date();
		System.out.println(d1);
		
		long date=1000*60*60;//1000是毫秒跟秒的换算单位 再到60是分钟
		Date d2=new Date(date);
		System.out.println(d2);
		
		
//		//Date类常用方法
		//创建日期对象
		Date d=new Date();
		
		//public long getTime() 获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
		System.out.println(d.getTime());
		System.out.println(d.getTime()*1.0/1000/60/60/24/365+"年");
		
		//public void setTime(long time):设置时间，给的是毫秒
		//long time=1000*60*60;
		long time=System.currentTimeMillis();//系统当前时间
		d.setTime(time);
		System.out.println(d);
		
		
		//SimpleDateFormat 时间
		//格式化 从Date到String
		Date ds=new Date();
		//SimpleDateFormat sdf=new SimpleDateFormat();//无参构造方法
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s1=sdf.format(ds);
		System.out.println(s1);
		
		//解析  从String到Date
		String ss="2022-03-08 11:11:11";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd=sdf2.parse(ss);
		System.out.println(dd);
	}


	//冒泡排序
	//把数组元素按照指定的规则组成一个字符串
public static String arrayToString(int[] arr) {
	StringBuilder sb=new StringBuilder();
	sb.append("[");
	for(int i=0;i<arr.length;i++) {
		if(i==arr.length-1) {
			sb.append(arr[i] );
		}else {
			sb.append(arr[i]).append(",");
		}
		
	}
	sb.append("]");	
	String s=sb.toString();
	return s;
}
}
