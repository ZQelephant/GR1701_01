package ExamSystem;

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
public interface IScore {

	//¼��
	void addScore(ArrayList<Student> arrayList,Scanner sc);
	
	//����
	void infoScore(ArrayList<Student> arrayList);
	
	//��ѯ
	double getMax(ArrayList<Student> arrayList,String subject);
}
