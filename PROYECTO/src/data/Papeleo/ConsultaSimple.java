
package data.Papeleo;

import java.util.ArrayList;
import java.util.Date;

public class ConsultaSimple extends Caso {
    
    Documento documento;

    public ConsultaSimple(Documento documento, int idCaso, String areaJuridica, Date fechaApertura, Date fechaSalida, ArrayList<Documento> documentos, ArrayList<Concepto> conceptoAsesor, String[] estadoDelCaso, Boolean activo, String infoFormulario) {
        super(idCaso, areaJuridica, fechaApertura, fechaSalida, documentos, conceptoAsesor, estadoDelCaso, activo, infoFormulario);
        this.documento = documento;
    }

   
    
    //SET

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    
    //GET

    public Documento getDocumento() {
        return documento;
    }
    
    
    
}
