package osc.greenlive.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.Cultures;
import osc.greenlive.model.Kit;
import osc.greenlive.model.User;
import osc.greenlive.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserServiceImpl user_service ;
	
	public UserController(UserServiceImpl user_service)
	{
		this.user_service = user_service ;
	}
	
	@PostMapping("/save")
	public ResponseEntity<User> userSave(@RequestBody User user) {
		
		User userExist = this.user_service.saveUser(user);
		return new ResponseEntity<User>(userExist,HttpStatus.CREATED);
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Long id)
	{      
		this.user_service.deleteUser(id);
		
		return new ResponseEntity<User>(HttpStatus.OK);
	}
		
	@PostMapping("/set_user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id ,@RequestBody User user)
	{
		User user_change = this.user_service.updateUser(id , user) ;
		return new ResponseEntity<User>(user_change,HttpStatus.CREATED);
	}
	
	@GetMapping("/find_user/{id_user}")
	public ResponseEntity<User> findUser(@PathVariable Long id_user)
	{
		User user_find = this.user_service.findUserByID(id_user);
		return new ResponseEntity<User>(user_find,HttpStatus.CREATED);
	}
	
	@GetMapping("/culture_list/{id_user}")
	public ResponseEntity<List<Cultures>> list_culture(@PathVariable Long id_user)
	{
		List<Cultures> user_change = this.user_service.list_culture(id_user) ;
		return new ResponseEntity<List<Cultures>>(user_change,HttpStatus.CREATED);
	}
	
	@GetMapping("/culture_list/all")
	public ResponseEntity<List<User>> listUser()
	{
		List<User> listUser = this.user_service.listUser();
		return new ResponseEntity<List<User>>(listUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/kit/list/{id_user}")
	public ResponseEntity<List<Kit>> listUserKit(@PathVariable Long id_user)
	{
		System.out.print("id "+id_user+" \n");
		List<Kit> listUserKit = this.user_service.listKit(id_user);
		return new ResponseEntity<List<Kit>>(listUserKit,HttpStatus.CREATED);
	}
}
