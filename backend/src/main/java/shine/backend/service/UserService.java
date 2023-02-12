package shine.backend.service;

import java.util.List;

import shine.backend.entity.User;

public interface UserService {
    public List<User> getUser();
    public void save(User user);
    public User findById(Integer id);
    public void delete(User user);
}
