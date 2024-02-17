package kz.aitu.bakerywebservice.services;

import kz.aitu.bakerywebservice.models.Order;
import kz.aitu.bakerywebservice.repositories.OrderRepositoryInterface;
import kz.aitu.bakerywebservice.services.interfaces.OrderServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService implements OrderServiceInterface {

    private final OrderRepositoryInterface repo;
    OrderService(OrderRepositoryInterface repo) {
        this.repo = repo;
    }
    @Override
    public List<Order> findAllOrders() {
        return repo.findAll();
    }

    @Override
    public Optional<Order> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public Order saveOrder(Order order) {
        return repo.save(order);
    }

    @Override
    public void deleteById(int id) {
        this.repo.deleteById(id);
    }
}
