package one;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��9�� ����8:15:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class FOOR {
	public static void main(String[] args) {
	/**	1. ��ӡ��100��1000�����е�"ˮ�ɻ���" ��
		(��ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
				���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5����
				�η���3�����η���)*/
		int bai=0;
		int shi=0;
		int ge=0;
		for(int i=100;i<=1000;i++){
			bai=i / 100;
			shi=i/ 10 % 10;
			ge=i % 10;
			if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){
				System.out.println("ˮ�ɻ�����"+i);
			}
	
			
			
			
			
		}
			
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
