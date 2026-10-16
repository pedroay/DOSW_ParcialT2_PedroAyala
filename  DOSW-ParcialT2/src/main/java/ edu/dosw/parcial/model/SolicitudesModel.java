package edu.dosw.parcial.model;

public class SolicitudesModel {

    private String id;
    private DisponibilidadesModel disponibilidad;
    private String correoSolicitante;
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