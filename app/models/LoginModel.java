package models;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import play.db.ebean.Model;

@Entity
@Table(name="notespot.login")

public class LoginModel extends Model{
	@Id
	int id;
	@Column(name="username")
	String username;
	@Column(name="email_id")
	String emailId;
	@Column(name="password")
	String password;
	@Column(name="old_password")
	String oldPassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public int getId() {
		return id;
	}
	public LoginModel(String username,String emailId,String password,String oldPassword)
	{
		this.username=username;
		this.emailId=emailId;
		this.password=password;
		this.oldPassword=oldPassword;
	}
	public LoginModel(String username,String emailId,String password)
	{
		this.username=username;
		this.emailId=emailId;
		this.password=password;
		
	}
	public static Finder<String,LoginModel>find=new Finder<>(String.class,LoginModel.class);
	
}