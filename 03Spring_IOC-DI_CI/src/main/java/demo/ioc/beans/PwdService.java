package demo.ioc.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {

	public PwdService() {
		System.out.println("PwdService :: constructor");
	}

	public String encodePwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		String encodedPwd = encoder.encodeToString(pwd.getBytes());
		return encodedPwd;
	}
}
