package edu.dosw.parcial.model;

import java.time.LocalDateTime;
import java.util.Timer;

public class DisponibilidadesModel {

    private String id;
    private LocalDateTime fecha;
    private String lugar;
    private ModalidadModel modalidad;
    private boolean active;
    private String correoTutor;
    private String materia;
    private Timer horaInicial;
    private Timer horaFinal;

    public DisponibilidadesModel(String id, LocalDateTime fecha, String lugar, String modalidad, boolean active,
            String correoTutor, String materia, Timer horaInicial, Timer horaFinal) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.modalidad = modalidad;
        this.active = active;
        this.correoTutor = correoTutor;
        this.materia = materia;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
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