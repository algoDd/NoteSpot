package dao;
import com.avaje.ebean.Ebean;

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
//	public static Result login() {
//		Result result=null;
//		try {
//			result=LoginModel.find.where("username",username);
//		}catch(Exception e)
//		{
//			
//		}
//	}
}