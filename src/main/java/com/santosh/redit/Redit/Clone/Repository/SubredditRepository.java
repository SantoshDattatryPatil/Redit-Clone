package com.santosh.redit.Redit.Clone.Repository;

import com.santosh.redit.Redit.Clone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
