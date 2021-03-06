package javaCampL5HW1.dataAccess.abstracts;

import java.util.List;

import javaCampL5HW1.entites.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	
	User get(int id);
	List<User> getAll();

}
