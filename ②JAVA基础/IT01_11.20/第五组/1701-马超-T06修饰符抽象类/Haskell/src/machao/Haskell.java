package machao;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:45:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Haskell {
    public static void main(String[] args) {
		//��дJAVA����,����˷��ھ���.(ʹ��while�Ż�ʵ��)
    	System.out.println("�˷��ھ���");
		int q = 1;

		do {
			int x = 1;
			do {
				System.out.print(q + "*" + x + "=" + q * x + "\t");
				x++;
			} while (x <= q);
			q++;
			System.out.println();
		} while (q <= 9);
	}


	}

