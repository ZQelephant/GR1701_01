package whh;
/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��4�� ����8:28:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Study {
	private String name;
	private String ID;
	private double languageScore;//����
	private double mathematicsScore;//��ѧ
	private double englishScore;//Ӣ��
	private double totalscore;
	public Study() {
		
	}
	public Study(String name, String iD, double languageScore,
			double mathematicsScore, double englishScore, double totalscore) {
		super();
		this.name = name;
		ID = iD;
		this.languageScore = languageScore;
		this.mathematicsScore = mathematicsScore;
		this.englishScore = englishScore;
		this.totalscore = totalscore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getLanguageScore() {
		return languageScore;
	}
	public void setLanguageScore(double languageScore) {
		this.languageScore = languageScore;
	}
	public double getMathematicsScore() {
		return mathematicsScore;
	}
	public void setMathematicsScore(double mathematicsScore) {
		this.mathematicsScore = mathematicsScore;
	}
	public double getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}
	public double getTotalScore() {
		totalscore = languageScore +mathematicsScore + englishScore;
		return totalscore;
	}
	@Override
	public String toString() {
		return "Examination [name=" + name + ", ID=" + ID + ", languageScore="
				+ languageScore + ", mathematicsScore=" + mathematicsScore
				+ ", englishScore=" + englishScore + ", totalscore="
				+ getTotalScore() + "]";
	}
	
	

}
