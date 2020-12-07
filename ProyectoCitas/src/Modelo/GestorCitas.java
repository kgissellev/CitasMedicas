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
public class GestorCitas {

    private static LinkedList<Citas> citas;
public GestorCitas(){
citas =new LinkedList<Citas>();
}


public void RegistrarCita(Citas cita){
citas.add(cita);
}
public static LinkedList<Citas> getCitasbyParametro(int parametro, String valor){

    LinkedList<Citas> resultado=new LinkedList<Citas>();
        for(Citas ct:citas){
            switch(parametro){
                    case 1: if(ct.getNumero().equals(valor))
                    resultado.add(ct);
                    break;
                    case 2: if(ct.getFecha().equals(valor))
                    resultado.add(ct);
                    break;
                    
                    case 3: if(ct.getHora().equals(valor))
                    resultado.add(ct);
                    break;
                    
                    case 4: if(ct.getPaciente().equals(valor))
                    resultado.add(ct);
                    break;
                    
                    
                    case 5: if(ct.getMedico().equals(valor))
                    resultado.add(ct);
                    break;
                    
                    
                    case 6: if(ct.getConsultorio().equals(valor))
                    resultado.add(ct);
                    break;
                    
                    
                    case 7: if(ct.getEstado().equals(valor))
                    resultado.add(ct);
                    break;
                    
                    
                    case 8: if(ct.getObservaciones().equals(valor))
                    resultado.add(ct);
                    break;
                    
        }
    }
       return null;
}   
    
}
