package machao;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��17�� ����3:49:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("Tom","��ɫ", 21);

		cat.setColor("��ɫ");
		cat.name = "Tom";
		cat.weight = 21;

		cat.eyescolor = "��ɫ";

		cat.shuxing();
		cat.eat("��");
		cat.run();
		cat.sleep();

		cat.play();
		cat.catchmouse();
	}
}

