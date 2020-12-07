/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kgramirez
 */
public class MedicoControl implements ActionListener{
    
    vista.RegmedicoInternalFrame medicoVista;
    Modelo.Medico medicoModelo;
    Modelo.GestorMedico gestorMedicoModelo;
    
    
    public MedicoControl(vista.RegmedicoInternalFrame medicoVista){
        
        this.medicoVista=medicoVista;
        gestorMedicoModelo= new Modelo.GestorMedico();
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(medicoVista.btn_nuevoMed)){
         String identificacion= medicoVista.txt_Medidentificacion.getText();
         String nombre= medicoVista.txt_Mednombres.getText();
         String apellidos=medicoVista.txt_Medapellidos.getText();
 
         medicoModelo=new Modelo.Medico(identificacion, nombre, apellidos);
         gestorMedicoModelo.RegistrarMedico(medicoModelo);

        }
        
        if(e.getSource().equals(medicoVista.btn_nuevoMed)){
          medicoVista.txt_Medidentificacion.setText("");
          medicoVista.txt_Mednombres.setText("");
          medicoVista.txt_Medapellidos.setText("");
          medicoVista.txt_Medidentificacion.requestFocus();
             }
        }
}

