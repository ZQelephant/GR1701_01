package com.examination;

import java.util.ArrayList;
import java.util.Scanner;

public interface IScore {

	//¼��
	void addStudent(ArrayList<Student> arrayList, Scanner sc);
	
	//��ʾ���п�����Ϣ
	void infoStudent(ArrayList<Student> arrayList);
	
	//���ֵ
	double max(ArrayList<Student> arrayList,String subject);
}
