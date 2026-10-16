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
    private String id;

    @NotBlank
    @Column(nullable = false, updatable = false)
    private LocalDateTime fecha;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String lugar;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(nullable = false)
    private ModalidadModel modalidad;

    @NotBlank
    @Column(nullable = false)
    private Boolean estado = true;

    @NotBlank
    @Email
    @Column(nullable = false, length = 150)
    private String correoTutor;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String materia;

    @NotBlank
    @Column(name = "hora_Inicial", nullable = false, updatable = false)
    private Timer horaInicial;

    @NotBlank
    @Column(name = "hora_Final", nullable = false, updatable = false)
    private Timer horaFinal;

    public DisponibilidadesModel(String id, LocalDateTime fecha, String lugar, String modalidad, boolean active,
            String correoTutor, String materia, Timer horaInicial, Timer horaFinal) {
        this.id = id;
        this.fecha = fecha;
        Lugar = lugar;
        Modalidad = modalidad;
        this.active = active;
        this.correoTutor = correoTutor;
        Materia = materia;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    @PrePersist
    void onCreate() {
        this.fecha = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLugar() {
        return Lugar;
    }
    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getModalidad() {
        return Modalidad;
    }
    public void setModalidad(String modalidad) {
        Modalidad = modalidad;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCorreoTutor() {
        return correoTutor;
    }
    public void setCorreoTutor(String correoTutor) {
        this.correoTutor = correoTutor;
    }

    public String getMateria() {
        return Materia;
    }
    public void setMateria(String materia) {
        Materia = materia;
    }
    public Timer getHoraInicial() {
        return horaInicial;
    }
    public void setHoraInicial(Timer horaInicial) {
        this.horaInicial = horaInicial;
    }
    public Timer getHoraFinal() {
        return horaFinal;
    }
    public void setHoraFinal(Timer horaFinal) {
        this.horaFinal = horaFinal;
    }

}
