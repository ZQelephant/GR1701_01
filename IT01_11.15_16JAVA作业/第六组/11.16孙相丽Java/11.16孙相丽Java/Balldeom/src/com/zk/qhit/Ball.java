package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Ball {
	public static void main(String[] args) {
		
	
	  /**5  һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
       *�����£������� ��10�����ʱ�������������ף���n�η�����ߣ�
       */
		
    int h = 100;
	float h1=h/2;
	int n = 0;
	for(n = 2;n<= 10;n++){
		h += h1/2;
		h1 = h1/2;
	}
	System.out.println("��"+n+"����ؾ���"+h+"��");
	System.out.println("��"+n+"�η���"+h+"��");
	
	}
}      
