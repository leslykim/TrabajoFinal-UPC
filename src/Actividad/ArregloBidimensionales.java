package Actividad;

import java.util.Scanner;

public class ArregloBidimensionales {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int [][] numeros= new int[2][3];
        int[] mayorf= new int[2];
        int [] mayorc = new int[3];
        System.out.println("Ingrese una matriz de 2x3 ");
        for (int i=0; i<2; i++)
            for (int j=0;j<3;j++) {
            System.out.print("Ingrese numero para ["+i+"]["+j+"]:");
            numeros[i][j]=Integer.parseInt(Leer.nextLine());
            }
        mayorf[0]=numeros[0][0];
        mayorc[0]=numeros[0][0];
        for (int e=0; e<2; e++)
            for (int f=0;f<3;f++)
                if (numeros[e][f]>mayorf[e])
                    mayorf[e]=numeros[e][f];
        System.out.print("\n"); //mayor elemento por filas
        for (int g=0;g<2;g++)
            System.out.println("El mayor numero de la fila " + (g+1) + " es: "+mayorf[g]); //mayor elemento por columnas
        for (int h=0; h<3; h++)
            for (int i=0; i<2; i++)
                if (numeros[i][h]>mayorc[h])
                    mayorc[h]=numeros[i][h];
        System.out.print("\n");
        for (int j=0; j<3; j++)
            System.out.println("El mayor numero de la columna" + (j+1)+ "es : " + mayorc[j]);
            }
    }

