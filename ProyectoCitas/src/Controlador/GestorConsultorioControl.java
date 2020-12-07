/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import Modelo.Consultorio;

/**
 *
 * @author kgramirez
 */
public class GestorConsultorioControl {
    Modelo.GestorConsultorio consultorioModelo;

    vista.ConsConsultorioInternalFrame consultarConsultorioVista;

    public GestorConsultorioControl(vista.ConsConsultorioInternalFrame consultarConsultorioVista)
    {
        this.consultarConsultorioVista= consultarConsultorioVista;
        consultorioModelo=new Modelo.GestorConsultorio();
    }
    
        public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
            String valor=consultarConsultorioVista.txt_valor.getText();
        int parametro=0;
            if(consultarConsultorioVista.rdb_ConNombres.isSelected()){
                parametro=1;
            }
            if(consultarConsultorioVista.rdb_ConNumero.isSelected()){
                parametro=2;
            }
    
    LinkedList<Modelo.Consultorio> consultorios = consultorioModelo.getConsultoriobyParametro(parametro, valor);
    String registro[]=new String[2];
    String []Titulos = {"Numero","Nombre"};
    tmodelo=new DefaultTableModel();
    tmodelo.setColumnIdentifiers(Titulos);

    for(Modelo.Consultorio c:consultorios){
    registro[0]= c.getConNumero();
    registro[1]= c.getConNombre();
    tmodelo.addRow(registro);
    }
consultarConsultorioVista.Tbl_datosMed.setModel(tmodelo);
}
}
