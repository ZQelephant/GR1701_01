package person;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {
	
	abstract String getContent();
	
	void say(){
		System.out.println(getContent());
	}
}