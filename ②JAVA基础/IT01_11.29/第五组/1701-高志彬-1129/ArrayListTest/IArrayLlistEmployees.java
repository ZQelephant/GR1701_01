import java.util.ArrayList;

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
	boolean addEmployee(ArrayList<Employees> arrayList,Employees e);
	//ɾ��
	void removeEmployee(ArrayList<Employees> arrayList,Employees e);
	//�޸�
	void setEmployee(ArrayList<Employees> arrayList,Employees e);
	//��ѯ
	Employees findEmployee(ArrayList<Employees> arrayList,String name);
	
	//����
	void infoEmployee(ArrayList<Employees> arrayList);
	
	
	
	
	
	
	
	
}
