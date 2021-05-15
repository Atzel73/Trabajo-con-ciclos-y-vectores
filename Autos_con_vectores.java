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
public class Autos_con_vectores {

    public static void main(String[] args) {
        int Auto = 0;
        int contador = 0;
        int pregunta = 0;
        int contador2 = 0;
        int precio = 0;
        //La longitud son los autos que comprará
        pregunta = Integer.parseInt(JOptionPane.showInputDialog("Elige la marca del auto: \n 1.-Ford \n 2.-Nissan \n 3.-Toyota"));
        //Ford
        if (pregunta == 1) {
            int Longitud = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos automoviles quieres comprar?"));
            int PreciosAutos[] = new int[Longitud];
            int PrecioFinal[] = new int[PreciosAutos.length];
            int i;
            for (i = 0; i <= Longitud; i++) {
                contador =  contador + Longitud;
                 precio = Integer.parseInt(JOptionPane.showInputDialog("Precio a pagar: "));
                int FinalFord = precio * contador;
                System.out.println("Aqui esta el total a pagar por cada auto: " + FinalFord);
            }

        }else   if (pregunta == 2) {
            //Toyota
            int Longitud = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos automoviles quieres comprar?"));
            int PreciosAutos[] = new int[Longitud];
            int PrecioFinal[] = new int[PreciosAutos.length];
            int i;
            for (i = 0; i <= Longitud; i++) {
                contador =  contador + Longitud;
                 precio = Integer.parseInt(JOptionPane.showInputDialog("Precio a pagar: "));
                int FinalToyota = precio * contador;
                System.out.println("Aqui esta el total a pagar por cada auto: " + FinalToyota);
            }

        }else   if (pregunta == 3) {
            int Longitud = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos automoviles quieres comprar?"));
            int PreciosAutos[] = new int[Longitud];
            int PrecioFinal[] = new int[PreciosAutos.length];
            int i;
            for (i = 0; i <= Longitud; i++) {
                contador =  contador + Longitud;
                 precio = Integer.parseInt(JOptionPane.showInputDialog("Precio a pagar: "));
                int FinalNissan = precio * contador;
                System.out.println("Aqui esta el total a pagar por cada auto: " + FinalNissan );
            }

        }else if (pregunta != 1 || pregunta != 2 || pregunta != 3){
            System.out.println("Gracias. Vuelva pronto. ");
        }

    }
}
