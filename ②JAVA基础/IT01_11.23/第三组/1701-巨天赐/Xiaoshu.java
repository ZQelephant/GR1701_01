package JTC;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/** 
 * @author  ����:xuyunmeng
 * @date    ����ʱ�䣺2017��11��16�� ����7:20:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Xiaoshu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����С��a");
		float a=sc.nextFloat();
		
		System.out.println("����С��b");
		float b=sc.nextFloat();
		if(a>b){
			System.out.println(a+">"+b);
		}
		else {
			System.out.println(a+"<"+b);
		}
		
		
	}

	
}

