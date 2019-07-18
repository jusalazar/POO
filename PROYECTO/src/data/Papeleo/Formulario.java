
package data.Papeleo;


public class Formulario {
    
    String email;
    String ramaDerecho;
    String Hechos;
    String [] documentos;

    public Formulario(String email, String ramaDerecho, String Hechos, String[] documentos) {
        this.email = email;
        this.ramaDerecho = ramaDerecho;
        this.Hechos = Hechos;
        this.documentos = documentos;
    }
    
    //SET

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRamaDerecho(String ramaDerecho) {
        this.ramaDerecho = ramaDerecho;
    }

    public void setHechos(String Hechos) {
        this.Hechos = Hechos;
    }

    public void setDocumentos(String[] documentos) {
        this.documentos = documentos;
    }
    
    //GET

    public String getEmail() {
        return email;
    }

    public String getRamaDerecho() {
        return ramaDerecho;
    }

    public String getHechos() {
        return Hechos;
    }

    public String[] getDocumentos() {
        return documentos;
    }
    
    
    
}
