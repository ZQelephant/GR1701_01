package com.;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��11��28�� ����10:18:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public interface IArrayInterface {
	//����
	void helpEmployee ();
	
	//����
	void  addEmployee (ArrayList<Employee> arraylist,Scanner  sc);
	
	//�Ƴ�
	void removeEmployee (ArrayList<Employee> arraylist,String name);
	
	//�޸�
	
	void setEmployee  (ArrayList<Employee> arraylist,Scanner sc);
	
	//����
	
	Employee findEmployee(ArrayList<Employee> arraylist,String name); 

}
