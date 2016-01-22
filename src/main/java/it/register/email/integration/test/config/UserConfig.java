package it.register.email.integration.test.config;

import it.register.common.pathfinder.base.BaseConfiguration;

public class UserConfig extends BaseConfiguration {

	public UserConfig(){
		setupProperties("user.properties");
	}
	
	public String getUsername(){
		return getProperty("username");
	}
	
	public String getPassword(){
		return getProperty("password");
	}
}
