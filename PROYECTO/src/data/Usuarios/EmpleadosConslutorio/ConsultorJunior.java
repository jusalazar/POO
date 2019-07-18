/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.Usuarios.EmpleadosConslutorio;

import data.Papeleo.Caso;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mauri
 */
public class ConsultorJunior extends AgenteInterno {
    
    int codigo;
    int numeroDeCasos;
    int [] areaCasos;
    ArrayList<Caso> casos;
    

    public ConsultorJunior(int codigo, int numeroDeCasos, int[] areaCasos, ArrayList<Caso> casos, String nombre, String apellido_1, String apellido_2, Date fechaDeNacimiento, String usuario, String password, String idPersonal, Boolean activo) {
        super(nombre, apellido_1, apellido_2, fechaDeNacimiento, usuario, password, idPersonal, activo);
        this.codigo = codigo;
        this.numeroDeCasos = numeroDeCasos;
        this.areaCasos = areaCasos;
        this.casos = casos;
    }
    
    //GEt

    public int getCodigo() {
        return codigo;
    }

    public int getNumeroDeCasos() {
        return numeroDeCasos;
    }

    public int[] getAreaCasos() {
        return areaCasos;
    }

    public ArrayList<Caso> getCasos() {
        return casos;
    }
    
    //SET

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumeroDeCasos(int numeroDeCasos) {
        this.numeroDeCasos = numeroDeCasos;
    }

    public void setAreaCasos(int[] areaCasos) {
        this.areaCasos = areaCasos;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
    }
    
    /*
    crear documento
    solicitar cierre de caso
    */

    
}
