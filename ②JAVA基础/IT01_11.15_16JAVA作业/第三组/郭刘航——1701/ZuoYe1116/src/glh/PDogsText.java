package glh;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PDogsText {
	public static void main(String[] args) {
		PDogs pdog = new PDogs();
		pdog.eyescolor = "�غ�ɫ";
		pdog.legs = 4;
		pdog.setAge(4);
		pdog.setBreed("��������");
		pdog.setColor("�ư����");
		pdog.setWeight(70);
		pdog.speed = 20;
		
		System.out.println("����һ����Ȯ��");
		pdog.message();
		System.out.println();
		pdog.speed();
		System.out.println();
		pdog.eat();
		System.out.println();
		pdog.work();
	}

}
