package com.santosh.redit.Redit.Clone.Repository;

import com.santosh.redit.Redit.Clone.model.VarificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VarificationToken, Long> {
}