package io.javabrains;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getAll() {
		return userRepository.findAll();
		
	}
	
	@PostMapping("/load")
	public List<User> persist(@RequestBody final User user)  {
		userRepository.save(user);
		return userRepository.findAll();
	}
	
	
	

}
