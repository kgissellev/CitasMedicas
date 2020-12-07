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
public class GestorTratamientoControl {
    Modelo.GestorTratamiento tratamientoModelo;
    vista.ConsTratamientoInternalFrame consultaTratamientoVista;
    public GestorTratamientoControl(vista.ConsTratamientoInternalFrame consultaTratamientoVista ){
        
        this.consultaTratamientoVista = consultaTratamientoVista;
        tratamientoModelo= new Modelo.GestorTratamiento();
    }
    
    public void actionPerformed(ActionEvent e) {
        
        DefaultTableModel tmodelo;
        String valor= consultaTratamientoVista.txtTraValor.getText();
        int parametro=0;
        
        if(consultaTratamientoVista.NumTratam.isSelected()){
            parametro=1;
        }
        
        if(consultaTratamientoVista.FechaAsig.isSelected()){
            parametro=2;
        }
        
        if(consultaTratamientoVista.FechaIni.isSelected()){
            parametro=3;
        }
        if(consultaTratamientoVista.FechaFinal.isSelected()){
            parametro=4;
        }
        if(consultaTratamientoVista.DesTratam.isSelected()){
            parametro=5;
        }
        if(consultaTratamientoVista.Pacien.isSelected()){
            parametro=6;
        }
        
        if(consultaTratamientoVista.Pacien.isSelected()){
            parametro=7;
        }
        
       LinkedList<Modelo.Tratamiento>tratamientos = tratamientoModelo.getTratamientobyParametro(parametro, valor);
            String registro[]=new String[7];
          
            String []Titulos = {"Numero","Fecha asignada","Fecha inicio","Fecha final", "Descripcion","Observaciones", "Paciente"};;
            
              tmodelo=new DefaultTableModel();
            tmodelo.setColumnIdentifiers(Titulos);
        for(Modelo.Tratamiento t:tratamientos){
          registro[0]=t.getTranumero();
          registro[1]=t.getTraFechaAsig();
          registro[2]=t.getTraDescripcion();
          registro[3]=t.getTraFechaIni();
          registro[4]=t.getTraFechaFin();
          registro[5]=t.getTraObser();
          registro[6]=t.getTraPaciente();
        tmodelo.addRow(registro);
           }
          consultaTratamientoVista.Tbl_datosTratam.setModel(tmodelo);
        
      }
}
