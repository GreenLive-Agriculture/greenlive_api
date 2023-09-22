package osc.greenlive.service;

import java.util.List;

import osc.greenlive.model.Cultures;
import osc.greenlive.model.User;

public interface UserService {
	public User saveUser(User user);
	public List <User> listUser();
	public User findUserByID(Long id_user);
	public void deleteUser(Long id_user);
	public User updateUser(Long id_user , User user);
	public List<Cultures> list_culture(Long id_user);
}
