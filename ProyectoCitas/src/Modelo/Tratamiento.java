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
public class Tratamiento {


    public String Tranumero;
    public String TraFechaAsig;
    public String TraDescripcion;
    public String TraFechaIni;
    public String TraFechaFin;
    public String TraObser;
    public String TraPaciente;
    
    public Tratamiento (String Tranumero, String TraFechaAsig, String TraDescripcion, String TraFechaIni, String TraFechaFin, String TraObser, String TraPaciente) {
         
        this.Tranumero = Tranumero;
        this.TraFechaAsig = TraFechaAsig;
        this.TraDescripcion = TraDescripcion;
        this.TraFechaIni = TraFechaIni;
        this.TraFechaFin = TraFechaFin;
        this.TraObser = TraObser;
        this.TraPaciente = TraPaciente;
        
    }
    
    /**
     * @return the Tranumero
     */
    public String getTranumero() {
        return Tranumero;
    }

    /**
     * @param Tranumero the Tranumero to set
     */
    public void setTranumero(String Tranumero) {
        this.Tranumero = Tranumero;
    }

    /**
     * @return the TraFechaAsig
     */
    public String getTraFechaAsig() {
        return TraFechaAsig;
    }

    /**
     * @param TraFechaAsig the TraFechaAsig to set
     */
    public void setTraFechaAsig(String TraFechaAsig) {
        this.TraFechaAsig = TraFechaAsig;
    }

    /**
     * @return the TraDescripcion
     */
    public String getTraDescripcion() {
        return TraDescripcion;
    }

    /**
     * @param TraDescripcion the TraDescripcion to set
     */
    public void setTraDescripcion(String TraDescripcion) {
        this.TraDescripcion = TraDescripcion;
    }

    /**
     * @return the TraFechaIni
     */
    public String getTraFechaIni() {
        return TraFechaIni;
    }

    /**
     * @param TraFechaIni the TraFechaIni to set
     */
    public void setTraFechaIni(String TraFechaIni) {
        this.TraFechaIni = TraFechaIni;
    }

    /**
     * @return the TraFechaFin
     */
    public String getTraFechaFin() {
        return TraFechaFin;
    }

    /**
     * @param TraFechaFin the TraFechaFin to set
     */
    public void setTraFechaFin(String TraFechaFin) {
        this.TraFechaFin = TraFechaFin;
    }

    /**
     * @return the TraObser
     */
    public String getTraObser() {
        return TraObser;
    }

    /**
     * @param TraObser the TraObser to set
     */
    public void setTraObser(String TraObser) {
        this.TraObser = TraObser;
    }
    
    /**
     * @return the TraPaciente
     */
    public String getTraPaciente() {
        return TraPaciente;
    }

    /**
     * @param TraPaciente the TraPaciente to set
     */
    public void setTraPaciente(String TraPaciente) {
        this.TraPaciente = TraPaciente;
    }
    
}
