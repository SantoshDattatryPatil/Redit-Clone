package com.santosh.redit.Redit.Clone.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "Username is required")
       private String username;
     @NotBlank(message = "Password is required")
    private String password;
    @Email
   @NotBlank(message = "Email is required")
    private String email;
    private Instant created;
    private boolean enabled;
}
