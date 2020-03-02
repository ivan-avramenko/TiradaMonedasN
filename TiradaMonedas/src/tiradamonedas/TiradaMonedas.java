/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiradamonedas;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class TiradaMonedas {


    /**
     *
     * @param contadorCaras the value of contadorCaras
     * @param contadorCruces the value of contadorCruces
     * @param maximoCarasDoblesConsecutivas the value of maximoCarasDoblesConsecutivas
     * @param maximoCrucesDoblesConsecutivas the value of maximoCrucesDoblesConsecutivas
     */
    public static void Imprime(int contadorCaras, int contadorCruces, int maximoCarasDoblesConsecutivas, int maximoCrucesDoblesConsecutivas) {
        System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
        System.out.println("Maximo de caras dobles consecutivas: " + maximoCarasDoblesConsecutivas);
        System.out.println("Maximo de cruces dobles consecutivas: " + maximoCrucesDoblesConsecutivas);
    }

}
