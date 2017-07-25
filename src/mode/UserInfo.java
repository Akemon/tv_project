package mode;

public class UserInfo {
	private int id;
	private String nickName;
	private String sex;
	private String age;
	private String phone;
	private String mail;
	private String address;
	private int userID;
	
	public UserInfo(int id, String nickName, String sex, String age, String phone, String mail, String address,
			int userID) {
	
		this.id = id;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.mail = mail;
		this.address = address;
		this.userID = userID;
	}
	public UserInfo(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}

	
}
