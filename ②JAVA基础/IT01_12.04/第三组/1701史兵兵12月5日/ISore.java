package xcs;

import java.util.ArrayList;
import java.util.Scanner;

public interface ISore {
	//�ӿ�
	//¼�룬����
	//����ֵ���������������б���
	//����ض����ܵĴ����
	void Student(ArrayList<Student>arrayList,Scanner sc);
	//¼�룬����
		//����ֵ���������������б���
		//����ض����ܵĴ����
	void info(ArrayList<Student>arrayList);
	double Max(ArrayList<Student>arrayList,String subject);
	

}
