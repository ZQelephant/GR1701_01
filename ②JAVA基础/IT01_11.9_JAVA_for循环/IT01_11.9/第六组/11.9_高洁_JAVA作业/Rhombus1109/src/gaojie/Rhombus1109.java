package gaojie;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��8�� ����4:43:17
 */
public class Rhombus1109 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			{
				if (i == 1) {
					System.out.print("           ");
				}
				if (i == 2) {
					System.out.print("          ");
				}
				if (i == 3) {
					System.out.print("         ");
				}
				if (i == 4) {
					System.out.print("        ");
				}
				if (i == 5) {
					System.out.print("       ");
				}
				if (i == 6) {
					System.out.print("      ");
				}
				if (i == 7) {
					System.out.print("     ");
				}
				if (i == 8) {
					System.out.print("    ");
				}
				if (i == 9) {
					System.out.print("   ");
				}
				if (i == 10) {
					System.out.print("  ");
				}

			}

			for (int g = 1; g <= (2 * i - 1); g++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int t = 9; t >= 1; t--) {
			{
				if (t == 9) {
					System.out.print("   ");
				}
				if (t == 8) {
					System.out.print("    ");
				}
				if (t == 7) {
					System.out.print("     ");
				}
				if (t == 6) {
					System.out.print("      ");
				}
				if (t == 5) {
					System.out.print("       ");
				}
				if (t == 4) {
					System.out.print("        ");
				}
				if (t == 3) {
					System.out.print("         ");
				}
				if (t == 2) {
					System.out.print("          ");
				}
				if (t == 1) {
					System.out.print("           ");
				}
			}
			for (int y = 1; y <= 2 * t - 1; y++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
