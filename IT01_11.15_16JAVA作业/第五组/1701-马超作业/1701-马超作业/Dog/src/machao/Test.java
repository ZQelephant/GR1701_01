package machao;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��17�� ����3:43:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
public static void main(String[] args) {
		
		PoliceDogs policdog = new PoliceDogs();
		
		policdog.setVarieties("������Ȯ");
		policdog.setHaircolor("��");
		policdog.setAge(9);
		policdog.setWeight(51.0);
		policdog.eyescolor="��ͭ";
		policdog.legs=4;
		policdog.maxspeed=12;
		
		policdog.dog();
		policdog.maxspeed();
		policdog.eating("����ô��ʳ��");
		policdog.working("ƾ�����Ѱ�ҷ��˺�Υ��Ʒ��");
	}
}

}
