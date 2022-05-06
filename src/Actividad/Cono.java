package Actividad;

public class Cono {
    private double radio;
    private double alto;
    private static double Pi = 3.14;

    public Cono(double radio, double alto) {
        this.radio = radio;
        this.alto = alto;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getVolumen() {
        return (( Pi * Math.pow(radio,2) * alto)/3);
    }

    public boolean validar() {
        double volumen = getVolumen();
        return (volumen >= 500 && volumen <= 1200)
                ? true
                : false;
    }
}
