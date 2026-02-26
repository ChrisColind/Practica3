/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_recursividad;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author croge
 */
//arreglar que error de no colocar numero incorrecto, 
public class FileTest{
        static Archivo ARC = new Archivo();
        
    public static void main(String[] args) throws IOException{
        Scanner n = new Scanner(System.in);
        int opcion=0;
            do{
                try{

                System.out.println("**MENU PRINCIPAL**");
                System.out.println("1- Set archivo / Folder");
                System.out.println("2- Ver informacion");
                System.out.println("3- Crear un archivo");
                System.out.println("4- Crear folder");
                System.out.println("5- Borrar");
                System.out.println("6- Salir");
                System.out.println("Seleccionar una opcion");
                opcion = n.nextInt(); 

                switch(opcion){
                    case 1: Setfile();
                        break;
                    case 2: MostrarInfo();
                        break;
                  case 3: CrearArchivo();
                        break;
                    case 4: CrearCarpeta();
                        break;
                    case 5: Borrar();
                        break;
                    case 6: 
                        break;
                }
                
                //si el usuario usa letras:
            } catch (InputMismatchException e) {
                System.out.println("ingrese solo numeros.");
                n.nextLine();
                
                //si el usuario no tiene permisos en la carpeta, o si no existe la ruta, o que el disco este lleno
            } catch (IOException e) {
                System.out.println("Error de archivo: " + e.getMessage());
                n.nextLine();
                
                //si el usuario elije otras opciones en vez de la primera
            } catch (NullPointerException e) {
                System.out.println("primero inicie una direccion (opcion 1).");
                n.nextLine();
                
            } catch (Exception e){
                System.out.println("Error inesperado");
                n.nextLine();
            }
                
        }while(opcion!=6);
    }
    
    static void Setfile(){
        Scanner n = new Scanner(System.in);
        String direccion;
        System.out.println("Ingrese la direccion");
        direccion = n.nextLine();
        ARC.SetFile(direccion);
        System.out.println("direccion elegida");
        
    }
    
    static void MostrarInfo(){
        ARC.info();
    }
    
    static void CrearArchivo() throws IOException{
        boolean Archivo = ARC.CrearFile();
        if(Archivo){
            System.out.println("Se creo el archivo");
        }else{
            System.out.println("El archivo ya existe");
        }
    }
    
    static void CrearCarpeta(){
        boolean Carpeta = ARC.CrearFolder();
        if(Carpeta){
            System.out.println("Se creo la carpeta");
        }else{
            System.out.println("Este folder ya existe");
        }
    }
    
    static void Borrar(){
        boolean borrar = ARC.Borrar();
        if(borrar){
            System.out.println("Se borro");
        }else{
            System.out.println("No fue posible borrarse");
        }
       
    }
    
    
    
}
