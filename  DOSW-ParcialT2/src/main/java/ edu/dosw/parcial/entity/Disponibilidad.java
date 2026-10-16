package edu.dosw.parcial.entity;

import java.time.LocalDateTime;
import java.util.Timer;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "disponibilidades") 
public class Disponibilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date", nullable = false, updatable = false)
    private LocalDateTime fecha;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String lugar;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String modalidad;

}
