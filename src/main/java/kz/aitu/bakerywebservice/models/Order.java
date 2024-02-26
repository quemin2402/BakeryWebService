package kz.aitu.bakerywebservice.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z\\d ]*$")
    private String street;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]*$")
    private String city;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z ]*$")
    private String state;
    @NotNull
    @Pattern(regexp = "\\d{6}", message = "postal code must be a 6-digit number")
    private String postalCode;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z ]*$")
    private String country;
    @NotNull
    @Positive
    private Long total;
    @ManyToMany(mappedBy = "orders")
    private Set<Pastry> pastry;

}
