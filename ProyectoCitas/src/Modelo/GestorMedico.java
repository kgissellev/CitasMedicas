package Modelo;

import java.util.LinkedList;

public class GestorMedico {
    private static LinkedList<Medico> medicos;
public GestorMedico(){
medicos =new LinkedList<Medico>();
}
public void RegistrarMedicos(Medico medico){
medicos.add(medico);
}
public static LinkedList<Medico> getMedicobyParametro(int parametro, String valor){

    LinkedList<Medico> resultado=new LinkedList<Medico>();
        for(Medico med:medicos){
            switch(parametro){
                    case 1: if(med.getIdentificacion().equals(valor))
                    resultado.add(med);
                    break;
                    case 2: if(med.getNombre().equals(valor))
                    resultado.add(med);
                    break;
                    case 3: if(med.getApellidos().equals(valor))
                    resultado.add(med);
                    break;
                    
        }
    }
       return medicos;
}

    public void RegistrarMedico(Medico medicoModelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    

