package demo.ioc.beans;

public class UserService {
	PwdService pwdService;

	public UserService() {
		System.out.println("UserService :: constructor");

	}
	
	//constructor injection
	public UserService(PwdService pwdService) {
		this.pwdService=pwdService;
	}
	

	public void saveUser(String name, String pwd, long phno) {
		String encodePwd = pwdService.encodePwd(pwd);
		System.out.println("Encoded password :" + encodePwd);

		// TODO
		System.out.println("record inserted into DB....");

	}
}
