package integer;

public class Integer {

	public static void main(String[] args) {
		// ������1~100���ۼ�ֵ����Ҫ��������λΪ3����
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 3)
				continue;
			sum += i;

		}
		System.out.println("1~100���ۼ�ֵ�ǣ�" + sum);
	}
}
