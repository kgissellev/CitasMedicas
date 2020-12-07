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
public class ConsultorioControl implements ActionListener {
    
    vista.RegconsultorioInternalFrame consultorioVista;
    Modelo.Consultorio consultorioModelo;
    Modelo.GestorConsultorio gestorConsultorioModelo;
    
    
    public ConsultorioControl(vista.RegconsultorioInternalFrame consultorioVista){
        
        this.consultorioVista = consultorioVista;
        gestorConsultorioModelo= new Modelo.GestorConsultorio();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(consultorioVista.btn_nuevoCon)){
         String numero = consultorioVista.txt_ConNumero.getText();
         String nombre= consultorioVista.txt_ConNombre.getText();
         
 
         consultorioModelo=new Modelo.Consultorio(numero, nombre);
         gestorConsultorioModelo.RegistrarConsultorio(consultorioModelo);

        }
        
        if(e.getSource().equals(consultorioVista.btn_nuevoCon)){
          consultorioVista.txt_ConNumero.setText("");
          consultorioVista.txt_ConNombre.setText("");
          consultorioVista.txt_ConNumero.requestFocus();
             }
        }
}
