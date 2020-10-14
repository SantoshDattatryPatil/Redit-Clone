package com.santosh.redit.Redit.Clone.Repository;

import com.santosh.redit.Redit.Clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
