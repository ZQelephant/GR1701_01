package wangshenliang;

import java.util.Scanner;

/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:22:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class For {
	 public static void main(String[] args) {
			//������
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.println("����һ��5λ��");
	    	 int t = sc.nextInt();
	    	 
	    	if(t/10000==t%10 && t/1000%10==t/10%10 ){
	    		System.out.println(t+"�����ǻ�����");
	    			
	    		}else{
	    			System.out.println(t+"�������ǻ�����:");
	    			
	    		}
	    	
	    	
		}

}
