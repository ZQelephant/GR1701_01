import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<Kaoshen> arrayList = new ArrayList<Kaoshen>();

		Scanner sc = new Scanner(System.in);

		ScoreFenshu scoreFenshu = new ScoreFenshu();

		scoreFenshu.in();

		boolean b = true;

		while (b) {
			int s = sc.nextInt();

			switch (s) {
			case 1:
				scoreFenshu.addFenshu(arrayList, sc);
				System.out.println("��������һ��ָ��");
				break;
			case 2:
				scoreFenshu.infoFenshu(arrayList);
				System.out.println("��������һ��ָ��");
				break;

			case 3:
				scoreFenshu.info();

				boolean b1 = true;
				while (b1) {
					int s1 = sc.nextInt();
					switch (s1) {
					case 1:
						scoreFenshu.setMAXFenshu(arrayList, "�ܳɼ�");
						break;
					case 2:
						scoreFenshu.setMAXFenshu(arrayList, "����");
						break;
					case 3:
						scoreFenshu.setMAXFenshu(arrayList, "��ѧ");
						break;
					case 4:
						scoreFenshu.setMAXFenshu(arrayList, "Ӣ��");
						break;
					case 5:
						scoreFenshu.in();
						b1 = false;
						break;

					default:
						System.out.println("��������");
						break;
					}
				}
				break;

			case 4:
				b = false;
				break;

			default:
				System.out.println("��������");
				break;
			}
		}
		System.out.println("�ټ�");
	}

}
