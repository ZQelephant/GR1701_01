package animal;

public class Dogs extends Animal{

	private String varieties;
	private String haircolor;
	private int age;
	private double weight;

	String getVarieties() {
		return varieties;
	}

	void setVarieties(String varieties) {
		if (varieties.length() > 7) {
			System.out.println("�������Ĺ���");
		} else {
			this.varieties = varieties;
		}
	}

	String getHaircolor() {
		return haircolor;
	}

	void setHaircolor(String haircolor) {
		if (haircolor.length() > 5) {
			System.out.println("��ֻ������");
		} else {
			this.haircolor = haircolor;
		}
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		if (age < 0 || age > 17) {
			System.out.println("����Ȯ��");
		} else {
			this.age = age;
		}
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		if (weight < 0 || weight > 130) {
			System.out.println("����һֻ����");
		}else{
			this.weight = weight;
		}
	}

	void barking(String barking) {
		System.out.println(barking);
	}

	void eating(String eating) {
		System.out.println(eating);
	}

	void sleeping(String sleeping) {
		System.out.println(sleeping);
	}

	void dog() {
		System.out.print("Ʒ�֣�\t\t" + varieties 
					   + "\nëɫ��\t\t" + haircolor+ "ɫ" 
					   + "\n���䣺\t\t" + age + "��" 
					   + "\n����:\t\t" + weight + "kg"
					   + "\n�۾���ɫ��\t" + eyescolor + "ɫ"
					   + "\n�ȵ�������\t" + legs + "��");
	}
}