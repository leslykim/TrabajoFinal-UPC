package Actividad;

import java.util.Scanner;

public class Actividad22LVHM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oral, escrito;
        System.out.println("Nota del Examen Oral");
        oral=scan.nextInt();
        System.out.println("Nota del Examen Escrito");
        escrito=scan.nextInt();

        System.out.println("Nivel ");
        System.out.println(nivel(escrito, oral));
        System.out.println("Costo");
        System.out.println(precio(escrito, oral));
    }

    public static String nivel(int escrito, int oral) {
        String nivel1="Basico";

        if (escrito >= 90 && oral > 80) {
            nivel1 = "Avanzado";
        } else if (escrito > 70 && oral >= 50) {
            nivel1 = "Intermedio";
        }else if (escrito <=70 && oral < 50) {
            nivel1 = "Basico";
        }
        return nivel1;
    }

    public static int precio(int escrito, int oral){

      int precio1=180;
        if (escrito >= 90 && oral > 80) {
            precio1 = ((escrito > 95 && oral > 95 )
                        ? 220
                        : 250);
        } else if (escrito > 70 && oral >= 50) {
            precio1 = ((escrito > 75 && oral > 75 )
                    ? 200
                    : 220);
        }else if (escrito <=70 && oral < 50) {
            precio1 = ((escrito > 40 && oral > 40 )
                    ? 160
                    : 180);;
        }
        return precio1;
    }
}
