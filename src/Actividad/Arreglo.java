package Actividad;


import java.util.Scanner;

public class Arreglo {
    //Ejemplos

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int []notas=new int[6];
        for (int i=0; i <6; i++){
            System.out.print("Ingrese una nota " +  (i+1) + " : ");
            notas[i]= Integer.parseInt(Leer.nextLine());
        }
        System.out.println("\nLas notas ingresadas son : \n");
        for (int i=0;i<6;i++){
            System.out.println("nota " + (i+1)+" -> "+notas[i]);
        }
    }
}
