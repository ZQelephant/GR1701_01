package kaoshiti;

import java.util.Scanner;

public class Kaoshiti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int score=sc.nextInt();
		if(score>0){
			System.out.println("��������һ������");
		}
		else if(score<0){
			System.out.println("��������һ������");
		}
		else{
			System.out.println("��������ȷ������");
		}
	}
}
