package Actividad;

public class Prueba1LMVH {
    public static void main(String[] args) {
        System.out.println(obtenermontopartido(10));
        System.out.println(PremioEtapaSuperada(11));
        System.out.println(montototalporpartido(11));
        System.out.println(montototal(11));
    }

    public static int obtenermontopartido( int numeropartido){
        int montopartido=0;
        if (numeropartido==13){
            montopartido=15000;
        }else if (numeropartido>=11 && numeropartido<=12){
            montopartido=8000;
        }else if (numeropartido>=9 && numeropartido<=10){
            montopartido=4000;
        }else if (numeropartido>=7 && numeropartido<=8){
            montopartido=2000;}
        else if (numeropartido>=1 && numeropartido<=6){
            montopartido=1000;}
        return montopartido;
    }

    public static int PremioEtapaSuperada (int numeroPartido){
        int premio=0;
        if (numeroPartido==13){
            premio=25000;
        } else if (numeroPartido == 11) {
            premio=15000;
        }else if (numeroPartido==9){
            premio=8000;
        }else if (numeroPartido==7){
            premio=4000;
        }
        return premio;
    }

    public static int montototalporpartido (int numeropartido){
        int total=0;
        for (int i=1;i<=numeropartido;i++){
            total=total+obtenermontopartido(i);
        }
        return total;
    }
    public static int montototal (int numeropartido){
        int total=0;
        for (int i=1;i<=numeropartido;i++){
            total=total+PremioEtapaSuperada(i);
        }
        return total+montototalporpartido(numeropartido);
    }
}
