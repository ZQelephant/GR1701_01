import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��12��6�� ����5:53:01
 */
public class Test {
	public static void main(String[] args) {
		PhoneSerrice phoneSerrice = new PhoneSerrice();
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> arrayList = new ArrayList<Phone>();

		phoneSerrice.info();

		boolean b = true;
		while (b) {
			int i1 = sc.nextInt();
			switch (i1) {
			case 1:
				phoneSerrice.addPhone(arrayList, sc);
				break;
			case 2:
				phoneSerrice.infoPhone(arrayList);
				break;
			case 3:
				phoneSerrice.findsex(arrayList);
				break;
			case 4:
				phoneSerrice.findname(arrayList);
				break;
			case 5:
				phoneSerrice.findphoneNumber(arrayList);
				break;
			case 6:
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
