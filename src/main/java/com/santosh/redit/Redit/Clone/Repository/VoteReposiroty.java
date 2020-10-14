package com.santosh.redit.Redit.Clone.Repository;

import com.santosh.redit.Redit.Clone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteReposiroty extends JpaRepository<Vote, Long> {
}
