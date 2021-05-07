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
         
         
         
          int pregunta = Integer.parseInt(JOptionPane.showInputDialog("¿De quien quieres saber la calificacion?"));
          //Carlos
          if(pregunta == 1){
               int VectorFisica[] = {3,10,6,9,7};
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
              suma1 = suma1 + VectorFisica[i]/5;
              suma2 = suma2 + VectorMatematicas[i]/5;
              suma3 = suma3 + VectorHistoria[i]/5;
              
              SumaVectores = suma1 + suma2 + suma3/3;
              if(SumaVectores >= 7){
                  System.out.println("Aprobó. Aqui estan sus resultados: \n" + SumaVectores);
              }else{
                  System.out.println("Reprobó. Aquí está su resultado: \n" + SumaVectores);
              }
                  
              }        
          }else{
                  System.out.println("Bueno");
              }
              }while(opcion.equals("si"));
              //Karla
              }else if(pregunta == 2){
                  
                  int VectorFisica[] = {3,10,6,9,7};
         int VectorHistoria[] = {3,10,6,9,7};
         int VectorMatematicas[] = {3,10,6,9,7};
              String opcion = "0";
              System.out.println("Aqui estan las unidades de las materias de Carlos: \n" + "\n" + VectorFisica.length + "\n" + VectorHistoria.length + "\n" + VectorMatematicas.length);
              do{
                  
               opcion =JOptionPane.showInputDialog("¿Quieres ver sus calificaciones y promedio final?");
               if(opcion.equals("si")){     
          for (int i = 0; i < VectorFisica.length; i++) {
              int suma = 0;
                  int suma2 = 0;
                  int suma3 = 0;
              suma = suma + VectorFisica[i]/5;
              suma2 = suma2 + VectorMatematicas[i]/5;
              suma3 = suma3 + VectorHistoria[i]/5;
              int SumaVectores = 0;
              SumaVectores = (suma + suma2 + suma3)/3;
              if(SumaVectores >= 7){
                  System.out.println("Aprobó. Aqui estan sus resultados: \n" + SumaVectores);
              }else{
                  System.out.println("Reprobó. Aquí está su resultado: \n" + suma);
              }
                  
              }        
          }else{
                  System.out.println("Bueno");
              }
              }while(opcion.equals("si"));
              //Karla
              }
                  
              }
      }

