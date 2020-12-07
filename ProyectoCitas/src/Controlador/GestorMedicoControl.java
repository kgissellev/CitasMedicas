/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kgramirez
 */
public class GestorMedicoControl implements ActionListener {

    Modelo.GestorMedico medicoModelo;

    vista.ConsMedicoInternalFrame consultarMedicoVista;

    public GestorMedicoControl(vista.ConsMedicoInternalFrame consultarMedicoVista)
    {
        this.consultarMedicoVista=consultarMedicoVista;
        medicoModelo=new Modelo.GestorMedico();
    }
    
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
            String valor=consultarMedicoVista.txt_valor.getText();
        int parametro=0;
    if(consultarMedicoVista.rdb_identificacion.isSelected()){
    parametro=1;
    }
    if(consultarMedicoVista.rdb_nombres.isSelected()){
    parametro=2;
    }
    if(consultarMedicoVista.rdb_apellidos.isSelected()){
    parametro=3;
    }

LinkedList<Modelo.Medico> medico = medicoModelo.getMedicobyParametro(parametro, valor);
    String registro[]=new String[3];
    String []Titulos = {"Identificacion","Nombre","Apellidos"};
    tmodelo=new DefaultTableModel();
    tmodelo.setColumnIdentifiers(Titulos);

    for(Modelo.Medico m:medico){
    registro[0]= m.getMedidentificacion();
    registro[1]= m.getMednombres();
    registro[2]= m.getMedapellidos();
    tmodelo.addRow(registro);
    }
consultarMedicoVista.Tbl_datos.setModel(tmodelo);
}
}
