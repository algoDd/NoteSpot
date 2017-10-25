package helper;

import org.hibernate.id.uuid.Helper;

import models.AdminModel;

public class AdminHelper{
	public boolean addAdmin(AdminModel m)
	{ 
		return dao.AdminDao.addAdmin(m);
	}
	

}
