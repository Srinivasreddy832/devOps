package tsl949devOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class test {
	public boolean userDetails(String username, String password) {
		Properties pp= new Properties();
		try {
			pp.load(new FileInputStream("target/login.property"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String userName=pp.getProperty("user");
		String pwd=pp.getProperty("password");
		if(username.equals(userName) && password.equals(pwd))
			return true;
		else
			return false;
					
		
	}

}
