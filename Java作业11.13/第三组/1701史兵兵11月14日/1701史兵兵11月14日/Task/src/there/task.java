package there;

import java.util.Scanner;

public class task {
	public static void main(String[] args) {
		/**3��������Ԫ�����������Ƕ�׻�ѡ��ṹ����ɴ��⣺
		ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��
		60�����µ���C��ʾ��
		���������(a>b)?a:b��������������Ļ������ӡ�*/
		
		
		
		Scanner input = new Scanner(System.in);
        		
		
		
		System.out.println("������ĳɼ�");
		int score = input.nextInt();
		if(score >=90){
			System.out.println("a");
		}else if(score>=60){
			System.out.println("b");
		}else{
			System.out.println("c");
		}
		/**Scanner sc=new Scanner(System.in);
		System.out.println("���������");
		int score=sc.nextInt();
		
		if(score>=90){System.out.println("A");}
		if((score>=60)&&(score<=89)){System.out.println("B");}
		if(score<60){System.out.println("C");}*/
	
}

}
