package helper;

import java.util.List;
import dao.LoginDao;
import models.LoginModel;
import play.api.mvc.Result;
public class LoginHelper{

	public Boolean signup(LoginModel login)
	{
		
		 return LoginDao.signup(login);
	}
	public Boolean login(String username,String password)
	{
		List<LoginModel> list= LoginDao.login(username);
		if(list==null) {
			return false;
		}else {
			try {
				String pass=list.get(0).getPassword();
				if(pass.equals(password))
				{
					return true;
				}else {
					return false;
				}
			}catch(Exception e)
			{
				return false;
			}
		
	}
		
	}
}