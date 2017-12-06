package Practice1130;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class IEmployeeTest implements IEmployee {
	
	public void info() {
		System.out.println("----��Ա����ϵͳ������Ϣ-----");
		System.out.println("[1]���ӹ�Ա������Add");
		System.out.println("[2]ɾ����Ա������Remove");
		System.out.println("[3]���ҹ�Ա������Set");
		System.out.println("[4]�޸Ĺ�Ա������Find");
		System.out.println("[5]�˳�������Quit");
	}

	@Override
	public void addEmployee(ArrayList<Employee> arrayList, Scanner sc) {String s = sc.next();
	String[] a = s.split(",");
	int length = a.length;
	if (length != 5) {
		System.out.println("���������Ϣ������");
	} else {
		Employee employee = new Employee();
		employee.setId(a[0]);
		employee.setName(a[1]);
		employee.setSalary(Double.parseDouble(a[2]));
		employee.setDate(a[3]);

		employee.setDepartment(a[4]);
		arrayList.add(employee);
		System.out.println(employee.toString());
	}

}
	@Override
	public void removeEmployee(ArrayList<Employee> arrayList, String name) {
		Employee o;
		o = this.findEmployee(arrayList, name);
		
		if (null == o) {
			System.out.println("���޴��ˣ�������");
		} else {
			arrayList.remove(o);
		}

	}

	@Override
	public void setEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		Employee temp;
		String a = sc.next();
		String[] arr = a.split(",");
		temp = this.findEmployee(arrayList, arr[0]);
		
		if(null==temp){
			System.out.println("��Ҫ�޸ĵĶ��󲻴���");
		}else{
			temp.setId(arr[1]);
			temp.setSalary((Double.parseDouble(arr[3])));
			temp.setDepartment(arr[5]);
			
			
		}
		this.infoArrayListEmployee(arrayList);
		
		

	}

	@Override
	public Employee findEmployee(ArrayList<Employee> arrayList, String name) {
		Employee o = null;
		for (int i = 0; i < arrayList.size(); i++) {
			o = arrayList.get(i);
			String oName = o.getName();
			
			if (oName.equals(oName)) {
				return o;
			}
		}
		return o;
	}

	@Override
	public void infoArrayListEmployee(ArrayList<Employee> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Employee e = arrayList.get(i);
			String q =e.toString();
			System.out.println(q);
		}

	}

}
