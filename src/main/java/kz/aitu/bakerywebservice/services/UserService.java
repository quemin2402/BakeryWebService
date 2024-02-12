package kz.aitu.bakerywebservice.services;

import kz.aitu.bakerywebservice.models.User;
import kz.aitu.bakerywebservice.repositories.UserRepositoryInterface;
import kz.aitu.bakerywebservice.services.interfaces.UserServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface {

    private final UserRepositoryInterface repo;
    UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }
    @Override
    public List<User> findAllUsers() {
        return repo.findAll();
    }

    public Optional<User> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return repo.save(user);
    }

    @Override
    public void deleteById(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public User updateById(int id, User user) {
        User updatedUser = this.repo.findById(id).orElseThrow(() -> new RuntimeException("User not found with id " + id));
        updatedUser.setName(user.getName());
        updatedUser.setSurname(user.getSurname());
        updatedUser.setGender(user.isGender());
        updatedUser.setPhoneNumber(user.getPhoneNumber());
        updatedUser.setEmail(user.getEmail());
        return this.repo.save(updatedUser);
    }
}
