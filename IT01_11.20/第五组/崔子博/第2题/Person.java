package person;
/*���ߣ�������
 *E-mail��15539919713@163.com
 */
public abstract class Person {
	
	abstract String getContent();
	
	void say(){
		System.out.println(getContent());
	}
}