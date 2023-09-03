package notes.controllers;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import notes.models.RegistrationForm;
//import notes.repositories.UsersRepository;
import notes.rest.client.RestClientUsers;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	//private UsersRepository usersRepository;
	private RestClientUsers restClientUsers;
	private PasswordEncoder encoder;
	
	public RegistrationController(/*UsersRepository usersRepository,*/ RestClientUsers restClientUsers, PasswordEncoder encoder) {
		//this.usersRepository = usersRepository;
		this.restClientUsers = restClientUsers;
		this.encoder = encoder;
	}
	
	@GetMapping
	public String openRegisterForm() {
		return "registration";
	}
	
	@PostMapping
	public String postUser(@Valid RegistrationForm form, BindingResult errors, Model model) {
		if (errors.hasErrors() || !form.isCorrectPassword()) {
			if (errors.hasErrors())
				model.addAttribute("errorName", true);
			if (!form.isCorrectPassword())
				model.addAttribute("errorPass", true);
			return "registration";
		}
		
		this.restClientUsers.postUser(form.toUser(encoder));
		//this.usersRepository.save(form.toUser(encoder));
		
		return "redirect:/login";
	}
}
