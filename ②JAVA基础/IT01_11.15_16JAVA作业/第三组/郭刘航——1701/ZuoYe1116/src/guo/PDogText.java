package guo;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PDogText {
	public static void main(String[] args) {
		PDog dog = new PDog();
		dog.breed = "��������";
		dog.weight = 70;
		dog.age = 4;
		dog.eyescolor = "�ػ�ɫ";
		dog.legs = 4;
		dog.speed = 20;
		
		System.out.println("����һ����Ȯ��");
		dog.message();
		System.out.println();
		dog.eat();
		System.out.println();
		dog.work();
	}

}
