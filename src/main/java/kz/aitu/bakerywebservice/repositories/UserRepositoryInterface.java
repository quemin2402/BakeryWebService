package kz.aitu.bakerywebservice.repositories;

import kz.aitu.bakerywebservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepositoryInterface extends JpaRepository<User, Integer> {

}
