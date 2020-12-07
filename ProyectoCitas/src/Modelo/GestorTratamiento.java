/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author kgramirez
 */
public class GestorTratamiento {
       private static LinkedList<Tratamiento> tratamientos;
    public GestorTratamiento(){
    tratamientos =new LinkedList<Tratamiento>();
    }
    public void RegistrarTratamientos(Tratamiento tratamiento){
    tratamientos.add(tratamiento);
    }
    
    public static LinkedList<Tratamiento> getTratamientobyParametro(int parametro, String valor){

    LinkedList<Tratamiento> resultado=new LinkedList<Tratamiento>();
        for(Tratamiento tra:tratamientos){
            switch(parametro){
                    case 1: if(tra.getTranumero().equals(valor))
                    resultado.add(tra);
                    break;
                    case 2: if(tra.getTraFechaAsig().equals(valor))
                    resultado.add(tra);
                    break;
                    case 3: if(tra.getTraDescripcion().equals(valor))
                    resultado.add(tra);
                    break;
                    case 4: if(tra.getTraFechaIni().equals(valor))
                    resultado.add(tra);
                    break;
                    case 5: if(tra.getTraFechaFin().equals(valor))
                    resultado.add(tra);
                    break;
                    case 6: if(tra.getTraObser().equals(valor))
                    resultado.add(tra);
                    break;
                    case 7: if(tra.getTraPaciente().equals(valor))
                    resultado.add(tra);
                    break;
                    
                    
        }
    }
       return tratamientos;
}

    public void RegistrarTratamiento(Tratamiento tratamientoModelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
