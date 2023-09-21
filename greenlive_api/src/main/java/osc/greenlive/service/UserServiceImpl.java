package osc.greenlive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.Cultures;
import osc.greenlive.model.User;
import osc.greenlive.repository.UserServiceRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	private UserServiceRepository userRepo ;
	
	public UserServiceImpl(UserServiceRepository userRepo) {
		this.userRepo = userRepo ;
	}

	@Override
	public User saveUser(User user) {
		return this.userRepo.save(user);
	}

	@Override
	public void deleteUser(Long id_user) {
		this.userRepo.deleteById(id_user);
	}

	@Override
	public User updateUser(Long id_user, User user) {
		
		User get_user = this.userRepo.findById(id_user).orElse(null);
		
		get_user = user ;
		return get_user;
	}

	@Override
	public User findUserByID(Long id_user) {
		// TODO Auto-generated method stub
		
		return this.userRepo.findById(id_user).orElse(null);
	}

	@Override
	public List<Cultures> list_culture(Long id_user) {
		// TODO Auto-generated method stub
		User get_user = this.userRepo.findById(id_user).orElse(null) ;
		
		return get_user.getUser_culture();
	}

}
