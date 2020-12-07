package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
public class PacienteControl implements ActionListener {
    
vista.RegpacienteInternalFrame pacienteVista;
Modelo.Paciente pacienteModelo;
Modelo.GestorPaciente gestorpacienteModelo;

public PacienteControl(vista.RegpacienteInternalFrame pacienteVista){
    this.pacienteVista=pacienteVista;
    gestorpacienteModelo=new Modelo.GestorPaciente();
}
@Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(pacienteVista.btn_nuevo)){
    String identificacion=pacienteVista.txt_identificacion.getText();
    String nombres=pacienteVista.txt_nombres.getText();
    String apellidos=pacienteVista.txt_apellidos.getText();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String fecha_nacimiento=formato.format(pacienteVista.Dtd_Fecha_Nacimiento.getDate());
    String genero= "";
    
        if(pacienteVista.rdb_masculino.isSelected()){
            genero="M";
    }
        if(pacienteVista.rdb_femenino.isSelected()){
            genero="F";
    }
    
    pacienteModelo = new Modelo.Paciente(identificacion,nombres,apellidos,fecha_nacimiento,genero);
    gestorpacienteModelo.RegistrarPacientes(pacienteModelo);
}
    if(e.getSource().equals(pacienteVista.btn_nuevo)){
        pacienteVista.txt_identificacion.setText("");
        pacienteVista.txt_nombres.setText("");
        pacienteVista.txt_apellidos.setText("");
        pacienteVista.Dtd_Fecha_Nacimiento.setDate(null);
        pacienteVista.rdb_masculino.setSelected(true);
        pacienteVista.rdb_femenino.setSelected(false);
        pacienteVista.txt_identificacion.requestFocus();
}
}
}