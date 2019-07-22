
package tarea;

import java.io.File;
import java.util.Scanner;




public class Tarea {
    private static int i;
    
    
    
    
    
 public static void main (String [] args){
     Scanner Archivos = new Scanner (System.in);
     Scanner Archivos2 = new Scanner (System.in);
     
     System.out.println("programa para encontrar archivos"+"cojnocer que archivos existen");
     int valor = 0;
     try {
         valor = Archivos.nextInt();
         
     }catch (Exception e ){
         if (Character.isLetter(valor)|| Character.isDefined(valor)){
             System.out.println(valor);
             
             
         }else {
             System.out.println("oprima numeros");
             
         }
                 
     }finally {
         if ((valor >=1)&& (valor <=5)){
             System.out.println(valor);
             
         }else{
             System.out.println("oprima numeros del 1 al 5");
         }
             switch (valor){
                 case 1:
                     File archivo = new File ("C:\\Users\\USUARIO\\Desktop");
                      File carpeta = new File ("C:\\Users\\USUARIO\\Desktop");
                     String[] archivos = carpeta.list();
                     for (int i=0;i< archivos.length;i++);{
             
                     System.out.println(archivos[i]);
                     break;
                 
                 }
                 case 2:
                      File archivo2 = new File ("C:\\Users\\USUARIO\\Documents");
                      File carpeta2 = new File ("C:\\Users\\USUARIO\\Documents");
                     String[] archivos2 = carpeta2.list();
                     for (int i=0;i< archivos2.length;i++);{
             
                     System.out.println(archivos2[i]);
                     break;
                     
                 }
                 case 3:
                       File archivo3 = new File ("C:\\Users\\USUARIO\\Pictures");
                      File carpeta3 = new File ("C:\\Users\\USUARIO\\Pictures");
                     String[] archivos3 = carpeta3.list();
                     for (int i = 0; i  < archivos3.length;i++);{
             
                     System.out.println(archivos3[i]);
                     break;
                 }
                 case 4:
                      File archivo4 = new File ("C:\\Users\\USUARIO\\Videos");
                      File carpeta4= new File ("C:\\Users\\USUARIO\\Videos");
                     String[] archivos4 = carpeta4.list();
                     for (int i=0;i< archivos4.length;i++);{
             
                     System.out.println(archivos4[i]);
                     break;
                 }
                 case 5:
                      File archivo5 = new File ("C:\\Users\\USUARIO\\Desktop");
                      File carpeta5 = new File ("C:\\Users\\USUARIO\\Desktop");
                     String[] archivos5 = carpeta5.list();
                     for (int i=0;i< archivos5.length;i++);{
             
                     System.out.println(archivos5[i]);
                     break;
                 }
             }
                     
                     
                     
                     
                     
             
         }
     }
     
   
 
    }
    

