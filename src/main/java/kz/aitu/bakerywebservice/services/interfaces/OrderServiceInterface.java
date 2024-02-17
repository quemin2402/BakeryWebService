package kz.aitu.bakerywebservice.services.interfaces;

import kz.aitu.bakerywebservice.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderServiceInterface {
    List<Order> findAllOrders();
    Optional<Order> findById(int id);
    Order saveOrder(Order order);
    void deleteById(int id);
}
