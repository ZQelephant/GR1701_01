import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��12��5�� ����7:13:47
 */
public class ScoreEmployee implements IEmployee {

	@Override
	public void info() {
		System.out.println("����������Ա�ɼ�ϵͳ��������");
		System.out.println("���ӹ�Ա��Ϣ�����룺1");
		System.out.println("ɾ����Ա��Ϣ�����룺2");
		System.out.println("�޸Ĺ�Ա��Ϣ�����룺3");
		System.out.println("���ҹ�Ա��Ϣ�����룺4");
		System.out.println("��ʾ��Ա��Ϣ�����룺5");
		System.out.println("�˳������룺6");

	}

	@Override
	public void zhenEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("�������Ա��Ϣ");
		System.out.println("��,�Ÿ���");
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length == 5) {
			Employee employee = new Employee(a[0], a[1],
					Double.parseDouble(a[2]), a[3], a[4]);

			arrayList.add(employee);

			System.out.println(employee.toString());
			System.out.println("��ӳɹ�");

		} else {
			System.out.println("��������");
		}

	}

	@Override
	public void shanEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String namer = sc.next();

		for (int i = 0; i < arrayList.size(); i++) {
			Employee employee2 = arrayList.get(i);
			if (employee2.getName().equals(namer)) {
				arrayList.remove(i);
				System.out.println("ɾ���ɹ�");
				break;
			}

		}

	}

	@Override
	public void gaiEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String name = sc.next();
		for (Employee employee : arrayList) {
			String name2 = employee.getName();
			if (name.equals(name2)) {

			}
		}

	}

	@Override
	public void chaEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String name = sc.next();
		ArrayList<Employee> arrayList2 = new ArrayList<Employee>();
		for (Employee employee : arrayList) {
			String name2 = employee.getName();
			if (name.equals(name2)) {
				arrayList2.add(employee);
				System.out.println(arrayList2.toString());
				System.out.println("��Ϊ���ҵ�");
			} else {
				System.out.println("�������");
			}
		}

	}

	@Override
	public void xiansiEmployee(ArrayList<Employee> arrayList) {
		for (Employee employee : arrayList) {
			System.out.println(employee.toString());
		}

	}

}
