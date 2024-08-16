package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Sum {
@Id
@Setter(AccessLevel.NONE)
@GeneratedValue(strategy = GenerationType.UUID)
private UUID id;
private int sum;
private LocalDate dateOfInsertion;
}
