package zhangtongtong;

public class Ball {

	//һ���һ���׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ��
	//�����£������ڵ�10�����ʱ�������������ף���n�η�����ߣ�
	public static void main(String[] args) {
		double h = 100;
		double h1 = h/2;
		int i = 0;
		for(i = 2;i<10;i++){
			h = h + h1*2;
			h1 = h1/2;
		}
		System.out.println("��"+i+"����ؾ���"+h+"��");
		System.out.println("��"+i+"�η���"+h1+"��");
	}
	
}
