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
public class TratamientoControl implements ActionListener {
    
    vista.RegtratamientoInternalFrame tratamientoVista;
    Modelo.Tratamiento tratamientoModelo;
    Modelo.GestorTratamiento gestorTratamientoModelo;
    
    
    public TratamientoControl(vista.RegtratamientoInternalFrame tratamientoVista){
        
        this.tratamientoVista = tratamientoVista;
        gestorTratamientoModelo = new Modelo.GestorTratamiento();
    }
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(tratamientoVista.btnRegTratam)){
         String TraNumero =tratamientoVista.txtTraNum.getText();
         SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
          String TrafechaAsig = formato.format(tratamientoVista.jdFeAsig.getDate());
          String TrafechaIni = formato.format(tratamientoVista.jdFeIni.getDate());
          String TrafechaFin=formato.format(tratamientoVista.jdFeFin.getDate());
          String TraDescri =tratamientoVista.txtDesTratam.getText();
          String TraObser =tratamientoVista.txtObseTratam.getText();
          String TraPaciente =tratamientoVista.txtPacien.getText();
          
           
        tratamientoModelo=new Modelo.Tratamiento(TraNumero, TrafechaAsig, TrafechaIni, TrafechaFin, TraDescri, TraObser, TraPaciente);

        gestorTratamientoModelo.RegistrarTratamiento(tratamientoModelo);

        }

        if(e.getSource().equals(tratamientoVista.btnNvTratam)){
          tratamientoVista.txtTraNum.setText("");
          tratamientoVista.jdFeAsig.setDate(null);
          tratamientoVista.jdFeIni.setDate(null);
          tratamientoVista.jdFeFin.setDate(null);
          tratamientoVista.txtObseTratam.setText("");
          tratamientoVista.txtPacien.setText("");
          tratamientoVista.txtTraNum.requestFocus();
             }
        }
}
