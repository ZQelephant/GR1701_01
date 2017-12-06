package whh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:2421922506@QQ.com
 * @date ����ʱ�䣺2017��12��5�� ����8:38:33
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ArrayService implements IArray {
	public void info() {
		System.out.println("----��Ա����ϵͳ������Ϣ-----");
		System.out.println("[1]���ӹ�Ա������Add");
		System.out.println("[2]ɾ����Ա������Remove");
		System.out.println("[3]���ҹ�Ա������Set");
		System.out.println("[4]�޸Ĺ�Ա������Find");
		System.out.println("[5]�˳�������Exit");
	}

	// ����
	@Override
	public void addArray(ArrayList<Employee> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		int length = a.length;
		if (length != 5) {
			System.out.println("���������Ϣ������");
		} else {
			Employee employee = new Employee();
			employee.setId(a[0]);
			employee.setName(a[1]);
			employee.setPrice(Double.parseDouble(a[2]));
			employee.setDate(a[3]);

			employee.setDepartment(a[4]);
			arrayList.add(employee);
			System.out.println(employee.toString());
		}

	}

	// ����
	public void infoArrayEmp(ArrayList<Employee> arrayList) {
		String s;
		for (int i = 0; i < arrayList.size(); i++) {
			s = arrayList.get(i).toString();
			System.out.println(s);
		}
	}

	// ɾ��
	@Override
	public void romoveArray(ArrayList<Employee> arrayList, String name) {
		Employee a;
		a = this.findArray(arrayList, name);
		if (null == a) {
			System.out.println("��Ҫɾ���Ķ��󲻴���");
		} else {
			arrayList.remove(a);
		}
		this.infoArrayEmp(arrayList);
	}

	// �޸�
	@Override
	public void setArray(ArrayList<Employee> arrayList, Scanner sc) {
		Employee temp;
		String a = sc.next();
		String[] arr = a.split(",");
		temp = this.findArray(arrayList, arr[0]);
		
		if(null==temp){
			System.out.println("��Ҫ�޸ĵĶ��󲻴���");
		}else{
			temp.setId(arr[1]);
			temp.setPrice(Double.parseDouble(arr[3]));
			temp.setDepartment(arr[5]);
			
			
		}
		this.infoArrayEmp(arrayList);
	}

	// ����
	@Override
	public Employee findArray(ArrayList<Employee> arrayList, String name) {
		Employee e = null;
		for (int i = 0; i < arrayList.size(); i++) {
			
			e = arrayList.get(i);
			 String name2 = e.getName();
			
			if (name2.equals(name)) {
				System.out.println(e.toString());
				
				return e ;
			}
		}
		
		return e;

	}
}
