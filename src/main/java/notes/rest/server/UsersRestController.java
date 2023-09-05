package notes.rest.server;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import notes.models.User;
import notes.repositories.UsersRepository;

@RestController
@RequestMapping(path = "/api/users", produces = "application/json")
public class UsersRestController {
	
	private UsersRepository usersRepository;

	public UsersRestController(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(value = HttpStatus.CREATED)
	public User postUser(@RequestBody User user) {
		return this.usersRepository.save(user);
	}
	
	@GetMapping(params = "username")
	public User getUserByUsername(@RequestParam String username) {
		return this.usersRepository.findByUsername(username);
	}
	
}
