package com.java_denmo03;

import java.io.File;

/*
 �ݹ����
  	�Ա�̵ĽǶ�����  �ݹ�ָ���Ƿ��������е��÷������������
  */
public class DiGuiDemo {

	public static void main(String[] args) {
		//������������ ���20�������ӵĶ���		ÿ���µ����Ӷ��� 1 1 2 3 5 8 13
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[19]);
		System.out.println(arr[19]);
		
		
		//��ݹ� n���Ľ׳�
		int result=jc(5);
		System.out.println("5�Ľ׳���:"+result);
		
		//����Ŀ¼
		//���ݸ�����·������һ��File����
		File srcFile=new File("E:\\itcast");
		//���÷���
		getAllFilePath(srcFile);
	}
	
	//�ݹ����������Ⱦ���Ҫ����һ��������
	//����һ������f(n),��ʾ��n���µ����Ӷ��� 
public static int f(int n) {
	if(n==1 || n==2) {
		return 1;
	}else {
		return f(n-1)+f(n-2);
	}

}

//��׳�
public static int jc(int n) {
	if(n==1) {
		return 1;
	}else {
		return n*jc(n-1);
	}	
}  


//����Ŀ¼
//����һ������ ���ڻ�ȡ����Ŀ¼�µ����е��ļ��µ��������ݣ�����Ϊ��һ��������File����
public static void getAllFilePath(File srcFile) {
	//��ȡ������FileĿ¼�����е��ļ�����Ŀ¼��File����
	File[] fileArray=srcFile.listFiles();
	//������FIle���飬�õ�ÿһ��File����
	if(fileArray !=null) {
		for(File file:fileArray) {
			//�жϸ�File�����Ƿ���Ŀ¼
			if(file.isDirectory()) {
				//�� �ݹ����
				getAllFilePath(file);
			}else {
				//���� ��ȡ����·������ڿ���̨
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
}
