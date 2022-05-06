package Actividad;
import java.util.concurrent.locks.Condition;
public class doWhile {
    public static void main(String[]arg)
    {
        int numero = 0;
        do {
            numero = numero + 1;
            System.out.println("\t" + numero);
        }
        while(numero<10);
        System.out.println("\tFin del programa" );
    }
}
