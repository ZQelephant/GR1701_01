package two;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����8:29:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Work {
	public static void main(String[] args) {
		//��дJava��������˷��ھ�����ʹ��whileѭ��ʵ�֣�
		  int i=1;
		  while (i<=9){
			  int j=1;
			  
				  while(j<=i){
					  System.out.print(i+"*"+j+"="+i*j+"\t");
				  j++;
			  }
				  System.out.println();
				  i++;
		  }
	}
}
