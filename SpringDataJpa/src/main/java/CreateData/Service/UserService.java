package CreateData.Service;

import java.util.List;
import java.util.Optional;

import CreateData.Entity.User;

public interface UserService {
List<User> getAllUsers();
Optional<User> getAllUsersById(int id);
User addUser(User user);
void delete(int id);
User update(int id,User user);

}
