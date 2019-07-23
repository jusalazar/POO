/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.Usuarios;

public abstract class SujetoConsultorio {
    
    // Atributos
    
    public String nombre;
    public String apellido_1;
    public String apellido_2;
    public String fechaDeNacimiento;
    
    //Constructor

    public SujetoConsultorio(String nombre, String apellido_1, String apellido_2, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    // GET

    public String getNombre() {
        return nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    
    //SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
}
