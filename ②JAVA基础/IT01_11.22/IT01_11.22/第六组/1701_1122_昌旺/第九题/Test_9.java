import java.util.Scanner;


public class Test_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������1000������");
		int a = sc.nextInt();
		for(int b=1;b<=a;b++){
			if(b%7==0&&(b%10==7||b/10%10==7||b/100%10==7)){
				System.out.println(b);
			}
		}
		
	}

}
