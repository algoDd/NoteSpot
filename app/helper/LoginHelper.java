package helper;
import dao.LoginDao;
import models.LoginModel;
import play.api.mvc.Result;
public class LoginHelper{

	public Boolean signup(LoginModel login)
	{
		
		 return LoginDao.signup(login);
	}
//	public Result login()
//	{
//		return LoginDao.login();
//	}
}