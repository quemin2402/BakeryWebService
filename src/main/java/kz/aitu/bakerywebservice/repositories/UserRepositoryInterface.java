package kz.aitu.bakerywebservice.repositories;

import kz.aitu.bakerywebservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
}
