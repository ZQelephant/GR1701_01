import java.util.Scanner;


public class Test09 {
	static boolean multiple = false;

public static boolean Multiple(int n, int m) {
	multiple =(n%m==0)?true:false;
	return multiple;
}

static boolean include = false;

public static boolean Include(int q, int w) {
	int r = q;
	while (r > 0) {
		if (r % 10 == w) {
			include = true;
			break;

		} else {
			r = r / 10;
			include = false;
		}

	}

	return include;
}

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("������һ��������10000����N");

	int N = sc.nextInt();

	System.out.println("N��Χ������7�ı����Ұ���7��������");

	if (N > 10000) {
		System.out.println("������Χ");
	}

	else {
		for (int i = 1; i <= N; i++) {
			if (Multiple(i, 7) && Include(i, 7)) {
				System.out.println(i);
			}
		}

	}
	sc.close();
}
	

}
