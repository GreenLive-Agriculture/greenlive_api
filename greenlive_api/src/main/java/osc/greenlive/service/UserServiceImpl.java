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
	private CultureServiceImpl cultureService;
	
	public UserServiceImpl(UserServiceRepository userRepo, CultureServiceImpl cultureService) {
		this.userRepo = userRepo ;
		this.cultureService = cultureService ;
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
	
	@SuppressWarnings({ "null" })
	@Override
	public List<Kit> listKit(Long id_user)
	{
		List<Kit> KitList = null ;
		@SuppressWarnings("unused")
		CultureServiceImpl cultureService ;
		
		User user_fetch = this.userRepo.findById(id_user).orElse(null);
		
		int i = 0;
		
		Long idCulture = user_fetch.getUser_culture().get(i).getId_culture() ;
		
		do
		{
			KitList.addAll(this.cultureService.listKitCultures(idCulture));
			i++;
		}
		while (i <= user_fetch.getUser_culture().size() -1) ;	
		
		return KitList;
	}
}
