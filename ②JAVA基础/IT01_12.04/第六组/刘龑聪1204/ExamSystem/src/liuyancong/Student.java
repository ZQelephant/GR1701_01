package liuyancong;

/*Author��������
 E-mail��15539919713@163.com
 */
public class Student {

	private String name;
	private String id;
	private double mathScore;
	private double chineseScore;
	private double englishScore;
	private double totleScore;

	public Student(String name, String id, double mathScore,
			double chineseScore, double englishScore) {
		this.name = name;
		this.id = id;
		this.mathScore = mathScore;
		this.chineseScore = chineseScore;
		this.englishScore = englishScore;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double getMathScore() {
		return mathScore;
	}

	public double getChineseScore() {
		return chineseScore;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public double getTotleScore() {
		totleScore = mathScore + chineseScore + englishScore;
		return totleScore;
	}

	@Override
	public String toString() {
		return "������" + name + ",��ţ�" + id + ",��ѧ��" + mathScore + ",���ģ�"
				+ chineseScore + ",Ӣ�" + englishScore + ",�ܷ֣�" + getTotleScore()
				+ "��";
	}

}
