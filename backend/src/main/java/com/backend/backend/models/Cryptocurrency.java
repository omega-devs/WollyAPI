package com.backend.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cryptocurrency {
    @Id
    @GeneratedValue(strategy = AUTO)
    private UUID id;
    private String name;
    private String abbreviation;
    private String icon;
    private Double valueOfOne;
    @ManyToOne
    User users;
}
