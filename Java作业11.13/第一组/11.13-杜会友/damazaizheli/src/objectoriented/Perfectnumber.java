package objectoriented;

public class Perfectnumber {
 /* һ�������ǡ�õ�����������֮�ͣ�
    ������ͳ�Ϊ "���� "������6=1��2��3.
	����ҳ�1000���ڵ�����������
*/
	public static void main(String[] args) {
		for (int in = 2; in < 1000; in++) {
		int tem = 0;
		for (int wan = 1; wan < in; wan++) {
			if (in % wan == 0) {

				tem += wan;

			}

		}if(tem==in){System.out.println(in);}

	}

}

}

