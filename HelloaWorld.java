package com.java_zsb1.demo01;

/*
 * ������������   ��ֵ�����   �߼������ ��������
 * 
 *
 */

public class HelloaWorld {
	public static void main(String args[]) {
		System.out.println("HelloWorld!");
		//class��������һ����
		//main�����ǳ������ڷ��������ǵ��������е�ʱ�򣬻������ڷ��� 
		
		//������������
		//����
		short a=1;
		int Name=20;
		System.out.println(a);
		
		//������
		float e= 1.2f;
		double f=4.55;
		System.out.println(e);
		System.out.println(f);
		
		//�ַ���
		char in='a';
		char iny='��';//charֻռ�����ֽ� ����ֻ�ܴ�һ������
		
		//boolean ��
		boolean h=true;
		boolean fo=false;
		System.out.println(h);
		System.out.println(fo);
		
		final int pi=34;//��ʱ��ֵ���ܱ��޸ĵ� final-���յ�(�����޸�)
		
		
		
		//����++ �Լ�--
		int ziz=9;
		int zij=2;
		//ziz++;
		//zij--;
		//++ziz;
		//--zij;
		int res1=ziz++;//��ִ�к�����
		int res2=++zij;//��������ִ��
		System.out.println(ziz);
		System.out.println(zij);
		System.out.println(res1);
		System.out.println(res2);
		
		
		//����ת��
		
		//�Զ�����ת��
		double d=10;
		System.out.println(d);
		
		//����byte���͵ı���
		byte b=10;
		short b2=b;
		int i=b;
		
		//ǿ������ת��
		int k=(int)8.88;
		System.out.println(k);//�������ݵĶ�ʧ
		
		
		
		//��ֵ�����
		int and=13;
		int anf=2;
		
		System.out.println(and+anf);
		System.out.println(and*anf);
		System.out.println(and*1.0/anf);//6.5
		System.out.println(and/anf);
		System.out.println(and%anf);
		
		
		//�Ƚ������
		int ji1=10;
		int ji2=4;
		System.out.println(ji1<ji2); //false
		System.out.println(ji1!=ji2);//true
		System.out.println(ji1>ji2); //true
		System.out.println(ji1==ji2); //falue
		
		
		//�߼������
		//�߼� �� && ȫ��Ϊ�� ��Ϊ�� һ��Ϊ�� ��Ϊ��
		int age=70;
		boolean isluoji=age>35 && age<50;//false 
		System.out.println(isluoji);
		
		//�߼� �� || һ��Ϊ�� ��Ϊ�� ȫ��Ϊ�� ��Ϊ��
		boolean isluoji2=age<35 || age>50;//true
		System.out.println(isluoji2);
		
		//��� ^ һ��Ϊ��һ��Ϊ�� ��Ϊ�� ����Ϊ���Ϊ�� ��Ϊ��
		boolean isluoji3=age>35 ^ age<50;//true
		System.out.println(isluoji3);
		
		//�߼� �� ! ȡ�� Ϊ�� ��Ϊ�� Ϊ�� ��Ϊ��
		boolean isluoji4=!(age>35);//false
		System.out.println(isluoji4);
		
		
		//��������
		//���� ԭ�� ���� ������ͬ
		//���� 
		//ԭ�� ����λΪ1
		//���� ����λ���� ����λ����λȡ��
		//���� (����+1)
		//-9
		//ԭ��:10000000 00000000 00000000 00001001
		//����:11111111 11111111 11111111 11110110
		//����:11111111 11111111 11111111 11110111
		
		
	}
}

