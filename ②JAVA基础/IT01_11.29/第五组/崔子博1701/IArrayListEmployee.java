import java.util.ArrayList;


public interface IArrayListEmployee {
	//����
	boolean addEmployee(ArrayList<Employee>arraylist,Employee e);
	//ɾ��
	void removeEmployee(ArrayList<Employee>arrayList,Employee e);
	//�޸�
	void setEmployee(ArrayList<Employee>arrayList,Employee e);
	//��ѯ
	Employee findEmployee(ArrayList<Employee>arrayList,String name);
    //����
	void infoArraylistEmployee(ArrayList<Employee>arrayList);
	
	

}
