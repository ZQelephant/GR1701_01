import java.util.Scanner;


public class Three {
	public static void main(String[] args) {
		
		
		//3 �Ӽ�������10�����������5����
		
		Scanner sc = new Scanner(System.in);
		
		int []a=new int [10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("������"+(i+1)+"����");
			
			a[i]=sc.nextInt();
			System.out.println();
			
		}
		for (int i = 5; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		
		
	}

}
