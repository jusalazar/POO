
package BussinesLogic;

import data.Usuarios.Cliente.Cliente;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ConsultorioJ {
    
    public Boolean DesplegableSiNoParaCadena(String MenuSiNo){
        Boolean respuesta = null;
        if (MenuSiNo == "Si"){
            respuesta = true;
        }
        if(MenuSiNo == "No"){
            respuesta = false;
        }
        return respuesta;
    }
    
    public String DeBooleanAString(Boolean CadenaAConvertir){
        String resultado = null;
        if(CadenaAConvertir == true){
            resultado = "Si";
        }
        if(CadenaAConvertir == false){
            resultado = "No";
        }
        return resultado;
    }
    
    public String FechaDeNacimiento(String Dia,String Mes, String Año){
        return Dia +"/"+Mes+"/"+Año;
    }
    
    public Cliente CrearCliente(String[] aCliente /*arreglo que va acontener los atributos del cliente*/,String Dia,String Mes,String Año){
        
        aCliente[3] = FechaDeNacimiento(Dia,Mes,Año);
        Boolean RecusosEconomicos = DesplegableSiNoParaCadena(aCliente[4]);
        int Estrato = Integer.parseInt(aCliente[5]);
        Boolean Sisben = DesplegableSiNoParaCadena(aCliente[8]);              
        Cliente nuevoCliente = new Cliente(aCliente[0],aCliente[1],aCliente[2],aCliente[3],
        RecusosEconomicos,Estrato,aCliente[6],aCliente[7],Sisben,aCliente[9],aCliente[10],
        aCliente[11],aCliente[12],aCliente[13],aCliente[14],aCliente[15],aCliente[16],
        aCliente[17],aCliente[18]);
        
        return nuevoCliente;       
    }
    
    public String ExepcionCadenaEnBlanco(int a,String [] atributosUsuario,String entrada){
        
        if(entrada != ""){
        return atributosUsuario[a] = entrada;
        }else{
            return atributosUsuario[a] = "información desconocida";
        }  
    }
    
    public void GuardarCliente (Cliente clienteAGuardar){
        FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("Clientes.txt",true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
                        String CadenaAGuardar = clienteAGuardar.CadenaDeClienteParaArchivo();
                        bfwriter.write(CadenaAGuardar);
                        bfwriter.close();
			} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    }
    
    public static void main(String[] args) {
        
    }
    
}
