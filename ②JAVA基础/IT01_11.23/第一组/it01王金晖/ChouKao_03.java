package jtc;

import java.util.Scanner;


public class ChouKao_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������һ��������10000��������");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x <= 10000&&x >= 0){
			for(int i = 1;;i++){
				x = x/10;
				if(x <= 0){
					System.out.println("������һ��"+i+"λ����");
					break;
				}
			}
		}else{
			System.out.println("������һ��������10000������");
		}
	}

}
