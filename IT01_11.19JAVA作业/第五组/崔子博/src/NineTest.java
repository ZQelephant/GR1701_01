import java.util.Scanner;


public class NineTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();
		
		if(a>10000){
			System.out.println("����");
		}else{
			for(int b=1;b<a;b++){
				if(b%7==0||b%10==7||b/10%10==7||b/100==7||b/1000==7){
					System.out.println(b);
				}
			}
		}

}
}
