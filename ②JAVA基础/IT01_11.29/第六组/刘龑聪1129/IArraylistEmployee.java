package arraylisttest;

import java.util.ArrayList;

/*Author��������
  E-mail��15539919713@163.com
 */
public interface IArraylistEmployee {

	//��
	void addEmployee(ArrayList<Employee> employee,Employee e);
	//ɾ
	void removeEmployee(ArrayList<Employee> employee,Employee e);
	//��
	void setEmployee(ArrayList<Employee> employee,Employee e);
	//��
	Employee findEmployee(ArrayList<Employee> employee,String name);
	//����
	void ArrayListEmployee(ArrayList<Employee> employee);
	
}
