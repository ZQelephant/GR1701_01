package machao;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:46:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Zhengshu {
    public static void main(String[] args) {
    //������1~100���ۼ�ֵ����Ҫ��������λΪ3����
    	for (int i = 2; i < 1000; i++) {

			int tem = 0;

			for (int x = 1; x < i; x++) {

				if (i % x == 0) {

					tem += x;
				}
			}

			if (tem == i) {

				System.out.println(i);
	}
}
}
}   
    