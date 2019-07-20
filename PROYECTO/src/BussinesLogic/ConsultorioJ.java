
package BussinesLogic;

import data.Usuarios.Cliente.Cliente;

public class ConsultorioJ {
    
    public Boolean DesplegableSiNo(String MenuSiNo){
        Boolean respuesta = null;
        if (MenuSiNo == "Si"){
            respuesta = true;
        }
        if(MenuSiNo == "Si"){
            respuesta = false;
        }
        return respuesta;
    }
    
    public String FechaDeNacimiento(String Dia,String Mes, String Año){
        return Dia +"/"+Mes+"/"+Año;
    }
    
    public Cliente CrearCliente(String[] aCliente /*arreglo que va acontener los atributos del cliente*/,String Dia,String Mes,String Año){
        
        String fechaNacimiento = FechaDeNacimiento(Dia,Mes,Año);
        Boolean RecusosEconomicos = DesplegableSiNo(aCliente[4]);
        int Estrato = Integer.parseInt(aCliente[5]);
        Boolean Sisben = DesplegableSiNo(aCliente[8]);
        int numeroContacto = Integer.parseInt(aCliente[12]);
        int Ingresos = Integer.parseInt(aCliente[17]);
              
        Cliente nuevoCliente = new Cliente(aCliente[0],aCliente[1],aCliente[2],fechaNacimiento,
        RecusosEconomicos,Estrato,aCliente[6],aCliente[7],Sisben,aCliente[9],aCliente[10],
        aCliente[11],numeroContacto,aCliente[13],aCliente[14],aCliente[15],aCliente[16],
        Ingresos,aCliente[18]);
        
        return nuevoCliente;       
    }

    public static void main(String[] args) {
        
    }
    
}
