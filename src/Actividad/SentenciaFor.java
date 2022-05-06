package Actividad;

public class SentenciaFor {
    public static void main(String[] arg) {
        //(Utilizando for) suma de pares e impare de los numeros comprendidos entre 1 -200
        int valor = 0, spar = 0, simpar = 0;
        for (int i = 1; i <= 200; i++) {
            valor = i % 2;
            if (valor == 0)
                spar = spar + i;
            else
                simpar = simpar + i;
        }
        System.out.println("La suma de numeros pares es: " + spar);
        System.out.println("La suma de numeros impares es: " + simpar);
    }
}
