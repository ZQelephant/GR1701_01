/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��22�� ����8:20:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package changwang;

public abstract class Person {
	String Content;
	
	abstract String getContent();
	
	void say(String getContent){
		System.out.println(getContent());
	}

}
