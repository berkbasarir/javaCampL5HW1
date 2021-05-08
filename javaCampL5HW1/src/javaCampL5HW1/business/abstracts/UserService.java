package javaCampL5HW1.business.abstracts;

import java.util.List;

import javaCampL5HW1.entites.concretes.User;

public interface UserService {
	
	void add(User user);
	List<User> getAll();

}
