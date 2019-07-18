
package data.Usuarios.Cliente;

import data.Usuarios.SujetoConsultorio;
import java.util.Date;

public class Cliente extends SujetoConsultorio {
    
    //atributos
    protected Boolean recursosEconomicos;
    int estrato;
    String ocupacion;
    String tipoDeVinculacionLaboral;
    Boolean perteneceASisben;
    String idPersonal;
    String lugarDeNAcimiento;
    String estadoCivil;
    int numContacto;
    String direccionResidencia;
    String barrio;
    String direccionTrabajo;
    String tipoVivienda;
    int ingreso;
    String gradoEscolaridad;
    
    //Constructor

    public Cliente(String nombre, String apellido_1, String apellido_2, Date fechaDeNacimiento,Boolean recursosEconomicos, int estrato, String ocupacion, String tipoDeVinculacionLaboral, Boolean perteneceASisben, String idPersonal, String lugarDeNAcimiento, String estadoCivil, int numContacto, String direccionResidencia, String barrio, String direccionTrabajo, String tipoVivienda, int ingreso, String gradoEscolaridad) {
        super(nombre, apellido_1, apellido_2, fechaDeNacimiento);
        this.recursosEconomicos = recursosEconomicos;
        this.estrato = estrato;
        this.ocupacion = ocupacion;
        this.tipoDeVinculacionLaboral = tipoDeVinculacionLaboral;
        this.perteneceASisben = perteneceASisben;
        this.idPersonal = idPersonal;
        this.lugarDeNAcimiento = lugarDeNAcimiento;
        this.estadoCivil = estadoCivil;
        this.numContacto = numContacto;
        this.direccionResidencia = direccionResidencia;
        this.barrio = barrio;
        this.direccionTrabajo = direccionTrabajo;
        this.tipoVivienda = tipoVivienda;
        this.ingreso = ingreso;
        this.gradoEscolaridad = gradoEscolaridad;
    }
    
    // Get

    public Boolean getRecursosEconomicos() {
        return recursosEconomicos;
    }

    public int getEstrato() {
        return estrato;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getTipoDeVinculacionLaboral() {
        return tipoDeVinculacionLaboral;
    }

    public Boolean getPerteneceASisben() {
        return perteneceASisben;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public String getLugarDeNAcimiento() {
        return lugarDeNAcimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getNumContacto() {
        return numContacto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public int getIngreso() {
        return ingreso;
    }

    public String getGradoEscolaridad() {
        return gradoEscolaridad;
    }

    //SET

    public void setRecursosEconomicos(Boolean recursosEconomicos) {
        this.recursosEconomicos = recursosEconomicos;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setTipoDeVinculacionLaboral(String tipoDeVinculacionLaboral) {
        this.tipoDeVinculacionLaboral = tipoDeVinculacionLaboral;
    }

    public void setPerteneceASisben(Boolean perteneceASisben) {
        this.perteneceASisben = perteneceASisben;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setLugarDeNAcimiento(String lugarDeNAcimiento) {
        this.lugarDeNAcimiento = lugarDeNAcimiento;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public void setGradoEscolaridad(String gradoEscolaridad) {
        this.gradoEscolaridad = gradoEscolaridad;
    }
    
    /*Funciones
    Ver estado de caso public
    Llenar formulario
    */


    
}
