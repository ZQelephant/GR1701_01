package Practice1130;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Practice_01 {

	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		IEmployeeTest emp = new IEmployeeTest();
		Scanner sc = new Scanner(System.in);
		boolean isExit = true;
		String a = null;
		while (isExit) {
			switch (a) {
			case "Quit":
				isExit = false;
				System.out.println("See you next time");
				break;

			case "Add":
				emp.addEmployee(arrayList, sc);
				break;
				
			case "Remove":
				emp.removeEmployee(arrayList, a);
				break;
				
			case "Set":
				emp.setEmployee(arrayList, sc);
				break;
				
			case "Find":
				emp.findEmployee(arrayList, a);
				break;
			default:
				System.out.println("��������ȷ��Ϣ");
				break;
			}
		}
	}
}
