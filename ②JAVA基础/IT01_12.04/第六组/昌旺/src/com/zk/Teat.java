/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��4�� ����8:55:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public class Teat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Gaokaochengji gc=new Gaokaochengji();
		boolean isq=true;
		gc.help1();
		boolean isqq=false;
		ArrayList<Kaoshi> ss=new ArrayList<Kaoshi>();
		while (isq) {
			int key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("����������");
				gc.addkaoshi(ss, sc);
				break;
			case 2:
				gc.inforkaoshi(ss);
				break;
			case 3:
				gc.help2();
				isqq=true;
				while (isqq) {
					switch (key) {
					case 1:
						gc.maxkaoshi(ss, "�ܷ�");
						break;
					case 2:
						gc.maxkaoshi(ss, "����");
						break;
					case 3:
						gc.maxkaoshi(ss, "��ѧ");
						break;
					case 4:
						gc.maxkaoshi(ss, "����");
						break;
					case 5:
						gc.help1();
						isqq=false;
						break;

					default:
						break;
					}
					
				}
			case 4:
				isq=false;
				break;

			default:
				System.out.println("");
				break;
			}
			
		}

	}

}
