package com.santosh.redit.Redit.Clone.Repository;

import com.santosh.redit.Redit.Clone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.invoke.LambdaConversionException;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
