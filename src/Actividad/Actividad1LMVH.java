package Actividad;

import java.util.Locale;
import java.util.Scanner;

public class Actividad1LMVH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tipoEnvase;
        System.out.print("Ingresar tipo de Envase ");
        tipoEnvase=scan.nextLine();
        CajaoCono(tipoEnvase);
        System.out.print("Ingresar tipo de Envase ");
        tipoEnvase=scan.nextLine();
        CajaoCono(tipoEnvase);
       // CajaoCono("C");
    }

    public static double getVolumenCaja(double a, double b, double c) {
        double volumen =  a * b * c;
        return volumen;
    }

    public static double getVolumenCono(double radio, double altura) {

        double volumen =  (Math.PI* Math.pow(radio,2)* altura)/3;
        return volumen;
    }

    public static boolean validarEnvaseCaja( double a, double b, double c){
        double volumen=getVolumenCaja(a, b, c);
        if (volumen>=500 && volumen<=1200){
            return true;
        }else {
            return false;
        }
    }
    public static boolean validarEnvaseCono(double radio, double altura){
        double volumen=getVolumenCono (radio, altura);
        if (volumen>=500 && volumen<=1200){
            return true;
        }else {
            return false;
        }
    }
    public  static void CajaoCono(String TipoEnvase){
        Scanner scan = new Scanner(System.in);
        boolean validar=false;

        if (TipoEnvase.trim().toLowerCase().equals("caja")){
            double a,b,c;
            System.out.println("Ingresar valores de Caja ");
            System.out.print("Ingresar valor a ");
            a=scan.nextDouble();
            System.out.print("Ingresar valor b ");
            b=scan.nextDouble();
            System.out.print("Ingresar valor c ");
            c=scan.nextDouble();
            validar=validarEnvaseCaja(a,b,c);
        }
        if (TipoEnvase.trim().toLowerCase().equals("cono")){
            double radio,altura;
            System.out.println("Ingresar valores de Cono ");
            System.out.print("Ingresar valor Radio ");
            radio=scan.nextDouble();
            System.out.print("Ingresar valor Altura ");
            altura=scan.nextDouble();
            validar=validarEnvaseCono(radio,altura);
        }
        if (validar){
            System.out.println("Envase Válido");
        }else
        {
            System.out.println("Envase No Válido");
        }
    }
}
