package whh;

import java.util.ArrayList;
import java.util.Scanner;


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
