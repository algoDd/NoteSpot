package dao;
import java.util.List;

import com.avaje.ebean.Ebean;

import models.LoginModel;
import models.UploadModel;
import play.mvc.Result;


public class LoginDao{
	public static Boolean signup(LoginModel login){
		
		try {
			Ebean.save(login);
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public static List<LoginModel> login(String username) {
	List<LoginModel> list=null;
		try {
			list=LoginModel.find.where().ieq("username", username).findList();
		}catch(Exception e)
		{
			return list;
		}
		return list;
	}
	public static Boolean upload(UploadModel upload) {
		try {
			Ebean.save(upload);
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public static List<UploadModel> getfiles() {
		List<UploadModel> list=null;
		try {
		 list=UploadModel.find.all();
		 return list;
		}catch(Exception e)
		{
			return list;
		}
	}
	
}