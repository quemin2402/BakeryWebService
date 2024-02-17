package kz.aitu.bakerywebservice.repositories;

import kz.aitu.bakerywebservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryInterface extends JpaRepository<Order, Integer> {

}
