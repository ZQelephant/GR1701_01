package arraylisttest;

import java.util.ArrayList;


public interface IArraylistEmployee {

	//��
	Employee addEmployee(ArrayList<Employee> employee,Employee e);
	//ɾ
	void removeEmployee(ArrayList<Employee> employee,Employee e);
	//��
	void setEmployee(ArrayList<Employee> employee,Employee e);
	//��
	Employee findEmployee(ArrayList<Employee> employee,String name);
	//����
	void ArrayListEmployee(ArrayList<Employee> employee);
	
}
