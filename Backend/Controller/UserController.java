import java.util.List;

public class UserController {

    private UserRepository repository;

    public UserController() {
        this.repository = new UserRepository();
    }

    public void createUser(Long id, String name, String email) {
        User user = new User(id, name, email);
        repository.save(user);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }
}