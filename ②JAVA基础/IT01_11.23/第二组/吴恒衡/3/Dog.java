package whh;
/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:31:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public  class Dog implements Zoology{
	private String name;
	private int age;
	private String breed;
	private String colour;
	
	public  Dog(){
		
	}
	public  Dog(String name){
		this.name = name;
	}
	void Dogs (String name){
		System.out.println("���������ǣ�"+name);
	}
	@Override
	public void getEat() {
		System.out.println("�Թ�ͷ");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getcall() {
		System.out.println("������");
		// TODO Auto-generated method stub
		
	}

}
