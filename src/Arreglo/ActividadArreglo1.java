package Arreglo;

public class ActividadArreglo1 {
    public static void main(String[] args) {

        double nota [] = {15, 17.5, 20, 13, 19, 12.5, 10, 12.6, 14,15.5};
    System.out.println("Total de Alumnos Aprobados ");
        System.out.println(AlumnoAprobados(nota));
        System.out.println("Promedio del Salón ");
        System.out.println(PromedioNota(nota));
        PorcentajeAlumnos(nota);
        double menormayo [] = MayorMenorNota(nota);
        System.out.println("Mayor Nota del Salon ");
        System.out.println(menormayo[0]);
        System.out.println("Menor Nota del Salon ");
        System.out.println(menormayo[1]);
    }

    public static int AlumnoAprobados ( double[] nota  ){
    int contador=0;
    for (int i = 0; i < nota.length; i++) {
        if (nota[i] >=13) contador++;
    }
  return contador;
    }

    public static double PromedioNota ( double[] nota){
        double contador=0;

        for (int i = 0; i < nota.length; i++) {
            contador = nota[i]+ contador;
        }
        return contador/nota.length;

        }

        public static void PorcentajeAlumnos ( double [] nota) {
            double cantidadAprobados = AlumnoAprobados(nota);
            double CantidadAlumnos = nota.length;
            double cantidadDesaprobados = CantidadAlumnos - cantidadAprobados;
            double porcentajeAprobado = (cantidadAprobados * CantidadAlumnos) / 100;
            double porcentajeDesaprobado = (cantidadDesaprobados * CantidadAlumnos) / 100;
            System.out.println("Porcentaje de Alumnos Aprobados ");
            System.out.println(porcentajeAprobado *100.00);
            System.out.println("Porcentaje de Alumnos Desaprobados ");
            System.out.println(porcentajeDesaprobado*100.00);
        }
        public static double[] MayorMenorNota(double [] nota){
         double notamayor=0;
         double notamenor=20;
         for (int i = 0; i < nota.length; i++){
             if (notamayor<nota[i]){
                 notamayor=nota[i];
             }
             if (notamenor>nota[i]){
                 notamenor=nota[i];
             }
         }
         return new double[] {notamayor,notamenor};
        }

}
