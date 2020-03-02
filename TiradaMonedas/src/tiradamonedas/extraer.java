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
public class extraer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //las variables a y b servirán para guardar el resultado de la tirada de dos monedas
        int resultadoA;
        int resultadoB;
        int contadorCaras = 0;
        int contadorCruces = 0;
        int numTiradas;
        //las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
        int cont1 = 0;
        int cont2 = 0;
        int maximoCarasDoblesConsecutivas = 0;
        int maximoCrucesDoblesConsecutivas = 0;
        boolean esCruzDoble = false;
        boolean esCaraDoble = false;
        String tirada1;
        String tirada2;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce el n\u00famero de veces que se van a lanzar las monedas (max 50): ");
            numTiradas = teclado.nextInt();
        } while (numTiradas < 1 || numTiradas > 50);
        for (int i = 0; i < numTiradas; i++) {
            resultadoA = (int) (Math.random() * 2);
            resultadoB = (int) (Math.random() * 2);
            if (resultadoA == 0) {
                contadorCaras++;
                tirada1 = "cara";
            } else {
                contadorCruces++;
                tirada1 = "cruz";
            }
            if (resultadoB == 0) {
                contadorCaras++;
                tirada2 = "cara";
            } else {
                contadorCruces++;
                tirada2 = "cruz";
            }
            System.out.println("Moneda 1: " + tirada1 + ", Moneda 2: " + tirada2);
            if (resultadoA == resultadoB) {
                if (resultadoA == 0) {
                    esCaraDoble = true;
                    esCruzDoble = false;
                } else {
                    esCaraDoble = false;
                    esCruzDoble = true;
                }
            } else {
                esCaraDoble = false;
                esCruzDoble = false;
            }
            if (esCaraDoble) {
                cont1++;
                if (cont1 > maximoCarasDoblesConsecutivas) {
                    maximoCarasDoblesConsecutivas = cont1;
                }
            } else {
                cont1 = 0;
            }
            if (esCruzDoble) {
                cont2++;
                if (cont2 > maximoCrucesDoblesConsecutivas) {
                    maximoCrucesDoblesConsecutivas = cont2;
                }
            } else {
                cont2 = 0;
            }
        }
        TiradaMonedas.Imprime(contadorCaras, contadorCruces, maximoCarasDoblesConsecutivas, maximoCrucesDoblesConsecutivas);
    }
    
}
