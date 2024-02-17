package kz.aitu.bakerywebservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pastry")
public class Pastry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Long price;
    @ManyToMany
    @JoinTable(name = "pastry_orders", joinColumns = @JoinColumn(name = "pastry_id"), inverseJoinColumns = @JoinColumn(name = "orders_id"))
    @JsonIgnore
    private Set<Order> orders;
}
