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
public interface IEmployee {

	//����
	void addEmployee(ArrayList<Employee> arrayList,Scanner sc);
	//ɾ��
	void removeEmployee(ArrayList<Employee> arrayList,String name);
	//�޸�
	void setEmployee(ArrayList<Employee> arrayList,Scanner sc);
	//��ѯ
	Employee findEmployee(ArrayList<Employee> arrayList,String name);
	//����
	void infoArrayListEmployee(ArrayList<Employee> arrayList);
}
