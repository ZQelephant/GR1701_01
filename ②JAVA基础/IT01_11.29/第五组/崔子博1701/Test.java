import java.util.ArrayList;


public class Test {
	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		
		Employee employee = new Employee("0301","������",100,"20120101","�з���");
		arrayList.add(employee);
		arrayList.add(new Employee("0102","�����",100,"20120101","�з���"));
		arrayList.add(new Employee("0103","��Ī��",100,"20120101","�з���"));
		arrayList.add(new Employee("0104","������",100,"20120101","�з���"));
		System.out.println();
		System.out.println(arrayList.size());
		
		Employee e1=arrayList.get(0);
		String s =e1.toString();
		employee.setSalary(3920);
		arrayList.set(0,employee);
		arrayList.remove(e1);
		
		for (int i = 0; i < args.length; i++) {
			Employee e2= arrayList.get(i);
			System.out.println(e2.toString());
		}
	
	}

}
