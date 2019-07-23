
package data.Papeleo;

import java.util.ArrayList;
import java.util.Date;


public class Caso {
    
    int idCaso;
    String areaJuridica;
    Date fechaApertura;
    Date fechaSalida;
    ArrayList<Documento> documentos;
    ArrayList<Concepto> conceptoAsesor;
    String[] estadoDelCaso;
    Boolean activo;
    String infoFormulario;

    public Caso(int idCaso, String areaJuridica, Date fechaApertura, Date fechaSalida, ArrayList<Documento> documentos, ArrayList<Concepto> conceptoAsesor, String[] estadoDelCaso, Boolean activo, String infoFormulario) {
        this.idCaso = idCaso;
        this.areaJuridica = areaJuridica;
        this.fechaApertura = fechaApertura;
        this.fechaSalida = fechaSalida;
        this.documentos = documentos;
        this.conceptoAsesor = conceptoAsesor;
        this.estadoDelCaso = estadoDelCaso;
        this.activo = activo;
        this.infoFormulario = infoFormulario;
    }
    
    //SET

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public void setAreaJuridica(String areaJuridica) {
        this.areaJuridica = areaJuridica;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    public void setConceptoAsesor(ArrayList<Concepto> conceptoAsesor) {
        this.conceptoAsesor = conceptoAsesor;
    }

    public void setEstadoDelCaso(String[] estadoDelCaso) {
        this.estadoDelCaso = estadoDelCaso;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public void setInfoFormulario(String infoFormulario) {
        this.infoFormulario = infoFormulario;
    }
    
    //GET

    public int getIdCaso() {
        return idCaso;
    }

    public String getAreaJuridica() {
        return areaJuridica;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public ArrayList<Concepto> getConceptoAsesor() {
        return conceptoAsesor;
    }

    public String[] getEstadoDelCaso() {
        return estadoDelCaso;
    }

    public Boolean getActivo() {
        return activo;
    }

    public String getInfoFormulario() {
        return infoFormulario;
    }
    
    
    
    
}
