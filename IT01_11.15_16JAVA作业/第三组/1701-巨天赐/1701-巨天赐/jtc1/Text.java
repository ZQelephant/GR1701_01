package jtc;
/** 
 * @author  ����:jtc
 * @date    ����ʱ�䣺2017��11��16�� ����5:53:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {
	public static void main(String[] args) {
		PDogs pdog = new PDogs();
		pdog.breed = "��������";
		pdog.color = "�ư����";
		pdog.weight = 70;
		pdog.age = 3;
		pdog.eyescolor = "�غ�ɫ";
		pdog.legs = 4;
		pdog.speed = 20;
		
		pdog.message();
		System.out.println();
		pdog.eat();
		System.out.println();
		pdog.work();
}
}