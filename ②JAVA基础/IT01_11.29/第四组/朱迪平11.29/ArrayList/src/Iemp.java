import java.util.ArrayList;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��29�� ����11:30:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public interface Iemp {
boolean addEmployee(ArrayList<Employee> arrayList,Employee e);
void  removeEmployee(ArrayList<Employee> arrayList,Employee e);
void setEmoloyee(ArrayList<Employee> arrayList,Employee e);
Employee findEmployee(ArrayList<Employee> arrayList,String name);	
void infoArrayLiseEmployee(ArrayList<Employee> arrayList);

}
