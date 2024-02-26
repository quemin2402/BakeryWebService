package kz.aitu.bakerywebservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @NotNull
    @Size(min = 2)
    @Pattern(regexp = "^[a-zA-Z ]*$")
    private String name;
    @NotNull
    private Category category;
    @NotNull
    @Size(min = 5)
    @Pattern(regexp = "^[a-zA-Z ]*$")
    private String description;
    @NotNull
    @Positive
    private Long price;
    @ManyToMany
    @JoinTable(name = "pastry_orders", joinColumns = @JoinColumn(name = "pastry_id"), inverseJoinColumns = @JoinColumn(name = "orders_id"))
    @JsonIgnore
    private Set<Order> orders;
    public enum Category {
        BakeryProducts, SweetPastry,
        PuffPastry, SourdoughPastry,
        SaltyPastry, SeasonalPastry,
        DietaryPastry, NationalPastry
    }
}
