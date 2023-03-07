package CreateData.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import CreateData.Entity.User;
import CreateData.Repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
private UserRepository userRepository;
public UserServiceImpl(UserRepository userRepository) {
	this.userRepository=userRepository;
}
	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getAllUsersById(int id) {
		return userRepository.findById(id);
	
	}

	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User update(int id, User user) {
	Optional<User> updatedUser=	userRepository.findById(id);
	if(updatedUser.isPresent()) {
		User user1=updatedUser.get();
		user1.setName(user.getName());
		user1.setSurname(user.getSurname());
		user1.setGmail(user.getGmail());
		return userRepository.save(user1);
		
	}
		return  null;
	}

}
