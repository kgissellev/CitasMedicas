package Modelo;

/**
 *
 * @author kgramirez
 */
public class Paciente {
    
    public String indentificacion;
    public String nombres;
    public String apellidos;
    public String fechaNacimiento;
    public String genero;

    public Paciente(String identificacion, String nombres, String apellidos, String fecha_nacimiento, String genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Paciente(String identificacion, String nombres, String apellidos, String genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
