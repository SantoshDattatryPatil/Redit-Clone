package com.santosh.redit.Redit.Clone.Repository;

import com.santosh.redit.Redit.Clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
Optional<User>findByUsername(String username);
}
