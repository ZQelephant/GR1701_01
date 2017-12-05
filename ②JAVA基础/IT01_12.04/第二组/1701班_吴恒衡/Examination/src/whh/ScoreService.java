package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��4�� ����9:01:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreService implements IScore {
	public void info(){
		System.out.println("--�ɼ�����ϵͳ--");
		System.out.println("[1]¼�뿼����Ϣ�����1");
		System.out.println("[2]��ʾ������Ϣ�����2");
		System.out.println("[3]��ѯ��߷������3");
		System.out.println("[4]�˳�");
		
	}
	public void help(){
		System.out.println("---����---");
		System.out.println("[1]��ѯ�ܳɼ������1");
		System.out.println("[2]��ѯ������߷������2");
		System.out.println("[3]��ѯ��ѧ��߷������3");
		System.out.println("[4]��ѯӢ����߷������4");
		System.out.println("[5]�������˵������5");
	}

	@Override
	public void addStudy(ArrayList<Study> arrayList, Scanner sc) {
		 String s = sc.next();
		String []a = s.split(",");
		int length = a.length;
		if (length!=5) {
			System.out.println("���������Ϣ������");
		} else {
			Study study = new Study( );
			study.setName(a[0]);
			study.setID(a[1]);
			study.setLanguageScore(Double.parseDouble(a[2]));
			study.setMathematicsScore(Double.parseDouble(a[3]));
			study.setEnglishScore(Double.parseDouble(a[4]));
			arrayList.add(study);
			this.infoStudy(arrayList);
		}
		
	}

	@Override
	public void infoStudy(ArrayList<Study> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Study study = arrayList.get(i);
			String string = study.toString();
			System.out.println(string);
		}
		
	}

	@Override
	public double maxstudy(ArrayList<Study> arrayList,String subject) {
		
		double max = 0;
		if (subject.equals("�ܳɼ�")) {
			 max = arrayList.get(0).getTotalScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotalScore()>max) {
					max = arrayList.get(i).getTotalScore();
				}
				
			}
		}
		if (subject.equals("����")) {
			 max = arrayList.get(0).getLanguageScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguageScore()>max) {
					max = arrayList.get(i).getLanguageScore();
				}
				
			}
		}
		if (subject.equals("��ѧ")) {
			 max = arrayList.get(0).getMathematicsScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematicsScore()>max) {
					max = arrayList.get(i).getMathematicsScore();
				}
				
			}
		}
		if (subject.equals("Ӣ��")) {
			 max = arrayList.get(0).getEnglishScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishScore()>max) {
					max = arrayList.get(i).getEnglishScore();
				}
				
			}
		}
		
		return max;
	}

}