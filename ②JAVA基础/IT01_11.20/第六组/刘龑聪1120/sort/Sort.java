package sort;

import java.util.Scanner;

/*���ߣ�������
 *E-mail��15539919713@163.com
 */
public class Sort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("�������һ������");
		int y = sc.nextInt();
		System.out.println("�������һ������");
		int z = sc.nextInt();
		
		int i[]={x,y,z};
		for (int a = 1; a < i.length; a++) {
			for (int b = 0; b < i.length; b++) {
				if (i[a] < i[b]) {
					int c = i[a];
					i[a] = i[b];
					i[b] = c;
				}
			}
		}
		for (int c = 0; c < i.length; c++) {
			System.out.print(i[c]);
			if (c < 2) {
				System.out.print("<");
			}
		}
		sc.close();
	}
}
