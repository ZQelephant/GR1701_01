package shangpin;

import java.util.ArrayList;
import java.util.Scanner;

public interface IShangPin {
	void helpInfo();
	//����
	void addShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	//����
	void stockShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	//����
	void sellShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	//��ѯ
	void infoShangPin(ArrayList<ShangPin> arrayList,Scanner sc);
	

}
