package score;

import java.util.Scanner;

/**
 * @author ���� E����mai l:�̽�2564963490@QQ.com
 * @date ����ʱ��: 2017��11��13�� ����7:56:53
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("A");
		}
		if ((score >= 60) && (score <= 89)) {
			System.out.println("B");
		}
		if (score < 60) {
			System.out.println("C");
		}

	}
}
