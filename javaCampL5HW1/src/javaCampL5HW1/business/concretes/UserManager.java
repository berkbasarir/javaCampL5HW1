package javaCampL5HW1.business.concretes;

import java.util.List;

import javaCampL5HW1.business.abstracts.UserService;
import javaCampL5HW1.core.loggers.Logger;
import javaCampL5HW1.dataAccess.abstracts.UserDao;
import javaCampL5HW1.entites.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private Logger logger;

	public UserManager(UserDao userDao, Logger logger) {
		super();
		this.userDao = userDao;
		this.logger = logger;
	}

	@Override
	public void add(User user) {
		if(		user.getPassword().length() <= 6 && 
				user.getFirstName().length() <= 2 && 
				user.getLastName().length() <= 2 &&
				user.getEmail() == "berk@basarir.com") {
			
			System.out.println("Bilgileri tekrar kontrol ediniz.");
			
		}
		
		userDao.add(user);
		logger.log(user.getFirstName());
		
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
