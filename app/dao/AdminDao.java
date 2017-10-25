package dao;

import com.avaje.ebean.Ebean;

import models.AdminModel;

public class AdminDao {
   public static boolean addAdmin(AdminModel m)
   { try {
		Ebean.save(m);
	}catch(Exception e)
	{
		return false;
	}
	return true;
}
}
