import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		//����һ��ArrayList���ڴ洢��Ա��Ϣ
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		//����һ��ʵ����������Բ����������ɾ�Ĳ�ķ���
		EmployeeArrsyList emp = new EmployeeArrsyList(); 
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		emp.helpInfo();
		String key;
		String name;
		while (isQuit) {
			key = sc.next();
			switch (key) {
			case "Quit":
				isQuit = false;
				break;
			
			case "Add":
				emp.addEmployee(arrayList, sc);
				emp.infoArrayListEmployee(arrayList);
				break;
				
			case "Remove":
				name = sc.next();
				emp.removeEmployee(arrayList, name);
				break;
			
			case "Set":
				emp.setEmployee(arrayList, sc);
				break;
				
			case "Find":
				Employee e;
				name = sc.next();
				e = emp.findEmployee(arrayList, name);
				System.out.println("----�ҵ����ˣ���Ϣ���£�");
				System.out.println(e.toString());
				break;
			
			default:
				
				break;
			}
		}
	}

}
