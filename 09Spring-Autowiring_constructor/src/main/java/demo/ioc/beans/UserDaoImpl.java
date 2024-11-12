package demo.ioc.beans;

public class UserDaoImpl implements IUserDao {

	@Override
	public void saveUser() {
System.out.println("Record inserted into DB...");
	}

}
