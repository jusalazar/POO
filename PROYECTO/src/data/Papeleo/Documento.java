
package data.Papeleo;

import java.util.Date;


public class Documento {
    
    int idDocumento;
    Date fechaDocumento;
    String remitente;
    String recetor;
    Boolean aprobado;
    String hechos;
    String pruebas;
    String fundamentoJuridico;
    String [] normas;

    public Documento(int idDocumento, Date fechaDocumento, String remitente, String recetor, Boolean aprobado, String hechos, String pruebas, String fundamentoJuridico, String[] normas) {
        this.idDocumento = idDocumento;
        this.fechaDocumento = fechaDocumento;
        this.remitente = remitente;
        this.recetor = recetor;
        this.aprobado = aprobado;
        this.hechos = hechos;
        this.pruebas = pruebas;
        this.fundamentoJuridico = fundamentoJuridico;
        this.normas = normas;
    }
    
    //GET

    public int getIdDocumento() {
        return idDocumento;
    }

    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getRecetor() {
        return recetor;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public String getHechos() {
        return hechos;
    }

    public String getPruebas() {
        return pruebas;
    }

    public String getFundamentoJuridico() {
        return fundamentoJuridico;
    }

    public String[] getNormas() {
        return normas;
    }
    
    //SET

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setRecetor(String recetor) {
        this.recetor = recetor;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public void setHechos(String hechos) {
        this.hechos = hechos;
    }

    public void setPruebas(String pruebas) {
        this.pruebas = pruebas;
    }

    public void setFundamentoJuridico(String fundamentoJuridico) {
        this.fundamentoJuridico = fundamentoJuridico;
    }

    public void setNormas(String[] normas) {
        this.normas = normas;
    }
    
       
}
