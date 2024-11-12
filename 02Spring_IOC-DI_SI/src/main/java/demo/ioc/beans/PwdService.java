package demo.ioc.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {
	
	public PwdService() {
		System.out.println("PwdService :: constructor");
	}
	public String encodePwd(String pwd) {
		
		//Base64 is a pre-defined java class for encoding..
	  Encoder encoder = Base64.getEncoder();
	  
	  //encodeToString() takes Byte array as parameter & getBytes() converts String into Byte[]
	  String encodedPwd = encoder.encodeToString(pwd.getBytes());
	  return encodedPwd;
	}

}
