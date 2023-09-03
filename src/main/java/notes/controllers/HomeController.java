package notes.controllers;

//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.client.RestTemplate;

//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login-form";
	}
	
	//@ResponseBody
//	@PostMapping("/login-extract")
//	public void loginExtract(@RequestParam(name = "username") String username, 
//							@RequestParam(name = "password") String password) {
//		log.info("!!!");
//		log.info("!!! username - '" + username + "'");
//		log.info("!!! password - '" + username + "'");
//		log.info("!!!");
//		
//		RestTemplate restTemplate = new RestTemplate();
//		
//		MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
//		requestBody.add("username", username);
//		requestBody.add("password", password);
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType (MediaType.APPLICATION_FORM_URLENCODED);
//		
//		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(requestBody, headers);
//		
//		String loginUrl = "http://localhost:8080/login";
//		
//		ResponseEntity<String> response = 
//				restTemplate.exchange(loginUrl, HttpMethod.POST, request, String.class);
//	}
	
}
