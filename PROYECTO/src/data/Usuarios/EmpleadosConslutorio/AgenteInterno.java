
package data.Usuarios.EmpleadosConslutorio;

import data.Usuarios.SujetoConsultorio;


public abstract class AgenteInterno extends SujetoConsultorio {
    
    // atributos
    String usuario;
    String password;
    String idPersonal;
    Boolean activo;
    
    //Constructor
    public AgenteInterno( String nombre, String apellido_1, String apellido_2, String fechaDeNacimiento,String usuario, String password, String idPersonal, Boolean activo) {
        super(nombre, apellido_1, apellido_2, fechaDeNacimiento);
        this.usuario = usuario;
        this.password = password;
        this.idPersonal = idPersonal;
        this.activo = activo;
    }
    
    //SET

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    //GET

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public Boolean getActivo() {
        return activo;
    }
    
    
}
