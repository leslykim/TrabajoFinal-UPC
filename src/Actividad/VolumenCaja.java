package Actividad;

public class VolumenCaja {
    public static void main(String[] args) {
        System.out.println(descuentoTalleres(1));
        System.out.println(descuentoTalleres(4));
        System.out.println(descuentoTalleres(7));
        System.out.println(descuentoTalleres(12));
        System.out.println(descuentoReferidos(1));
        System.out.println(descuentoReferidos(3));
        System.out.println(descuentoReferidos(6));
        System.out.println(descuentoReferidos(12));
        System.out.println(costoTalleres(1000, 5, 2));
    }

    public static double descuentoTalleres(int cantidad) {
        double descuento = 0;
        if (cantidad >= 2 && cantidad <= 4) {
            descuento = 0.05;
        } else if (cantidad >= 5 && cantidad <= 7) {
            descuento = 0.10;
        } else if (cantidad >= 8 && cantidad <= 10) {
            descuento = 0.15;
        }
        return descuento;
    }

    public static double descuentoReferidos(int cantReferidos) {
        double descuento = 0;
        if (cantReferidos >= 2 && cantReferidos <= 5) {
            descuento = 0.07;
        } else if (cantReferidos >= 6 && cantReferidos <= 8) {
            descuento = 0.10;
        } else if (cantReferidos >= 9 && cantReferidos <= 10) {
            descuento = 0.12;
        }
        return descuento;
    }

    public static double costoTalleres(double precioTaller,
                                       int cantidadTalleres, int cantidadReferidos) {
        double costo = 0;
        double dsctoTalleres = descuentoTalleres(cantidadTalleres);
        double dsctoReferidos = descuentoReferidos(cantidadReferidos);
        costo = cantidadTalleres * precioTaller;
        costo = costo * (1 - dsctoTalleres);
        costo = costo * (1 - dsctoReferidos);
        if (cantidadReferidos == 9 || cantidadReferidos == 10) {
            costo = costo - 20;
        }
        return costo;
    }

}

