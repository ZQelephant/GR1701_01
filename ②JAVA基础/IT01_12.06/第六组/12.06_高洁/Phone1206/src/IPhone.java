import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��12��6�� ����5:51:03
 */
public interface IPhone {

	void info();

	void addPhone(ArrayList<Phone> arrayList, Scanner sc);

	void infoPhone(ArrayList<Phone> arrayList);

	ArrayList<Phone> findsex(ArrayList<Phone> arrayList);

	Phone findname(ArrayList<Phone> arrayList);

	Phone findphoneNumber(ArrayList<Phone> arrayList);

}
