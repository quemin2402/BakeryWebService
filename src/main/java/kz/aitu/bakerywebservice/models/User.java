package kz.aitu.bakerywebservice.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 2, max = 30)
    @Pattern(regexp = "^[a-zA-Z ]*$")
    private String name;
    @NotNull
    @Positive
    @Digits(integer = 3, fraction = 0)
    private int age;
    @NotNull
    private Gender gender;
    @NotNull
    @Pattern(regexp = "^(\\+7|8)7\\d{9}$")
    private String phoneNumber;
    @NotNull
    @Email
    private String email;
    public enum Gender {
        M, F
    }
}
