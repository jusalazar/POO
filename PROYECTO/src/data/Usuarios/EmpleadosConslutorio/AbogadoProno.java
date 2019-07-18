
package data.Usuarios.EmpleadosConslutorio;

import data.Papeleo.Caso;
import java.util.ArrayList;
import java.util.Date;


public class AbogadoProno extends AgenteInterno {
    
    String especialidad;
    int numCasos;
    int areaCasos;
    ArrayList<Caso> casos;

    public AbogadoProno(String especialidad, int numCasos, int areaCasos, ArrayList<Caso> casos, String nombre, String apellido_1, String apellido_2, Date fechaDeNacimiento, String usuario, String password, String idPersonal, Boolean activo) {
        super(nombre, apellido_1, apellido_2, fechaDeNacimiento, usuario, password, idPersonal, activo);
        this.especialidad = especialidad;
        this.numCasos = numCasos;
        this.areaCasos = areaCasos;
        this.casos = casos;
    }
    
    //SET

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setNumCasos(int numCasos) {
        this.numCasos = numCasos;
    }

    public void setAreaCasos(int areaCasos) {
        this.areaCasos = areaCasos;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
    }
    
    //GET

    public String getEspecialidad() {
        return especialidad;
    }

    public int getNumCasos() {
        return numCasos;
    }

    public int getAreaCasos() {
        return areaCasos;
    }

    public ArrayList<Caso> getCasos() {
        return casos;
    }
    /* funciones
    crear docuemnto
    crear concepto  
    solicitar cierre de caso
    */
   
}
