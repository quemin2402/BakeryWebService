package kz.aitu.bakerywebservice.repositories;

import kz.aitu.bakerywebservice.models.Pastry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PastryRepositoryInterface extends JpaRepository<Pastry, Integer> {

}
