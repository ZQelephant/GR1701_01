package liuyancong;

/*���ߣ�������
 ���䣺15539919713@163.com
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