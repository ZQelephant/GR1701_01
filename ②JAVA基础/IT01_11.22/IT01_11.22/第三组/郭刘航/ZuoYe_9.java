package glh;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��22�� ����8:29:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe_9 {
    static boolean isDivision(int x,int y){
 	   return (y%x==0)?true:false;
    }
    
    static boolean isContainNum(int y,int x){
    	boolean isCotain = false;
    	int z = y;
    	while(z>0){
    		if (z%10==x){
    			isCotain = true;
    			break;
    		}else{
    			z = z / 10;
    		}
    	}
    	return  isCotain;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����N(N<10000)");
		int N = sc.nextInt();
		System.out.println("N��Χ������7�ı����Ұ���7�������±�ʾ��");
		if(N < 10000){
		for (int a = 1;a <= N;a++){
			if(isDivision(a,7)&&isContainNum(a, 7)){
				System.out.println(a);
			}
		}
	}
	if (N >= 10000 || N <= 0){
		System.out.println("��Χ֮��");
	}
}
}
