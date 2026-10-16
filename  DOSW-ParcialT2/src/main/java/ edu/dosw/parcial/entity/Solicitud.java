package edu.dosw.parcial.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "solicitudes") 
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank
    @Column(nullable = false)
    private DisponibilidadesModel disponibilidad;

    @NotBlank
    @Email
    @Column(nullable = false, length = 150)
    private String correoSolicitante;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(nullable = false)
    private EstadoSolicitud estado;

    public SolicitudesModel(String id, DisponibilidadesModel disponibilidad, String correoSolicitante,
            EstadoSolicitud estado) {
        this.id = id;
        this.disponibilidad = disponibilidad;
        this.correoSolicitante = correoSolicitante;
        this.estado = estado;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public DisponibilidadesModel getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(DisponibilidadesModel disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getCorreoSolicitante() {
        return correoSolicitante;
    }
    public void setCorreoSolicitante(String correoSolicitante) {
        this.correoSolicitante = correoSolicitante;
    }
    public EstadoSolicitud getEstado() {
        return estado;
    }
    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }
    
}
