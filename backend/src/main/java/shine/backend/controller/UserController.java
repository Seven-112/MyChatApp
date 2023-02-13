package shine.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shine.backend.entity.User;
import shine.backend.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUser();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        User user = userService.findById(id);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public User deleteUser(@PathVariable Integer id) {
        User user = userService.findById(id);
        userService.delete(user);
        return user;
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User userDetail) {
        User user = userService.findById(id);
        user.setUserName(userDetail.getUserName());
        user.setMobileNo(userDetail.getMobileNo());
        user.setEmailId(userDetail.getEmailId());
        user.setCity(userDetail.getCity());
        user.setPassword(userDetail.getPassword());
        userService.save(user);
        return user;
    }
}
