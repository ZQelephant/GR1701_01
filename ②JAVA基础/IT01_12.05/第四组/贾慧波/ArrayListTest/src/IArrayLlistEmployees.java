import java.util.ArrayList;
import java.util.Scanner;


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
