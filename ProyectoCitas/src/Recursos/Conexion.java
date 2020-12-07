package Recursos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private String driver,url, ip, bd, usr,pass;
    public Connection conexion;
    public Conexion(String ip, String bd, String usr,String pass){
    driver="oracle.jdbc.driver.OracleDriver";
    this.bd=bd;
    this.usr=usr;
    this.pass=pass;
    url="jdbc:oracle:thin:@"+ip+":1521:"+bd;
    try
    {
    Class.forName(driver).newInstance();
    conexion=DriverManager.getConnection(url,usr,pass);
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null,"Error de conexion a la base de datos");
}
}
public Connection getConexion(){
return conexion;
}
public Connection CerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
conexion=null;
return conexion;
}
}
