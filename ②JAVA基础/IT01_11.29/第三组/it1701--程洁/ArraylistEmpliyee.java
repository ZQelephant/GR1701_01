package arraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEmpliyee extends Employee implements IArraylistEmployee {

	Scanner sc = new Scanner(System.in);
	@Override
	public Employee addEmployee(ArrayList<Employee> employee, Employee e) {

		System.out.println("������Ա����ţ�");
		e.setId(sc.next());
		System.out.println("������Ա��������");
		e.setName(sc.next());
		System.out.println("������Ա��нˮ��");
		e.setSalary(sc.nextDouble());
		System.out.println("��������ְ���ڣ�");
		e.setDate(sc.next());
		System.out.println("���������β��ţ�");
		e.setdepartment(sc.next());
		
		return e;

	}

	@Override
	public void removeEmployee(ArrayList<Employee> employee, Employee e) {


	}

	@Override
	public void setEmployee(ArrayList<Employee> employee, Employee e) {


	}

	@Override
	public Employee findEmployee(ArrayList<Employee> employee, String name) {

		return null;
	}

	@Override
	public void ArrayListEmployee(ArrayList<Employee> employee) {
		for (int i = 0; i < employee.size(); i++) {
			
			System.out.println(employee.toString());
		}
			System.out.println();
	}

}
