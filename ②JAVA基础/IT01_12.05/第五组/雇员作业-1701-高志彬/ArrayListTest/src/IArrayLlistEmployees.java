import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��29�� ����11:30:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IArrayLlistEmployees {
	
	//����
	boolean addEmployee(ArrayList<Employees> arrayList,Scanner sc);
	//ɾ��
	void removeEmployee(ArrayList<Employees> arrayList,String name);
	//�޸�
	void setEmployee(ArrayList<Employees> arrayList,Scanner sc);
	//��ѯ
	Employees findEmployee(ArrayList<Employees> arrayList,String name);	
	//����
	void infoEmployee(ArrayList<Employees> arrayList);
	
	
	
	
	
	
	
	
}
