package Modelo;

import java.util.LinkedList;

public class GestorConsultorio {
    private static LinkedList<Consultorio> consultorios;
public GestorConsultorio(){
consultorios =new LinkedList<Consultorio>();
}


public void RegistrarConsultorio(Consultorio consultorio){
consultorios.add(consultorio);
}
public static LinkedList<Medico> getConsultoriobyParametro(int parametro, String valor){

    LinkedList<Consultorio> resultado=new LinkedList<Consultorio>();
        for(Consultorio con:consultorios){
            switch(parametro){
                    case 1: if(con.getNombre().equals(valor))
                    resultado.add(con);
                    break;
                    case 2: if(con.getNumero().equals(valor))
                    resultado.add(con);
                    break;
                    
        }
    }
       return null;
}    
}
