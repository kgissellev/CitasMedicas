/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

/**
 *
 * @author kgramirez
 */
public class CitasControl implements ActionListener{
    vista.RegcitasInternalFrame citaVista;
    Modelo.Citas citaModelo;
    Modelo.GestorCitas gestorCitaModelo;
    
    
    public CitasControl(vista.RegcitasInternalFrame citaVista){
        
        this.citaVista = citaVista;
        gestorCitaModelo= new Modelo.GestorCitas();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(citaVista.btnNue)){
         String numero = citaVista.txtNum.getText();
         SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
         String fecha = formato.format(citaVista.jdtFecha.getDate());
         String hora = citaVista.txtHora.getText();
         String paciente = citaVista.txtPaciente.getText();
         String medico = citaVista.txtMedico.getText();
         String consultorio = citaVista.txtCons.getText();
         String estado = citaVista.txtEstado.getText();
         String observ = citaVista.txtObserva.getText();
         
         
         citaModelo =new Modelo.Citas(numero, fecha, hora, paciente, medico, consultorio, estado, observ);
         gestorCitaModelo.RegistrarCita(citaModelo);

        }
        
        if(e.getSource().equals(citaVista.btnNue)){
          citaVista.txtNum.setText("");
          citaVista.jdtFecha.setDate(null);
          citaVista.txtHora.setText("");
          citaVista.txtPaciente.setText("");
          citaVista.txtMedico.setText("");
          citaVista.txtCons.setText("");
          citaVista.txtEstado.setText("");
          citaVista.txtObserva.setText("");
            
          
          citaVista.txtNum.requestFocus();
             }
        }
}
