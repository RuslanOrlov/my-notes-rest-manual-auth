package notes.props;

import java.util.Base64;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import lombok.Data;
import notes.models.User;

@Component
@Data
public class PropsForCurUser {
	
	public User getCurrentUser() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return (User) authentication.getPrincipal();
	}
	
	public String getAuthStringEncoded() {
		// Получаем имя текущего пользователя и его пароль
		String username = this.getCurrentUser().getUsername();
		String password = this.getCurrentUser().getOpenpass();
		
		// Формируем строку логин:пароль
		String authString = username + ":" + password;
		
		// Кодируем в Base64
		byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
		String authStringEnc = new String(authEncBytes);
				
		return authStringEnc;
	}
	
	public String getAuthorizationHeader() {
		return "Basic " + this.getAuthStringEncoded();
	}
	
}