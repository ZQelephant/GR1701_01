package machao;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:36:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class BookTest {
public static void main(String[] args) {
		
		Book OliverTwist=new Book();
		OliverTwist.setName("���¶�");
		OliverTwist.setType("��ƪдʵС˵");
		OliverTwist.setPrice(59);
		OliverTwist.setPages(231);
		
		OliverTwist.getinfo();
		
		int NO=Book.NO();
		System.out.println(NO);
	}
}

