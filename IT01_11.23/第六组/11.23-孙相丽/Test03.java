import java.util.Scanner;

public class Test03 {

	// ��дJava����ͨ������̨����һ������N��N������10000���жϸ������Ǽ�λ��������������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		if (N <= 0 || N > 10000) {
			System.out.println("�������");

		} else if (N % 2 == 0) {
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					sum += i;
				}
			}
			System.out.println("ż����Ϊ��" + sum);
		} else if (N % 2 != 0) {
			for (int i = 1; i <= N; i++) {
				if (i % 2 != 0) {
					sum += i;

				}
			}
			System.out.println("������Ϊ��" + sum);
		}
		sc.close();
	}
}
