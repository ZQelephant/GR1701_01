package glh;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��22�� ����8:30:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ZuoYe_10 {
     public static void main(String[] args) {
    	 int a = 1;
 		while(a <= 9){
 			int b=1;
 			while(b <= a){
 				System.out.print(b+"*"+a+"="+a*b+"\t");
 				b++;
 }
 			System.out.println();
 			a++;
	}
              System.out.println();
     for(int i=1;i<=9;i++){
    	 for(int j=1;j<=i;j++){
    		 System.out.print(j+"*"+i+"="+i*j+"\t");
    	 }
    	 System.out.println();
     }
}
}