package osc.greenlive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(Long id_user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(Long id_user, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
