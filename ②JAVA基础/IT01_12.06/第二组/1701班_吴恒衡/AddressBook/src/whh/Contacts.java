package whh;
/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��6�� ����8:21:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Contacts {
	private String name;
	private String gender;
	private String telNum;
	
	public Contacts() {
		super();
	}

	public Contacts(String name, String gender, String telNum) {
		super();
		this.name = name;
		this.gender = gender;
		this.telNum = telNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", gender=" + gender + ", telNum="
				+ telNum + "]";
	}
	
}
