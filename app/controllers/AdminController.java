package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import helper.AdminHelper;
import models.AdminModel;
import models.LoginModel;
import play.api.mvc.Result;
import play.mvc.Controller;

public class AdminController extends Controller{
	AdminHelper helper=new AdminHelper();
	public play.mvc.Result addAdmin()
	{ JsonNode body=request().body().asJson();
	if(body!=null) {
		String aname=body.get("adminname").asText();
		String aemail=body.get("adminemail").asText();
		AdminModel amodel=new AdminModel(aname,aemail);
		boolean check=helper.addAdmin(amodel);
	   if(check==true)
	   {
		   return ok("Signed Up succesfully");
	   }
	   else
	   {
		   return badRequest("Enter Valid Credentials");
	   }

		
	}
	else
	{
		return badRequest("Enter Valid Credentials");
	}

}
}