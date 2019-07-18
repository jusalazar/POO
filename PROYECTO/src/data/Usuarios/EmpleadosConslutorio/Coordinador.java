
package data.Usuarios.EmpleadosConslutorio;

import java.util.Date;

public class Coordinador extends AgenteInterno{
    
    int idCoordinador;

    public Coordinador(int idCoordinador, String nombre, String apellido_1, String apellido_2, Date fechaDeNacimiento, String usuario, String password, String idPersonal, Boolean activo) {
        super(nombre, apellido_1, apellido_2, fechaDeNacimiento, usuario, password, idPersonal, activo);
        this.idCoordinador = idCoordinador;
    }
    
    //SET

    public void setIdCoordinador(int idCoordinador) {
        this.idCoordinador = idCoordinador;
    }
    
    //GET

    public int getIdCoordinador() {
        return idCoordinador;
    }
    
    /*
    Asignar caso
    Crear estudiante
    Crear Agente interno
    Cierra caso
    */
    
}
