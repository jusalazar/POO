
package data.Usuarios.EmpleadosConslutorio;

import java.util.ArrayList;


public class AsesorJuridico extends AgenteInterno {
    
    String especialidad;
    ArrayList<ConsultorJunior> estudiantes;

    public AsesorJuridico(String especialidad, ArrayList<ConsultorJunior> estudiantes, String nombre, String apellido_1, String apellido_2, String fechaDeNacimiento, String usuario, String password, String idPersonal, Boolean activo) {
        super(nombre, apellido_1, apellido_2, fechaDeNacimiento, usuario, password, idPersonal, activo);
        this.especialidad = especialidad;
        this.estudiantes = estudiantes;
    }


    
    //GEt

    public String getEspecialidad() {
        return especialidad;
    }

    public ArrayList<ConsultorJunior> getEstudiantes() {
        return estudiantes;
    }
    
    //SET

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setEstudiantes(ArrayList<ConsultorJunior> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    /* funciones
    crear concepto
    cierra caso
    */
    
}
