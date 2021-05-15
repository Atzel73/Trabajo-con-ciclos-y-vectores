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

    public static void main(String[] args) {
        int Longitud = 0;
        int cont = 0;
        int Calificacion[] = new int[5];
        int result = 0;
        String pregunta = "0";
        String Alumno = "0";
        Alumno = JOptionPane.showInputDialog("¿De quien quieres saber la calificacion?\n" + "1.-Jose \n" + "2.-Karla \n" + "3.-Christian");
        do {

            //Jose
            if (Alumno.equals("1")) {

                System.out.println("Has elegido a Jose\n.");

                pregunta = JOptionPane.showInputDialog("¿Quieres introducir sus calificaciones?");

                if (pregunta.equals("si")) {
                    int i = 0;

                    for (i = 0; i <= Calificacion.length; i++) {
                        Calificacion[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las calificaciones mayores a 5: "));
                        cont = cont + Calificacion[i];

                        System.out.println("Aqui esta la calificacion: " + Calificacion[i]);

                        result = cont / 5;
                        if (result >= 7) {
                            System.out.println("Aprobó." + result);
                        } else {
                            System.out.println("Reprobó." + result);
                        }

                    }
                } else {
                    System.out.println("Bueno");
                }
                //Karla
            } else if (Alumno.equals("2")) {

                System.out.println("Has elegido a Karla \n.");

                pregunta = JOptionPane.showInputDialog("¿Quieres introducir sus calificaciones?");

                if (pregunta.equals("si")) {
                    int i = 0;

                    for (i = 0; i <= Calificacion.length; i++) {
                        Calificacion[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las calificaciones mayores a 5: "));
                        cont = cont + Calificacion[i];

                        System.out.println("Aqui esta la calificacion: " + Calificacion[i]);

                        result = cont / 5;
                        if (result >= 7) {
                            System.out.println("Aprobó." + result);
                        } else {
                            System.out.println("Reprobó." + result);
                        }

                    }
                } else {
                    System.out.println("Bueno");
                }

            } else if (Alumno.equals("3")) {
                //Christian
                System.out.println("Has elegido a Christian \n.");

                pregunta = JOptionPane.showInputDialog("¿Quieres introducir sus calificaciones?");

                if (pregunta.equals("si")) {
                    int i = 0;

                    for (i = 0; i <= Calificacion.length; i++) {
                        Calificacion[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las calificaciones mayores a 5: "));
                        cont = cont + Calificacion[i];

                        System.out.println("Aqui esta la calificacion: " + Calificacion[i]);

                        result = cont / 5;
                        if (result >= 7) {
                            System.out.println("Aprobó." + result);
                        } else {
                            System.out.println("Reprobó." + result);
                        }

                    }
                } else {
                    System.out.println("Bueno");
                }
            }
        } while (Alumno == "");

        System.out.println("No has elegido a nadie. Vuelve a elegir");
    }
}
