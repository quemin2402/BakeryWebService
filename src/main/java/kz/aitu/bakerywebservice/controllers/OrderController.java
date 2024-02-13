package kz.aitu.bakerywebservice.controllers;

import kz.aitu.bakerywebservice.models.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/")
    public List<Order> getAll() {
        return null;
    }
}
