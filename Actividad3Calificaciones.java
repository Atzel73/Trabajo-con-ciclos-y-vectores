/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
   
public class Actividad3Calificaciones { 
 
   
    public static void main (String[] args){
        
   int HistoriaJuan = 7;
    int FisicaJuan = 5;
    int EspañolJuan = 4;
    
    int HistoriaJose = 7;
    int FisicaJose = 7;
    int EspañolJose = 10;
    
    int HistoriaKarla = 10;
    int FisicaKarla = 4;
    int EspañolKarla = 7;
    
 
     
   
    
    
    
       int   Alumno = Integer.parseInt(JOptionPane.showInputDialog("¿De que alumno quieres saber la calificacion: \n 1.-Juan \n 2.-Jose \n 3.-Karla"));
      //Juan
    if (Alumno == 1) {
         System.out.println("Elegiste a Juan");
         String Opcion = "0";
         String Pregunta1 = "0";
         int PromedioJuan = 0;
         Opcion = JOptionPane.showInputDialog("¿De que materia quieres ver su calificacion y promedio?:\n 1.-Historia  \n 2.-Fisica \n 3.-Español. Escribe 4 para ver su promedio final.");
         
         if(Opcion.equals("1")){
             System.out.println("Has elegido Historia. Su calificacion es: " + HistoriaJuan);
             if(HistoriaJuan >= 7){
                 System.out.println("Sí aprobó");
              }else{
                 System.out.println("Reprobó");
                 }  
             
         } else if(Opcion.equals("2")){
             System.out.println("Has elegido Fisica. Su calificacion es: " + FisicaJuan);
             if(FisicaJuan >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó");
             }
         } else if(Opcion.equals("2")){
                  System.out.println("Has elegido Español. Su calificacion es: " + EspañolJuan);
             if(EspañolJuan >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó"); 
         }
         } else if(Opcion.equals("4")){
                    Pregunta1 = JOptionPane.showInputDialog("¿Quieres ver su promedio de las 3 materias?");
                    if(Pregunta1.equals("si")){
                        PromedioJuan = (HistoriaJuan + FisicaJuan + EspañolJuan)/2;
                         if(PromedioJuan >= 7){
                             System.out.println("Aprobó. Su calificación final es de: " + PromedioJuan);
                         }else {
                             System.out.println("Reprobó");
                         }     
                    }
             }       
         
         //Jose
    } else if (Alumno == 2) {
         System.out.println("Elegiste a Jose");
         String Opcion = "0";
         int PromedioJose = 0;
         String Pregunta2 = "0";
         Opcion = JOptionPane.showInputDialog("¿De que materia quieres ver su calificacion y promedio?:\n 1.-Historia \n 2.-Fisica \n 3.-Espaoñl");
         
         if(Opcion.equals("1")){
             System.out.println("Has elegido Historia. Su calificacion es: " + HistoriaJose);
             if(HistoriaJose >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó");
             }
             
         } else if(Opcion.equals("2")){
             System.out.println("Has elegido Fisica. Su calificacion es: " + FisicaJose);
             if(FisicaJose >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó");
             }
             
         } else if(Opcion.equals("3")){
                  System.out.println("Has elegido Español. Su calificacion es: " + EspañolJose);
             if(EspañolJose >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó");
                 
             }

    }else if(Opcion.equals("4")){
                    Pregunta2 = JOptionPane.showInputDialog("¿Quieres ver su promedio de las 3 materias?");
                    if(Pregunta2.equals("si")){
                        PromedioJose = (HistoriaJose + FisicaJose + EspañolJose)/2;
                         if(PromedioJose >= 7){
                             System.out.println("Aprobó. Su calificación final es de: " + PromedioJose );
                         }else {
                             System.out.println("Reprobó");
                         }     
                    }
             }
         //Karla
}else if (Alumno == 3){
       System.out.println("Elegiste a Karla");
         String Opcion = "0";
         int PromedioKarla = 0;
         String Pregunta2 = "0";
         Opcion = JOptionPane.showInputDialog("¿De que materia quieres ver su calificacion y promedio?:\n 1.-Historia \n 2.-Fisica \n 3.-Español");
         
         if(Opcion.equals("1")){
             System.out.println("Has elegido Historia. Su calificacion es: " + HistoriaKarla);
             if(HistoriaKarla >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó");
             }
             
         } else if(Opcion.equals("2")){
             System.out.println("Has elegido Fisica. Su calificacion es: " + FisicaKarla);
             if(FisicaKarla >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó");
             }
         } else if(Opcion.equals("3")){
                  System.out.println("Has elegido Español. Su calificacion es: " + EspañolKarla);
             if(EspañolKarla >= 7){
                 System.out.println("Sí aprobó");
             }else{
                 System.out.println("Reprobó");
    }
         }else if(Opcion.equals("4")){
                    Pregunta2 = JOptionPane.showInputDialog("¿Quieres ver su promedio de las 3 materias?");
                    if(Pregunta2.equals("si")){
                        PromedioKarla = (HistoriaKarla + FisicaKarla + EspañolKarla)/2;
                         if(PromedioKarla >= 7){
                             System.out.println("Aprobó. Su calificación final es de: " + PromedioKarla  );
                         }else {
                             System.out.println("Reprobó");
                         }     
                    }
             }
}else {
    
                             System.out.println("No has elegido ninguno");

}
}
}