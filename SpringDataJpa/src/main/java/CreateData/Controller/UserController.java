package CreateData.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CreateData.Entity.User;
import CreateData.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
private UserService userService;
public UserController(UserService userService) {
	this.userService=userService;
}
@GetMapping("/all")
public List<User> getAlluser(){
	return userService.getAllUsers();
}
@GetMapping("/all/{id}")
public Optional<User> getUserById(@PathVariable int id) {
	return this.userService.getAllUsersById(id);
}
@PostMapping("/add")
public User addUser(@RequestBody User user) {
	return this.userService.addUser(user);
}
@DeleteMapping("/delete/{id}")
public void deleteUser(@PathVariable int id) {
	userService.delete(id);
}
@PutMapping("/update/{id}")
public User updateUser(@PathVariable int id,@RequestBody User user) {
	return userService.update(id, user);
}

}
