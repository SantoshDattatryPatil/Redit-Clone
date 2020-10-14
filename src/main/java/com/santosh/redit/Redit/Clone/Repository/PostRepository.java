package com.santosh.redit.Redit.Clone.Repository;

import com.santosh.redit.Redit.Clone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
