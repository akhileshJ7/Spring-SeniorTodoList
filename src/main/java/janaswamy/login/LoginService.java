package janaswamy.login;
public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("janaswamy") && password.equals("b33r"))
			return true;

		return false;
	}

}