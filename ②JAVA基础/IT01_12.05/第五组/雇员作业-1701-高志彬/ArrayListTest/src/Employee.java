import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��30�� ����2:36:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Employee implements IArrayLlistEmployees {
	
	public void help() {
		System.out.println("-----��Ա����ϵͳ-----");
		System.out.println("(1).��ӹ�Ա��Ϣ������Add��");
		System.out.println("(2).ɾ����Ա��Ϣ������Remove��");
		System.out.println("(3).�޸Ĺ�Ա��Ϣ������Set��");
		System.out.println("(4).���ҹ�Ա��Ϣ������Find��");		
		System.out.println("(5).�鿴ȫ����Ϣ������Info��");	
		System.out.println("(6).�˳�ϵͳ������Exit��");		
	}
	
	public boolean addEmployee(ArrayList<Employees> arrayList, Scanner sc) {
		String s=sc.next();
		String []a = s.split(",");
		
		Employees e =new Employees();
		e.setId(a[0]);
		e.setName(a[1]);
		e.setSalary(Double.parseDouble(a[2]));
		e.setDate(a[3]);
		e.setDepartment(a[4]);
		
		arrayList.add(e);

		return false;
	}

	@Override
	public void removeEmployee(ArrayList<Employees> arrayList,String name) {
		Employees e;
		e= this.findEmployee(arrayList, name);
		
		if (null==e) {
			System.out.println("���޴��ˣ��޷�ɾ����");
		}else{
			arrayList.remove(e);
		}

	}

	@Override
	public void setEmployee(ArrayList<Employees> arrayList,Scanner sc) {
		String s=sc.next();
		String []a=s.split(",");
		
		String name=a[0];
		
		Employees e=this.findEmployee(arrayList, name);
		if (null==e) {
			System.out.println("���޴��ˣ��޷���ġ�");
		} else {
			double salary = 0;
			e.setSalary(salary);
		}		
	}

	@Override
	public Employees findEmployee(ArrayList<Employees> arrayList, String name) {
		Employees e ;
		for (int i = 0; i < arrayList.size(); i++) {
			e=arrayList.get(i);
			String eName = e.getName();
			if (eName.equals(name)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void infoEmployee(ArrayList<Employees> arrayList) {
		for (int i = 0; i <arrayList.size() ; i++) {
			Employees e =arrayList.get(i);
			String s=e.toString();
			System.out.println(s);
		}

	}

}
