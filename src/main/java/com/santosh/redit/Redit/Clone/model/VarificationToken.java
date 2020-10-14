package com.santosh.redit.Redit.Clone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VarificationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String token;
@OneToOne(fetch=FetchType.LAZY)
    private User user;
    private Instant expiryDate;
}