package four;

public class ZUOYE {
	public static void main(String[] args) {
		//��дJAVA����1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣��������������
	/**	int c=0;
		for(int a=1;a<=10;a++){
			c +=a;
		}if(c>20){
			System.out.println(a);
			}*/
	
		int count = 0;
		for(int i=1;i<=10;i++){
		    count  = count +i;
		    if(count>20){
		       System.out.println(i);
		       break;
		}
	}
	}

}