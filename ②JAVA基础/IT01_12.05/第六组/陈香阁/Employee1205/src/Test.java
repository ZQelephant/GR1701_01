import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {

		ScoreEmployee scoreEmployee = new ScoreEmployee();

		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		Scanner sc = new Scanner(System.in);

		boolean bo = true;

		scoreEmployee.info();

		while (bo) {

			int i = sc.nextInt();

			switch (i) {
			case 1:
				scoreEmployee.zhenEmployee(arrayList, sc);
				break;
			case 2:
				System.out.println("�����뱻ɾ���˵�����");
				scoreEmployee.shanEmployee(arrayList, sc);
				break;
			case 3:
				System.out.println("�����뱻�޸��˵�����");
				scoreEmployee.gaiEmployee(arrayList, sc);
				break;
			case 4:
				System.out.println("�����뱻�����˵�����");
				scoreEmployee.chaEmployee(arrayList, sc);
				break;
			case 5:
				scoreEmployee.xiansiEmployee(arrayList);
				break;
			case 6:
				bo = false;
				break;

			default:
				System.out.println("��������");
				break;
			}
		}
		System.out.println("�ټ�");

		sc.close();
	}
}
