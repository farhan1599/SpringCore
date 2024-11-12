package demo.ioc.beans;

public class UserService {
	private IPwdService pwdService;
	private IEmailService emailService;
	private IUserDao userDao;

	public UserService(IPwdService pwdService, IEmailService emailService, IUserDao userDao) {

		this.pwdService = pwdService;
		this.emailService = emailService;
		this.userDao = userDao;
	}

	public void userRegistration() {
		pwdService.generatePassword();
		userDao.saveUser();
		emailService.sendEmail();

		System.out.println("===User registration success===");
	}

}
