package dao;
import java.util.List;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.ExpressionList;

import models.LoginModel;
import play.api.mvc.Result;

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
}