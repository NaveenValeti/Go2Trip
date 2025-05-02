package org.valetirides.entity;

import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@Entity  //it marks class as a JPA entity, meaning it's mapped to a table in a relational database. Tells JPA, This class represents a table in the database.
@Table(name="users")
@AllArgsConstructor
@Builder  //implements a builder pattern in a clean, boilerplate-free way, it generates a builder class behind the scenes so you can construct objects in a readable and chainable manner.
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // it generates values for the primary key field of an entity
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String role;   //DRIVER or PASSENGER

}
