package config;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class SessionConfig{
	public Map<String,String> session(String user,String pass){
		Map<String,String> session=new HashedMap();
		//session.put("session", "map");
		session.put("username", user);
		session.put("password", pass);
		return session;
	}
}