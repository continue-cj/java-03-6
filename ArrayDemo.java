package com.java_denmo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArrayDemo {

	public static void main(String[] args) throws ParseException {

		int[] arr= {23,43,35,96,30,10};
		//Arrays ����
		System.out.println("����ǰ��"+Arrays.toString(arr));
		Arrays.sort(arr); //ֱ������
		System.out.println("�����"+Arrays.toString(arr));

		
		//ð������
		for(int x=0;x<arr.length-1;x++) {
		for(int i=0;i<arr.length-1-x;i++) {
			if(arr[i]>arr[i+1]) {
				int top=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=top;
			}
		}
		}
		System.out.println("ð������� "+arrayToString(arr));
		
		//�������Ͱ�װ��
		//��Ҫ�����ж�һ�������Ƿ���int ��Χ
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		//Integer ��װ��:��װһ�������е�ԭʼ����Int��ֵ
		
		//ʹ�ù��췽�����õ�Integer����  (��ʱ��)
		Integer il=new Integer(100);
		System.out.println(il);
		Integer i2=new Integer("100");
		//Integer i2=new Integer("abc");//����NumberFormatException ���������ַ���
		System.out.println(i2);
		
		//ʹ�þ�̬������ȡInteger����
		Integer i3=Integer.valueOf(100);
		System.out.println(i3);
		Integer i4=Integer.valueOf(100);
		//Integer i4=Integer.valueOf("abc");//����NumberFormatException ���������ַ���
		System.out.println(i4);
		
		
		
		//Date ʱ��ؼ���
		//�������췽��
		Date d1=new Date();
		System.out.println(d1);
		
		long date=1000*60*60;//1000�Ǻ������Ļ��㵥λ �ٵ�60�Ƿ���
		Date d2=new Date(date);
		System.out.println(d2);
		
		
//		//Date�ೣ�÷���
		//�������ڶ���
		Date d=new Date();
		
		//public long getTime() ��ȡ�������ڶ����1970��1��1�� 00:00:00�����ڵĺ���ֵ
		System.out.println(d.getTime());
		System.out.println(d.getTime()*1.0/1000/60/60/24/365+"��");
		
		//public void setTime(long time):����ʱ�䣬�����Ǻ���
		//long time=1000*60*60;
		long time=System.currentTimeMillis();//ϵͳ��ǰʱ��
		d.setTime(time);
		System.out.println(d);
		
		
		//SimpleDateFormat ʱ��
		//��ʽ�� ��Date��String
		Date ds=new Date();
		//SimpleDateFormat sdf=new SimpleDateFormat();//�޲ι��췽��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String s1=sdf.format(ds);
		System.out.println(s1);
		
		//����  ��String��Date
		String ss="2022-03-08 11:11:11";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd=sdf2.parse(ss);
		System.out.println(dd);
	}


	//ð������
	//������Ԫ�ذ���ָ���Ĺ������һ���ַ���
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
