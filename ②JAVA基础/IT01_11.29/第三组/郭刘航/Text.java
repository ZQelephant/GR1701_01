package Practice_1129;

import java.util.ArrayList;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		Employee a = new Employee("0100","���½�", 100, "1998/06/14", "����");
	    arrayList.add(a);
	    arrayList.addAll(arrayList);
	    arrayList.add(new Employee("0101", "����", 0, "0", "�̿�"));
	    arrayList.add(null);
	    System.out.println();
	    System.out.println(arrayList.size());
	    arrayList.get(0);
	}

}
