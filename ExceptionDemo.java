package com.java_denmo03;
/*
 try{
 ���ܳ�������Ĵ���:
 }catch(�쳣���� ������){
 �쳣�Ĵ������ 
 }
 
  */
public class ExceptionDemo {
public static void main(String[] args) {
	System.out.println("��ʼ");
	method();
	System.out.println("����");
}

//try{}catch{}�����쳣

//public static void method() {
//	try {
//		int[] arr= {1,2,3};
//		System.out.println(arr[3]);  //�൱��new�˸����� newArrayIndexOutOfBoundsException();
//	}catch(ArrayIndexOutOfBoundsException e) {
//		//System.out.println("����ʵ���������������");
//		e.printStackTrace();
//	}
//}

//Throwable ��������Ա������Ա����
public static void method() {
	try {
		int[] arr= {1,2,3};
		System.out.println(arr[3]);  //�൱��new�˸����� newArrayIndexOutOfBoundsException();
	}catch(ArrayIndexOutOfBoundsException e) {
		//System.out.println("����ʵ���������������");
		
		//1.public String getMessage(); ���ش� throwable ����ϸ��Ϣ�ַ���
		//System.out.println(e.getMessage());
		
		//2.public String toString(); ���ش˿����׳��ļ������
		//System.out.println(e.toString()); //�쳣��ԭ��java.lang.ArrayIndexOutOfBoundsException: 3
	
		//3.public String printStackTrace(); ���쳣�Ĵ�����Ϣ����ڿ���̨
		e.printStackTrace();
	}
}
}
