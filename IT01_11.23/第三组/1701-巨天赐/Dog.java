package jtc;
/** 
 * @author  ������
 * @���� E-mail��1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:57:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements Animals{

	private String name;
	private String breed;
	private String color;
	private int age;
	
	public Dog(){
		super();
	}
	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name:" + name + ", age:" + age + ", color:" + color
				+ ", breed:" + breed + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String shout() {
		// TODO Auto-generated method stub
		System.out.println("�� �� ��������");
		return null;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		System.out.println("�ҴӲ���ʳ������");
		return null;
	}

}
