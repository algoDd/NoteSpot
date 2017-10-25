package models;

import javax.persistence.*;

import com.avaje.ebean.Model.Finder;

import play.db.ebean.Model;
@Entity
@Table(name="bn1dck4qd.admin")
public class AdminModel extends Model {
  @Id
  int id;
  @Column(name="adminname")
  String adminname;
  @Column(name="adminemail")
  String adminemail;
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public String getAdminemail() {
	return adminemail;
}
public void setAdminemail(String adminemail) {
	this.adminemail = adminemail;
}
public int getId() {
	return id;
}
  public AdminModel(String nm,String email)
  { this.adminname=nm;
    this.adminemail=email;
    	  
  }
  public static Finder<String,LoginModel>find=new Finder<>(String.class,LoginModel.class);

}
