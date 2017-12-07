package AddressBook;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Contacts {

	private String name;
	private String sex;
	private String telnum;
	
	
	/**
	 * 
	 */
	public Contacts() {
		super();
	}


	/**
	 * @param name
	 * @param sex
	 * @param telnum
	 */
	public Contacts(String name, String sex, String telnum) {
		super();
		this.name = name;
		this.sex = sex;
		this.telnum = telnum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getTelnum() {
		return telnum;
	}


	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}


	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telnum=" + telnum
				+ "]";
	}
	
}
