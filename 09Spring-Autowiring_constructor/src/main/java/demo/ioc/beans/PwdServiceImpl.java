package demo.ioc.beans;

public class PwdServiceImpl implements IPwdService {

	@Override
	public String generatePassword() {
     System.out.println("Password generated...");
		return "abc@123";
	}

}
