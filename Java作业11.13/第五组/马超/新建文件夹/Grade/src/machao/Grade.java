package machao;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:09:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Grade {
    public static void main(String[] args) {
    	//������Ԫ�����������Ƕ�׻�ѡ��ṹ����ɴ���
    	//ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
    	for (;;) {
    	System.out.println("�������ѧ���ĳɼ�");
    	Scanner sc = new Scanner(System.in);
    	int grade = sc.nextInt();

    	System.out.println(grade >= 90 ? "A" : grade >= 60 ? "B" : "C");
	}
    }
}