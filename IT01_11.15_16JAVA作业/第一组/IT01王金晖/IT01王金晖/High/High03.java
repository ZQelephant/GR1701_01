
public class High03 {
	public static void main(String[] args) {
		// 3 һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
		// �����£������� ��n�����ʱ�������������ף���n�η�����ߣ�

		double h = 100;

		double h_1 = h / 2;

		int i = 0;

		for (i = 2; i < 10; i++) {
			h = h + h_1 * 2;
			h_1 = h_1 / 2;

		}
		System.out.println(  i + "����ؾ���" + h + "��");
		System.out.println("��" + i + "�η���" + h_1 + "��");

	}

}
