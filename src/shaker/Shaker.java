/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisj
 */
public class Shaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        Shaker ord = new Shaker();

        int arreglo[], nElementos;

        System.out.println("Escribe en numero de elementos");
        entrada = bufer.readLine();
        nElementos = Integer.parseInt(entrada);

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            entrada = bufer.readLine();
            arreglo[i] = Integer.parseInt(entrada);
        }
        ord.ordenar(arreglo);
    }

    public void ordenar(int[] datos) {
        int tam = datos.length;
        int limInf = 0;
        int limSup = tam - 1;
        while (limInf <= limSup) {
            for (int i = limSup; i > limInf; i--) {
                if (datos[i] < datos[i - 1]) {
                    int aux = datos[i];
                    datos[i] = datos[i - 1];
                    datos[i - 1] = aux;
                }
            }
             limInf++;
            for(int i = limInf;i<limSup;i++){
                if(datos[i]>datos[i+1]){
                    int aux = datos[i];
                    datos[i] = datos[i+1];
                    datos[i+1] = aux;
                }
            }
            limSup--;
        }
        mostrar(datos);

    }
    public void mostrar(int [] datos){
        System.out.println("Datos ordenados");
        for(int i =0; i<datos.length;i++){
            System.out.print(datos[i]+" - ");
            }
        }   
    }
