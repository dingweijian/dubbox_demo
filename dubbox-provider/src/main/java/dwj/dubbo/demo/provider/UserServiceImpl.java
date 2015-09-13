package dwj.dubbo.demo.provider;

import dwj.dubbo.demo.api.User;
import dwj.dubbo.demo.api.UserService;

public class UserServiceImpl implements UserService{

	
	public User getUser(Long id) {
		
		return new User(id, "username" + id);
	}

}
