import java.util.Scanner;

public class O1120 {
	// �ھ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int N = sc.nextInt();
		for (N = 0; N < 10000; N++) {
			if (N % 7 == 0 || N % 10 == 0 || N / 10 % 10 == 0 || N / 100 == 0
					|| N / 1000 == 0) {
				System.out.println(N);
			}
		}
	}

}
