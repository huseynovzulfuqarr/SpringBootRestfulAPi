package CreateData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CreateData.Entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	
}
