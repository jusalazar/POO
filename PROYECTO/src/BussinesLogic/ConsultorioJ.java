
package BussinesLogic;

import data.Usuarios.Cliente.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


 /*public String ExepcionCadenaEnBlanco(int a,String [] atributosUsuario,String entrada){
        
        if(entrada != ""){
        return atributosUsuario[a] = entrada;
        }else{
            return atributosUsuario[a] = "información desconocida";
        }  
    }*/

public class ConsultorioJ {
    
    //Para el archivo Cliente.txt
    
    public static Boolean DesplegableSiNoParaCadena(String MenuSiNo){
        Boolean respuesta = null;
        if (MenuSiNo.equals("Si")){
            respuesta = true;
            
        }
        if(MenuSiNo.equals("No")){
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
    
    public Cliente CrearClienteRegistro(String[] aCliente /*arreglo que va acontener los atributos del cliente*/,String Dia,String Mes,String Año){
        
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
    
    public static Cliente CrearClienteLector (String[] aCliente){
        
        Boolean RecusosEconomicos = DesplegableSiNoParaCadena(aCliente[4]);
        int Estrato = Integer.parseInt(aCliente[5]);
        Boolean Sisben = DesplegableSiNoParaCadena(aCliente[8]);  
        
        Cliente nuevoCliente = new Cliente(aCliente[0],aCliente[1],aCliente[2],aCliente[3],
        RecusosEconomicos,Estrato,aCliente[6],aCliente[7],Sisben,aCliente[9],aCliente[10],
        aCliente[11],aCliente[12],aCliente[13],aCliente[14],aCliente[15],aCliente[16],
        aCliente[17],aCliente[18]);
        
        return nuevoCliente;
    }
    
    public void GuardarCliente (Cliente clienteAGuardar){
        FileWriter flwriter = null;
		try {   
                        String directorioActual = System.getProperty("user.dir");
			flwriter = new FileWriter("1Clientes.txt",true);
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
    
    public static void LeerTodosLosClientes (ArrayList<Cliente> ListaClientes){
       FileReader lectorDeArchivo = null; // Lector de archivo de texto
       try{ // Va a intentar encontrar el archivo en el que leera los contactos
            lectorDeArchivo = new FileReader("1Clientes.txt");
        }catch(FileNotFoundException error){
            JOptionPane.showMessageDialog(null, error);
        }
        BufferedReader textoArchivo; // Variable donde se almacena lo que leyo el lector del archivo
        textoArchivo = new BufferedReader(lectorDeArchivo);  // Le estamos diciendo al buffer de que lector va a recibir
        
        int casillaArreglo = 0;
        while(casillaArreglo < 10000){
            String lineaTexto;
            try {
                lineaTexto = textoArchivo.readLine(); // Creo la variable donde se va a guardar cada sub cadena del archivo
            } catch (IOException error) {//en caso de que falle muestres el mensaje de error y termine ciclo
                JOptionPane.showMessageDialog(null, error);
                return; 
            }
            String[] valoresArchivo = new String [18]; //Creo el arreglo donde se guardaran los datos de cada linar (Primero lo hara con la primera, luego se borrara y hara lo mismo con la segunda linea)
            if (lineaTexto == null){
                break;
            }
           
                valoresArchivo = lineaTexto.split(",");
                Cliente nuevo = CrearClienteLector(valoresArchivo);
                ListaClientes.add(nuevo);
                casillaArreglo++;
                
        } 
    }

    public static void imprimirarregloClientes (ArrayList<Cliente> ListaClientes){
        for (int i = 0; i < ListaClientes.size(); i++) {
            System.out.println("-----------------------------------------");
            System.out.println(ListaClientes.get(i).toString());
            System.out.println("-----------------------------------------");
        }
    }
    
    // Interprete para los arhivos de las preguntas frecuentes
    
    public static String InterpreteArchivosPreguntas(String direccionDelArchivo){
        
        String texto = "";
        
        try{
            FileReader fl = new FileReader(direccionDelArchivo);
            BufferedReader bf = new BufferedReader(fl);
            String acumuladora = "";
            String bfRead;
            
            while((bfRead = bf.readLine()) != null){
                
                if (bfRead.equals("$")) {
                    bfRead = "\n";
                }
                if (bfRead.equals("#")) {
                    bfRead = "  ";
                }
                acumuladora = acumuladora + bfRead;
            }
            texto = acumuladora;
        
        }catch (Exception ex) {
            System.err.println("No se encontro archivo");
            texto = "no se encontro archivo";
        }
        return texto;   
    }

    public static void main(String[] args) {
        
        String direccion = "Quien tiene derecho a los alimentos.txt";
        String texto = InterpreteArchivosPreguntas(direccion);
        System.out.println(texto);
        //System.out.println( "¡Hola pap\u00e1!\nYa puedo escribir bien.\n\u00d1a\u00f1a\u00f1a\u00f1a" );
 
        
    }
    
}
