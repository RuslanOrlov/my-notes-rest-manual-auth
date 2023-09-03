package notes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import notes.models.User;

public interface UsersRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
	
}
