package kz.aitu.bakerywebservice.controllers;

import kz.aitu.bakerywebservice.models.User;
import kz.aitu.bakerywebservice.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(int id) {
        User user = userService.findById(id)
                .orElseThrow(() -> new RuntimeException("user not found with id " + id));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public User createUser(User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(int id, User user) {
        User updatedUser = userService.updateById(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(int id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
