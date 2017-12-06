import java.util.ArrayList;
import java.util.Scanner;


//ʵ����
public class EmployeeArrsyList implements IArrayListEmployee {
	
	void helpInfo(){
		System.out.println("-----��Ա����ϵͳ������Ϣ-----");
		System.out.println("[1]���ӹ�Ա������Add");
		System.out.println("[2]ɾ����Ա��Ϣ������Remove");
		System.out.println("[3]�˳�ϵͳ������Set");
		System.out.println("[4]�˳�ϵͳ������Exit");
	}
	
	@Override
	public boolean addEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		//��һ��������һ����Ա��Ϣ�����
		String s = sc.next();
		String[] a = s.split(",");
		
		//�ڶ�����ͨ����һ����������ݹ���һ����Ա����
		Employee e = new Employee();
		e.setId(a[0]);
		e.setName(a[1]);
		e.setSalary(Double.parseDouble(a[2]));
		e.setDate(a[3]);
		e.setDepartment(a[4]);
		
		//����������ӹ�Ա����arrayList.
		arrayList.add(e);
		
		return true;
	}

	@Override
	public void removeEmployee(ArrayList<Employee> arrayList, String name) {
		//����
		Employee e;
		e = findEmployee(arrayList, name);
		
		//�жϸ�Ա���Ƿ����б�����ڣ���ɾ��
		if (null == e) {
			System.out.println("���޴��ˣ��޷�ɾ��");
		} else {
			arrayList.remove(e);
		}
		 
		//ɾ��֮��������һ��
		infoArrayListEmployee(arrayList);
		
	}

	@Override
	public void setEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		
		Employee e;
		//������Ϣ
		String s = sc.next();
		//���һ���ַ�������
		String[] a = s.split(",");
		double salary = Double.parseDouble(a[3]);
		String name = a[0];
		e = this.findEmployee(arrayList, name);
		
		if (null==e) {
			System.out.println("���޴��ˣ��޷��޸�");
		} else {
			e.setSalary(salary);
			String department = a[5];
			e.setDepartment(department );
		}
		infoArrayListEmployee(arrayList);
	}

	@Override
	public Employee findEmployee(ArrayList<Employee> arrayList, String name) {
		Employee e;
		//1��ѭ������
		for (int i = 0; i < arrayList.size(); i++) {
			
			e = arrayList.get(i);
			String eName = e.getName();
			//�ж������Ƿ�һ�£���һ�£����ҵ��˸ö��󣬷��ظö���
			if (eName.equals(name)) {
				return e;
			}
			
		}
		System.out.println("���޴��ˣ�����");
		return null;
	}

	@Override
	public void infoArrayListEmployee(ArrayList<Employee> arrayList) {
		//��������������
		for (int i = 0; i < arrayList.size(); i++) {
			Employee e = arrayList.get(i);
			String s = e.toString();
			System.out.println(s);
		}
	}

}
