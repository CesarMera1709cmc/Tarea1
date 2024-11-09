package com.mycompany.tarea01ds.pronostico;

import com.mycompany.tarea01ds.eventodeportivo.EventoDeportivo;

public class Pronostico {
    private String email;
    private EventoDeportivo evento;
    private boolean estado;
    private int pronosticoId;

    public boolean getEstado(){
        return estado;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public EventoDeportivo getEvento() {
        return evento;
    }
    public void setEvento(EventoDeportivo evento) {
        this.evento = evento;
    }

    public void realizarPronostico(){
        //pide al usuario que ingrese su pronostico
    }
    public void actualizarEstado(boolean nuevoEstado){
        this.estado=nuevoEstado;
    }

}
