import java.util.ArrayList;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��29�� ����10:16:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {public static void main(String[] args) {
	ArrayList<Employee> arrayList=new ArrayList<Employee>();
	Employee e=new Employee("0001" ,"�����Ȱ�",100000, "19980528", "���ս�");
	arrayList.add(e);
	arrayList.add(new Employee("0001" ,"����",50000, "19980528", "���ս�"));
	arrayList.add(new Employee("0002" ,"����",55000, "19980528", "���ս�"));
	arrayList.add(new Employee("0003" ,"���׷�",17000, "19980528", "���ս�"));
	arrayList.add(new Employee("0004" ,"����ӱ",19000, "19980528", "���ս�"));
	System.out.println(arrayList.size());
	arrayList.get(0);
	System.out.println(arrayList.get(0));
	arrayList.set(0, e);
	e.setDate("19980707");
	arrayList.remove(0);
	for (int i = 0; i < arrayList.size(); i++) {
		Employee e1=arrayList.get(i);
		System.out.println(e1.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
}

}
