package com.exam;

import java.util.ArrayList;
import java.util.Scanner;

public interface IScore {
	// ¼�룬����
	// ����ֵ ������ �������б���
	// ����ض����ܵĴ����
	void addStudent(ArrayList<Student> arraylist, Scanner sc);

	// ��ʾ���п�����Ϣ
	// ����ֵ ������ �������б���
	// ����ض����ܵĴ����
	void infoStudent(ArrayList<Student> arraylist);

	// �������ֵ
	// ����ֵ ������ �������б���
	// ����ض����ܵĴ����
	double getMax(ArrayList<Student> arraylist,String subject);

}
