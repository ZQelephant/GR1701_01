package objectoriented;

import java.util.Scanner;

public class Ternarytopic {
/*3��������Ԫ�����������Ƕ�׻�ѡ��ṹ����ɴ��⣺
	 ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��
	 60-89��֮�����B��ʾ��
	 60�����µ���C��ʾ��
	 ���������(a>b)?a:b��������������Ļ������ӡ�
*/	
public static void main(String[] args) {
		       System.out.println("������ɼ�0~120");
Scanner sc =new Scanner(System.in);
		int d=sc.nextInt();
		if (d>=90 && d<=120){
		       System.out.println("A");
		}
		else if(89>=d && d>=60){			
		       System.out.println("B");
		}else {
			
		       System.out.println("C");
		
		}
	}
}
