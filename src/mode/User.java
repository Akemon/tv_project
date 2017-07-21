package mode;

public class User {
	private int userID;
	private String userName;
	private String passWord;
	private String phoneStatus;
	private String tvStatus;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPhoneStatus() {
		return phoneStatus;
	}
	public void setPhoneStatus(String phoneStatus) {
		this.phoneStatus = phoneStatus;
	}
	public String getTvStatus() {
		return tvStatus;
	}
	public void setTvStatus(String tvStatus) {
		this.tvStatus = tvStatus;
	}
}
