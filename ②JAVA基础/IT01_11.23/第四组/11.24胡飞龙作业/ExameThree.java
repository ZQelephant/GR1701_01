import java.util.Scanner;


public class ExameThree {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ����");

		int a = sc.nextInt();
		if (a<10) {
			System.out.println("һλ��");
			
		}
		if (a<100&&a>=10) {
			System.out.println("��λ��");
		}
		if (a<1000&&a>=100) {
			System.out.println("��λ��");
		}
		if (a<10000&&a>=1000) {
			System.out.println("��λ��");
		}
		
	
	}

}
