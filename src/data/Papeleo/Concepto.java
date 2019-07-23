
package data.Papeleo;

import data.Usuarios.EmpleadosConslutorio.AsesorJuridico;

public class Concepto {
    
    int idConcepto;
    AsesorJuridico asesor;

    public Concepto(int idConcepto, AsesorJuridico asesor) {
        this.idConcepto = idConcepto;
        this.asesor = asesor;
    }
    
    //SET

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public void setAsesor(AsesorJuridico asesor) {
        this.asesor = asesor;
    }
    
    //GET

    public int getIdConcepto() {
        return idConcepto;
    }

    public AsesorJuridico getAsesor() {
        return asesor;
    }
    
    
    
}
