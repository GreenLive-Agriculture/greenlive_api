package osc.greenlive.service;

import java.util.List;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.Cultures;
import osc.greenlive.model.Kit;
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
	
	@SuppressWarnings("null")
	@Override
	public List<Kit> listKit (Long id_user)
	{
		User getuser = this.userRepo.findById(id_user).orElse(null);
		
		System.out.print(getuser.getEmail());
		
		List<Cultures> getCulture = getuser.getUser_culture();
		
		List<Kit> listKit = null ;
		
		CultureServiceImpl cultureimpl = null ;
		
		int i = getCulture.size()-1 ;
		
		while(i != 0)
		{
			listKit.addAll(cultureimpl.listKitCultures(getCulture.get(i).getId_culture()));
			i -- ;
		}
		
		return listKit;
	}

	@Override
	public List <User> listUser() {
		// TODO Auto-generated method stub
		return this.userRepo.findAll();
	}

}
