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
	public Result login(){
		JsonNode body=request().body().asJson();
		if(body!=null) {
		String username=body.get("user").asText();
		String password=body.get("password").asText();
		try {
		Boolean check=helper.login(username,password);
		if(check==true)
			{
			return ok("Logged IN");
			}else {
				return  badRequest("UserName Or Password May Be Incorrect Please Try Again!");
			}
		}catch(Exception e) {
			return badRequest("SomeThing! Gone Wrong Please Try Again Later");
		}
		
		}else {
			return badRequest("UserName Or Password Can't Be Empty!!");
		}
	}
}