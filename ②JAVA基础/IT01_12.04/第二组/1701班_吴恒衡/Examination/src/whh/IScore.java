package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��4�� ����8:53:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IScore {
	//����
	void addStudy(ArrayList<Study>arrayList,Scanner sc);
	void infoStudy(ArrayList<Study>arrayList);
	double maxstudy(ArrayList<Study>arrayList,String subject);

}
