package Actividad;

import java.util.Scanner;

public class ActividadLeslyVera {

        public static void main(String[] args) {
            // Caja valida
            System.out.println(getVolumenCaja(30, 2, 10));
            System.out.println(validarEnvaseCaja(30, 2, 10));

            //Caja no valida

            System.out.println(getVolumenCaja(30, 20, 10));
            System.out.println(validarEnvaseCaja(30, 20, 10));

            // Cono valido

            System.out.println(getVolumenCono(30, 20));
            System.out.println(validarEnvaseCono(30, 20));

            // Cono no valido

            System.out.println(getVolumenCono(30, 2));
            System.out.println(validarEnvaseCono(30, 2));

            // Ingresar valores

            System.out.println(Validarvaloringresado("cono"));
            System.out.println(Validarvaloringresado("caja"));
        }

        public static double getVolumenCaja(int ladoa, int ladob, int ladoc) {
            double volumen = 0;
            if (ladoa * ladob * ladoc >= 500 && ladoa * ladob * ladoc <= 1200) {
                volumen = ladoa * ladob * ladoc;
            } else {
                System.out.println("Numeros ingresado incorrectos");
            }
            return volumen;
        }

        public static double getVolumenCono(int radio, int altura) {

            double volumenC = 0;

            if ((radio * altura * 3.14) / 3 >= 500 && (radio * altura * 3.14) / 3 <= 1200) {
                volumenC = (radio * altura * 3.14) / 3;
            } else {
                System.out.println("Numeros ingresado incorrectos");
            }
            return volumenC;
        }

        public static String validarEnvaseCaja(int ladoa, int ladob, int ladoc) {

            String envasev = "";

            double volumenv2 = 0;

            if (ladoa * ladob * ladoc >= 500 && ladoa * ladob * ladoc <= 1200) {

                volumenv2 = ladoa * ladob * ladoc;
                envasev = "Envase valido";

            } else {
                envasev = "Envase no valido";
            }

            return envasev;
        }

        public static String validarEnvaseCono(int radio, int altura) {

            String envasev1 = "";

            double volumenv3 = 0;

            if ((radio * altura * 3.14) / 3 >= 500 && (radio * altura * 3.14) / 3 <= 1200) {

                volumenv3 = (radio * altura * 3.14) / 3;
                envasev1 = "Envace valido";

            } else {
                envasev1 = "Envase no valido";
            }

            return envasev1;
        }


        public static String Validarvaloringresado(String nombre2) {

            String mensajevalidado = "";

            if (nombre2 == "cono") {

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingresar valores:");

                int radio1 = scan.nextInt();
                int altura1 = scan.nextInt();

                double volumenv4 = 0;

                String envasev2 = "";

                if ((radio1 * altura1 * 3.14) / 3 >= 500 && (radio1 * altura1 * 3.14) / 3 <= 1200) {

                    volumenv4 = (radio1 * altura1 * 3.14) / 3;
                    mensajevalidado = "Envace valido";

                } else {
                    mensajevalidado = "Envase no valido";
                }


            } else if (nombre2 == "caja") {

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingresar valores:");

                int ladoe = scan.nextInt();
                int ladof = scan.nextInt();
                int ladog = scan.nextInt();

                double volumen5 = 0;

                if (ladoe * ladof * ladog >= 500 && ladoe * ladof * ladog <= 1200) {
                    volumen5 = ladog * ladoe * ladof;
                    mensajevalidado = "Envase valido";
                } else {
                    mensajevalidado = "Envase no valido";
                }

            }

            return mensajevalidado;
        }

    }

