package Arreglo;

public class ActividadArreglo2 {

     public static  String Regiones[] = { "Almenara", "Rebagliati",  "Sabogal", "Junin"  , "Lambayeque", "Cajamarca",  "Huancavelica" };
    public static int Renales[] = {356,317,312,48,58,49,43};
    public static int Pulmonares [] = {405,412,427,37,38,36,33};

    public static void main(String[] args) {
System.out.println(CantidaEnfermedad("pulmonar"));
        System.out.println(TipoEnfermedad("pulmonar"));
        String Sede="Rebagliati";
        int Cantidad[] = CantidadPaciente(Sede);

        //System.out.println(Cantidad[0]);
        System.out.println("En la red "+ Sede  + " hay " + Integer.toString(Cantidad[0]) + " pacientes con enfermedad Renal y " + Integer.toString(Cantidad[1]) + " pacientes con enfermedad pulmonar" );

    }
public static int CantidaEnfermedad ( String TipoEnfer){
    int contador=0;
    int [] enfermedad = new int[0];
    if (TipoEnfer=="renal" ){
        enfermedad=Renales;
    }else {
        enfermedad=Pulmonares;
    }
    for (int i = 0; i < enfermedad.length; i++){
        contador = enfermedad[i]+contador;
    }
        return contador;
}

    public static String TipoEnfermedad ( String TipoEnfer){
        int indice=0;
        int mayor=0;
        int [] enfermedad = new int[0];
        if (TipoEnfer=="renal" ){
            enfermedad=Renales;
        }else {
            enfermedad=Pulmonares;
        }
        for (int i = 0; i < enfermedad.length; i++){
            if (mayor<enfermedad[i]){
                mayor=enfermedad[i];
                indice=i;
            }
        }
        return Regiones[indice];
    }

    public static int [] CantidadPaciente ( String Sede){
        int indice=0;

        for (int i = 0; i < Regiones.length; i++){
            if (Sede==Regiones[i]){
                indice=i;
            }
        }
        return new int[] {Renales[indice],Pulmonares[indice]};
    }

}
