import java.util.ArrayList;
import java.util.Scanner;


public interface IArrayListEmployee {

	//����
	boolean addEmployee(ArrayList<Employee> arrayList, Scanner sc);
	//ɾ��
	void removeEmployee(ArrayList<Employee> arrayList,String name);
	//�޸�
	void setEmployee(ArrayList<Employee> arrayList,Scanner sc);
	//��ѯ
	Employee findEmployee(ArrayList<Employee> arrayList,String name);
	//����
	void infoArrayListEmployee(ArrayList<Employee> arrayList);
}
