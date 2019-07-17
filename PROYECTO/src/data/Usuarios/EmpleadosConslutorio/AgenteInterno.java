
package data.Usuarios.EmpleadosConslutorio;

import data.Usuarios.SujetoConsultorio;
import java.util.Date;

public class AgenteInterno extends SujetoConsultorio {
    
    // atributos
    String usuario;
    String password;
    String idPersonal;
    Boolean activo;
    
    //Constructor
    public AgenteInterno( String nombre, String apellido_1, String apellido_2, Date fechaDeNacimiento,String usuario, String password, String idPersonal, Boolean activo) {
        super(nombre, apellido_1, apellido_2, fechaDeNacimiento);
        this.usuario = usuario;
        this.password = password;
        this.idPersonal = idPersonal;
        this.activo = activo;
    }
    
    
    
}
