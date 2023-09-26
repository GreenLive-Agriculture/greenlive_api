package osc.greenlive.service;

import java.util.List;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.Cultures;
import osc.greenlive.model.Kit;
import osc.greenlive.model.User;
import osc.greenlive.repository.KitServiceRepository;
import osc.greenlive.repository.UserServiceRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	private UserServiceRepository userRepo;
	private KitServiceRepository kitRepo;
	
	public UserServiceImpl(UserServiceRepository userRepo, KitServiceRepository KitRepo) {
		this.userRepo = userRepo ;
		this.kitRepo = KitRepo ;
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
		
		this.userRepo.deleteById(id_user);
		this.userRepo.save(user);
		return user;
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
	
	@Override
	public List <User> listUser() {
		// TODO Auto-generated method stub
		return this.userRepo.findAll();
	}
	
	@Override
	public List<Kit> listKit(Long id_user)
	{
		return this.kitRepo.findKitByUserId(id_user);
	}
}
