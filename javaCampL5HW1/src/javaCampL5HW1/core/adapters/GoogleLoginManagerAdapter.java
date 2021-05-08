package javaCampL5HW1.core.adapters;

import javaCampL5HW1.googleLogin.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements LoginService {

	@Override
	public boolean login(String email) {
		GoogleLoginManager loginManager = new GoogleLoginManager();
		
		if (loginManager.login(email)) {
			return true;
		}
				
		return false;
	}

}
