package whh;
/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:45:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public  class Mouse implements Zoology {
	private String name;
	private String breed;
	private int leg;
	private float weight;
	
	public Mouse (){
		
	}
	public Mouse(String name,String breed){
		this.name = name;
		this.breed = breed;
		
	}
	void Mouses(String name,String breed){
		System.out.println("�������������ǣ�"+name+"\n"+"Ʒ���ǣ�"+breed);
	}

	@Override
	public void getEat() {
		System.out.println("��");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getcall() {
		System.out.println("������");
		// TODO Auto-generated method stub
		
	}

	
}
