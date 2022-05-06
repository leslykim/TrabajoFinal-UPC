package Actividad;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(30,30,1);
        Cono cono = new Cono(3, 3);

        System.out.println("Caja");
        System.out.println(caja.getVolumen());
        System.out.println(caja.validar());

        System.out.println("Cono");
        System.out.println(cono.getVolumen());
        System.out.println(cono.validar());

        System.out.println("Caja");
        System.out.println(
                crearEnvase(Envase.Caja, 30, 30 , 1)
        );

        System.out.println("Cono");
        System.out.println(
                crearEnvase(Envase.Cono, 30, 30 , 1)
        );

    }

    private static String crearEnvase(Envase envase, double alto, double ancho_radio, double largo) {
        switch (envase){
            case Caja :
                return new Caja(largo, ancho_radio, alto).validar() ? "ENVASE VALIDO" : "ENVASE NO VALIDO";
            case Cono:
                return new Cono(ancho_radio, alto).validar() ? "ENVASE VALIDO" : "ENVASE NO VALIDO";
            default:
                return "Error";
        }
    }

    private enum Envase {
        Caja,
        Cono
    }
}