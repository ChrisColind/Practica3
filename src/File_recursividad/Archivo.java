/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package File_recursividad;
//.io 
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Archivo{
    private File mifile = null;
    
    void SetFile(String direccion){
        mifile=new File(direccion);
    }
    
    void info(){
        if(mifile.exists()){
            System.out.println("\nNombre: "+mifile.getName());
            System.out.println("Path: "+mifile.getPath());
            System.out.println("Absoluta: "+mifile.getAbsolutePath());
            System.out.println("Bytes: "+mifile.length());
            System.out.println("Modificado en: "+new Date(mifile.lastModified()));
            System.out.println("Padre: "+mifile.getAbsoluteFile().getParentFile().getName());
            System.out.println("");
            if(mifile.isFile()){
                System.out.println("Es un archivo");
            }else if(mifile.isDirectory()){
                System.out.println("Es un directorio");
            }
            System.out.println("");
            
        }else{
            System.out.println("no existe");
        }
    }
    
    //throw = a if o lineas de codigo que se use exception
    //throws = a funciones o constructores
    
    //crea objetos que guarda metadata.
    
    boolean CrearFile() throws IOException{
        return mifile.createNewFile();
    }
    
    //no se usa throw exeption
    //crea objetos en donde se van a guardar otros objetos.
    
    boolean CrearFolder(){
        return mifile.mkdirs();
    }
    
    //mkdir = al usar un folder "patito" crea el objeto solo ocupa el nombre, nada mas.
    //mkdirs = al usar un folder "granja" ocupa la direccion de las carpetas, si no encuentra las demas carpetas, las crea

    //inicia 1 
    boolean Borrar(){
        //APRENDER A BORAR TODO LO QUE TIENE DENTRO DEL FOLDER: FOLDERS O ARCHIVOS
        
        return borrarRecursividad(mifile);
    }
    
    boolean borrarRecursividad(File archivo){
        
        if(archivo.isDirectory()){
            File[] contenido = archivo.listFiles();
            
            if(contenido != null){
                for(File x : contenido){
                    boolean exito = borrarRecursividad(x);
                    if(!exito){
                        System.out.println("No fue posible borrarlo "+x.getName());
                        return false;
                    }
                }
            }
        }
        return archivo.delete();
    }
    //No puede borrar un folder si es que esta 
}