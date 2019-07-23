
package data.Papeleo;

import java.util.ArrayList;
import java.util.Date;

public class ConsultaCompleja extends Caso {
    
    String tipoProceso;
    ArrayList<Documento> numeroDocumentos;

    public ConsultaCompleja(String tipoProceso, ArrayList<Documento> numeroDocumentos, int idCaso, String areaJuridica, Date fechaApertura, Date fechaSalida, ArrayList<Documento> documentos, ArrayList<Concepto> conceptoAsesor, String[] estadoDelCaso, Boolean activo, String infoFormulario) {
        super(idCaso, areaJuridica, fechaApertura, fechaSalida, documentos, conceptoAsesor, estadoDelCaso, activo, infoFormulario);
        this.tipoProceso = tipoProceso;
        this.numeroDocumentos = numeroDocumentos;
    }
    
    //SET

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public void setNumeroDocumentos(ArrayList<Documento> numeroDocumentos) {
        this.numeroDocumentos = numeroDocumentos;
    }
    
    //GET

    public String getTipoProceso() {
        return tipoProceso;
    }

    public ArrayList<Documento> getNumeroDocumentos() {
        return numeroDocumentos;
    }
}
