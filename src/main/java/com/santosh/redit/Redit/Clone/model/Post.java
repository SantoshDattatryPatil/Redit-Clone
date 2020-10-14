package com.santosh.redit.Redit.Clone.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Entity
@Builder
@Data
 @AllArgsConstructor
@NoArgsConstructor
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
@NotBlank(message = "Post name cant be empty or null")
private String postName;
@Nullable
private String url;
@Nullable
@Lob
private String description;
private Integer voteCount;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="userId", referencedColumnName = "userId")
private User user;
private Instant createDate;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="id",referencedColumnName = "id")
private Subreddit subreddit;

}
