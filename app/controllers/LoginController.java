package controllers;
import models.*;
import play.http.HandlerForRequest;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import akka.stream.impl.fusing.Map;
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
			session("username", username);
			session("password", password);
			
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
	
	public Result check(String user){
		
		String username=session("username");
		String password=session("password");
		if(user.equals(username) && password!=null) {
			
			return redirect("/notespot");
		}else
		{
			return badRequest("Not A Valid Request");
		}
		
	}
	HandlerForRequest handlerForRequest(Http.RequestHeader request)
	{
		return (HandlerForRequest)request;
	}
	public Result upload()
	{
		JsonNode body=request().body().asJson();
		String filename=body.get("filename").asText();
		String filesize=body.get("filesize").asText();
		String filetype=body.get("filetype").asText();
		String filebase64=body.get("filebase64").asText();
		UploadModel upload1= new UploadModel(filetype,filesize,filename,filebase64);
		Boolean check=helper.upload(upload1);
		if(check==true) {
			return ok("Uploaded");
		}else {
			return badRequest("not uploaded");
		}
	}
	public Result getfiles() {
		 List<UploadModel>list= helper.getfiles();
		
		 ObjectMapper mapper = new ObjectMapper();
		
		 ArrayNode filelist =mapper.createArrayNode();
		
		// JsonNode node;
		
		if(list==null) {
			return badRequest("files not found");
		}else {
			Integer i;
			for(i=0;i<list.size();i++) {
				try {
					
				// files.put("filename",list.get(i).getFilename());
				
				 //files.setAll(files);
				 ObjectNode files = mapper.createObjectNode();
				 files.put("filename",(list.get(i).getFilename()));
				 files.put("filebas64",(list.get(i).getFilebase64()));
				 filelist.add(files);
				// filelist.set(i,files);
				 //filelist.add(files);
				}catch(Exception e)
				{
					return badRequest("error");
				}
			}
			
		
		
	  }
	 return ok(filelist);	
	}
}



