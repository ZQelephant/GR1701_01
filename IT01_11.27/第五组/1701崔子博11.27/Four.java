import java.util.Scanner;


public class Four {
	
	public static void main(String[] args) {
		//4 �Ӽ�������10���������Ӵ�С����
		
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int [10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("������"+(i+1)+"����");
			
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int t =a[i];
					 a[i]=a[j];
					 a[j]=t;
				}				
			}			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print("   "+a[i]);
		}
		
		
		
		
	}

}
