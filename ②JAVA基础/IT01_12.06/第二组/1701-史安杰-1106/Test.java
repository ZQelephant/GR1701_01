import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Address> arrayList = new ArrayList<Address>();
		Scanner sc = new Scanner(System.in);
		Service a = new Service();
		Boolean isc = true;
		a.help();
		while (isc) {
			System.out.println("������һ����䣬�����س���");
			String key = sc.next();

			switch (key) {
			case "1":
				System.out.println("��������Ҫ¼�����Ϣ�����ö��Ÿ���");
				a.addAddr(arrayList, sc);

				break;

			case "2":
				a.infoAddr(arrayList);

				break;

			case "3":
				System.out.println("��������Ҫ����������");
				String name = sc.next();
				a.findByname(arrayList, name);

				break;

			case "4":
				System.out.println("��������Ҫ�������Ա�");
				String sex = sc.next();

				a.findBysex(arrayList, sex);

				break;

			case "5":
				System.out.println("��������Ҫ�����ĺ���");
				String call = sc.next();
				a.findBycall(arrayList, call);

				break;

			case "6":
				isc = false;

				break;

			default:
				break;
			}

		}
		System.out.println("�����˳�ϵͳ,�ݰ�����");

	}

}
