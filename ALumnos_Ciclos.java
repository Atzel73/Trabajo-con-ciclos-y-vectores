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
public class ALumnos_Ciclos {
      public static void main (String[] args){
         
         
         
          int pregunta = Integer.parseInt(JOptionPane.showInputDialog("¿De quien quieres saber la calificacion? \n" + 
                  "1.- Jose. \n" + 
                  "2.- Karla. \n" + 
                  "3.-Christian." ));
          //Carlos
          if(pregunta == 1){
               int VectorFisica[] = {1,10,6,9,7};
               int VectorHistoria[] = {3,10,6,9,7};
               int VectorMatematicas[] = {3,10,6,9,7};
              String opcion = "0";
              
              System.out.println("Aqui estan las unidades de las materias de Carlos: \n" + "Unidades de fisica: \n" + VectorFisica.length + "\n" + "Unidades de historia: \n" + VectorHistoria.length + "\n" + "Unidades de matematicas: \n" + VectorMatematicas.length);
              do{
                  
               opcion =JOptionPane.showInputDialog("¿Quieres ver su promedio final en general por las 3 materias?");
               if(opcion.equals("si")){     
          for (int i = 0; i < VectorFisica.length; i++) {
              
                  int suma1 = 0;
                  int suma2 = 0;
                  int suma3 = 0;
                  int SumaVectores = 0;
              suma1 = suma1 + VectorFisica[i];
              suma2 = suma2 + VectorMatematicas[i];
              suma3 = suma3 + VectorHistoria[i];
              
               SumaVectores = (suma1 + suma2 + suma3) / 3;
              if(SumaVectores >= 7){
                  System.out.println("Aqui está su promedio final .Aprobó: \n" + SumaVectores);
              }else{
                  System.out.println("Aqui está su promedio final .Reprobó: \n" + SumaVectores);
              }
                  
              }        
          }else{
                  System.out.println("Bueno");
              }
              }while(opcion.equals("si"));
              //Karla
              }else if(pregunta == 2){
                  
                   int VectorFisica[] = {1,10,6,9,7};
               int VectorHistoria[] = {3,10,6,9,7};
               int VectorMatematicas[] = {3,10,6,9,7};
              String opcion = "0";
              
              System.out.println("Aqui estan las unidades de las materias de Carlos: \n" + "\n" + VectorFisica.length + "\n" + VectorHistoria.length + "\n" + VectorMatematicas.length);
              do{
                  
               opcion =JOptionPane.showInputDialog("¿Quieres ver sus calificaciones y promedio final?");
               if(opcion.equals("si")){     
          for (int i = 0; i < VectorFisica.length; i++) {
              
                  int suma1 = 0;
                  int suma2 = 0;
                  int suma3 = 0;
                  int SumaVectores = 0;
              suma1 = suma1 + VectorFisica[i];
              suma2 = suma2 + VectorMatematicas[i];
              suma3 = suma3 + VectorHistoria[i];
              
               SumaVectores = (suma1 + suma2 + suma3) / 3;
              if(SumaVectores >= 7){
                  System.out.println("Aqui está su promedio final .Aprobó: \n" + SumaVectores);
              }else{
                  System.out.println("Aqui está su promedio final .Reprobó: \n" + SumaVectores);
              }
                  
              }        
          }else{
                  System.out.println("Bueno");
              }
              }while(opcion.equals("si"));
              //Christian
              }else if(pregunta == 3){
                   int VectorFisica[] = {1,10,6,9,7};
               int VectorHistoria[] = {3,10,6,9,7};
               int VectorMatematicas[] = {3,10,6,9,7};
              String opcion = "0";
              
              System.out.println("Aqui estan las unidades de las materias de Carlos: \n" + "\n" + VectorFisica.length + "\n" + VectorHistoria.length + "\n" + VectorMatematicas.length);
              do{
                  
               opcion =JOptionPane.showInputDialog("¿Quieres ver sus calificaciones y promedio final?");
               if(opcion.equals("si")){     
          for (int i = 0; i < VectorFisica.length; i++) {
              
                  int suma1 = 0;
                  int suma2 = 0;
                  int suma3 = 0;
                  int SumaVectores = 0;
              suma1 = suma1 + VectorFisica[i];
              suma2 = suma2 + VectorMatematicas[i];
              suma3 = suma3 + VectorHistoria[i];
              
               SumaVectores = (suma1 + suma2 + suma3) / 3;
              if(SumaVectores >= 7){
                  System.out.println("Aqui está su promedio final .Aprobó: \n" + SumaVectores);
              }else{
                  System.out.println("Aqui está su promedio final .Reprobó: \n" + SumaVectores);
              }
                  
              }        
          }else{
                  System.out.println("Bueno");
              }
              }while(opcion.equals("si"));
              }
                  
              }
      }

