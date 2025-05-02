package org.valetirides.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.valetirides.entity.User;

import javax.swing.text.html.Option;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

//    This method might return a User, or it might return nothing (empty).
//    ?If a User is found → returns Optional.of(user)
//    If not found → returns Optional.empty()

}
