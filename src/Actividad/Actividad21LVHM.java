package Actividad;

import java.util.Scanner;

public class Actividad21LVHM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantidadAlumnos;
        System.out.println("Asignar cantidad de Alumnos");
        cantidadAlumnos=scan.nextInt();
        System.out.println("Costo del Bus");
        System.out.println(PagoAutobus(cantidadAlumnos));
        System.out.println("Costo por Alumno");
        System.out.println(CostoAlumno(cantidadAlumnos));
    }

    public static int PagoAutobus( int cantidadAlumnos){
        int costo;
        if (cantidadAlumnos>=100 ){
            costo=65*cantidadAlumnos;
        }else if (cantidadAlumnos >=50 && cantidadAlumnos<=99){
            costo=70*cantidadAlumnos;
        }else if (cantidadAlumnos >=30 && cantidadAlumnos<=49) {
            costo = 95 * cantidadAlumnos;
        } else {
            costo=4000;
        }
        return costo;
    }
    public static int CostoAlumno ( int cantidadAlumno){
        int costo=PagoAutobus(cantidadAlumno);
        int costoxAlumno=costo/cantidadAlumno;
        return costoxAlumno;
    }
}
