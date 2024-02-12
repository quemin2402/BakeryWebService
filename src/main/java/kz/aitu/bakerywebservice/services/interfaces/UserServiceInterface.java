package kz.aitu.bakerywebservice.services.interfaces;

import kz.aitu.bakerywebservice.models.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    List<User> findAllUsers();
    Optional<User> findById(int id);
    User saveUser(User user);
    void deleteById(int id);
    User updateById(int id, User user);
}
