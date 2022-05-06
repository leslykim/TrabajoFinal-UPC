package Actividad;

public class Sentenciawhile {
    public static void main(String[] args) {
        //Usamos while para crear una tabla de multiplicar
       int numero = 8, resultado = 0;
       int cuentaN = 0;
                System.out.println("visualizar la tabla del numero: " + numero);
        while (cuentaN<=12){
            resultado= cuentaN * numero;
            System.out.println(cuentaN +" * " + numero+ "= " + resultado);
            cuentaN++;
        }
    }
}