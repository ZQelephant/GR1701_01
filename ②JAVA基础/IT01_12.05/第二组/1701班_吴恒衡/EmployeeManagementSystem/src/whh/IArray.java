package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��5�� ����8:31:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IArray {
	//����
	void addArray(ArrayList<Employee> arrayList,Scanner sc);
	//ɾ��
	void romoveArray(ArrayList<Employee> arrayList,String name);
	//�޸�
	void setArray(ArrayList<Employee> arrayList,Scanner sc);
	//����
	Employee findArray(ArrayList<Employee> arrayList,String name);
}
