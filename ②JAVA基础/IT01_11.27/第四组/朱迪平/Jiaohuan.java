import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��11��27�� ����6:54:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Jiaohuan {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[]a=new int[10];
	for (int i = 0; i < a.length; i++) {
		System.out.println("����"+(i+1)+"����");
		a[i]=sc.nextInt();
	}System.out.println(Arrays.toString(a));
	int s=0;
	int h=0;
	for (int i = 0; i < a.length; i++) {
		if (i==1) {
			s=a[1];
			a[1]=a[5];
			a[5]=s;
		}if (i==3) {
			h=a[3];
			a[3]=a[7];
			a[7]=h;
		}
	}System.out.println(Arrays.toString(a));
}

}
