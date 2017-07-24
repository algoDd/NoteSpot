package controllers;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.JsonNode;

import helper.LoginHelper;

public class LoginController extends Controller{
	LoginHelper helper=new LoginHelper();
	public Result signup() {
		JsonNode body=request().body().asJson();
		if(body!=null) {
			String username=body.get("username").asText();
			String password=body.get("password").asText();
			String emailid=body.get("email_id").asText();
			LoginModel login=new LoginModel(username,password,emailid);
			Boolean check=helper.signup(login);
			if(check) {
				return ok("Signed Up succesfully");
			}else
			{
				return badRequest("Enter Valid Credentials****");
			}
		}else {
			return badRequest("Enter Valid Credentials");
		}
		
	}
//	public Result login(){
//		var username=LoginModel.getUsername();
//		helper.login(username);
//	}
}