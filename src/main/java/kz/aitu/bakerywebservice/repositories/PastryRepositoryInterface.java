package kz.aitu.bakerywebservice.repositories;

import kz.aitu.bakerywebservice.models.Pastry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PastryRepositoryInterface extends JpaRepository<Pastry, Integer> {

}
