/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kgramirez
 */
public class GestorCitasControl {
    
    Modelo.GestorCitas citaModelo;

    vista.ConsCitasInternalFrame consultarCitasVista;

    public GestorCitasControl(vista.ConsCitasInternalFrame consultarCitasVista)
    {
        this.consultarCitasVista= consultarCitasVista;
        citaModelo=new Modelo.GestorCitas();
    }
    
        public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
            String valor=consultarCitasVista.txtValor.getText();
        int parametro=0;
            if(consultarCitasVista.Numero.isSelected()){
                parametro=1;
            }
            if(consultarCitasVista.Fecha.isSelected()){
                parametro=2;
            }
            if(consultarCitasVista.Hora.isSelected()){
                parametro=3;
            }
            if(consultarCitasVista.Paciente.isSelected()){
                parametro=4;
            }
            if(consultarCitasVista.Medico.isSelected()){
                parametro=5;
            }
            if(consultarCitasVista.Consultorio.isSelected()){
                parametro=6;
            }
            if(consultarCitasVista.Estado.isSelected()){
                parametro=7;
            }
            if(consultarCitasVista.Observaciones.isSelected()){
                parametro=8;
            }
    
    LinkedList<Modelo.Citas> citas = citaModelo.getCitasbyParametro(parametro, valor);
    String registro[]=new String[8];
    String []Titulos = {"Numero","Fecha", "Hora", "Paciente", "Medico","Consultorio", "Estado", "Observaciones"};
    tmodelo=new DefaultTableModel();
    tmodelo.setColumnIdentifiers(Titulos);

    for(Modelo.Citas ci:citas){
    registro[0]= ci.getNumero();
    registro[1]= ci.getFecha();
    registro[2]= ci.getPaciente();
    registro[4]= ci.getMedico();
    registro[5]= ci.getConsultorio();
    registro[6]= ci.getEstado();
    registro[7]= ci.getObservaciones();
    tmodelo.addRow(registro);
    }
consultarCitasVista.Tbl_datosCita.setModel(tmodelo);
}
    
}
