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
public interface IEmployee {

	//����
	boolean addEmployee(ArrayList<Employee> arrayList,Employee e);
	//ɾ��
	void removeEmployee(ArrayList<Employee> arrayList,Employee e);
	//�޸�
	void setEmployee(ArrayList<Employee> arrayList,Employee e);
	//��ѯ
	Employee findEmployee(ArrayList<Employee> arrayList,String name);
	//����
	void infoArrayListEmployee(ArrayList<Employee> arrayList);
}
