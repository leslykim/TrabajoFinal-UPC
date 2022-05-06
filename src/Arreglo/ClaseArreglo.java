package Arreglo;

public class ClaseArreglo {
    public static void main(String[] args) {
        //Forma 1
        int[] nota;

        nota = new int[6];
        nota[0] = 12;
        nota[1] = 16;
        nota[2] = 19;
        nota[3] = 17;
        nota[4] = 14;
        nota[5] = 20;
        // nota[6]=20; si el arreglo tiene tamaño 6, el indice llega hasta el 5
//Forma 2
        String nombre[] = new String[3];
        nombre[0] = "Raul";
        nombre[1] = "Maria";
        nombre[2] = "Emma";
        System.out.println("El arreglo nombre tiene  " + nombre.length + "Elementos");

        //Forma 3
        int promedios[] = {11, 20, 14, 8, 7, 15, 16, 13};
        System.out.println("El arreglo nombre tiene  " + promedios.length + "Elementos");
        System.out.println((promedios[3]));

        for (int i = 0; i < promedios.length; i++) {
            System.out.println((promedios[i]));
        }
        System.out.println("El promedio es:" + hallarpromedio(promedios));

    }

    public static double hallarpromedio(int[] notas) {
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio = promedio + notas[i];
        }
        promedio=promedio/notas.length;
        return  promedio;
    }

}
