/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kgramirez
 */
public class Citas {

    /**
     * @return the Hora
     */
    public String getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    
    public String Numero;
    public String Fecha;
    public String Hora;
    public String Paciente;
    public String Medico;
    public String Consultorio;
    public String Estado;
    public String Observaciones;
    
    public Citas(String Numero, String Fecha, String Hora, String Paciente, String Medico, String Consultorio, String Estado, String Observaciones) {
    
        this.Numero = Numero;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Paciente = Paciente;
        this.Medico = Medico;
        this.Consultorio = Consultorio;
        this.Estado = Estado;
        this.Observaciones = Observaciones;
    }

    /**
     * @return the Numero
     */
    public String getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Paciente
     */
    public String getPaciente() {
        return Paciente;
    }

    /**
     * @param Paciente the Paciente to set
     */
    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    /**
     * @return the Medico
     */
    public String getMedico() {
        return Medico;
    }

    /**
     * @param Medico the Medico to set
     */
    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    /**
     * @return the Consultorio
     */
    public String getConsultorio() {
        return Consultorio;
    }

    /**
     * @param Consultorio the Consultorio to set
     */
    public void setConsultorio(String Consultorio) {
        this.Consultorio = Consultorio;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Observaciones
     */
    public String getObservaciones() {
        return Observaciones;
    }

    /**
     * @param Observaciones the Observaciones to set
     */
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
}
