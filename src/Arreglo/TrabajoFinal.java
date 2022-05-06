package Arreglo;

import java.util.Scanner;

public class TrabajoFinal {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int type = 0;
        int city = 0;
        double [] shippingCost = null;
        double shippingWeight = 0.00;
        double shippingHeight = 0.00;
        double shippingWidth = 0.00;
        double shippingLenght = 0.00;

        System.out.println("Tipo de Paquete");
        System.out.println("----------------");
        System.out.println("1. SOBRE");
        System.out.println("2. PAQUETE");
        System.out.println("----------------");
        do {
            System.out.print("Escoja opcion: ");
            type = keyboard.nextInt();
            if(type != 1 && type != 2) System.out.println("Opcion incorrecta, vuelva a escoger.");
        }while (type != 1 && type != 2);

        System.out.println("Escoja Ciudad");
        System.out.println("--------------");
        for(int i = 0; i < Datos.Cities.length; i++){
            System.out.println(Integer.toString(i+1) + "." + Datos.Cities[i]);
        }
        System.out.println("--------------");

        do {
            System.out.print("Escoja opcion: ");
            city  = keyboard.nextInt();
            if(city <= 0 || city >= Datos.Cities.length +1) System.out.println("Opcion incorrecta, vuelva a escoger.");
            else{
                switch (city){
                    case 1:
                        shippingCost = Datos.ShippingCostCity1;
                        break;
                    case 2:
                        shippingCost = Datos.ShippingCostCity2;
                        break;
                    case 3:
                        shippingCost = Datos.ShippingCostCity3;
                        break;
                    case 4:
                        shippingCost = Datos.ShippingCostCity4;
                        break;
                    default:
                        shippingCost = null;
                        break;
                }
                if(shippingCost == null) System.out.println("Ciudad no cuenta con tarifas configuradas");
            }
        }while ((city <= 0 || city >= Datos.Cities.length +1) || shippingCost == null);

        if(type == 1){
            System.out.println("Costo de envio de sobre: " + Double.toString(shippingCost[0]));
        }else{
            System.out.print("Ingresar Peso del Paquete (KG):");
            shippingWeight = keyboard.nextDouble();
            System.out.println("Ingresar medidas de paquete");
            System.out.println("----------------");
            System.out.print("1. Altura: ");
            shippingHeight = keyboard.nextDouble();
            System.out.print("2. Ancho:");
            shippingWidth = keyboard.nextDouble();
            System.out.print("3. Largo:");
            shippingLenght = keyboard.nextDouble();
            System.out.println("----------------");

            double costCalculate = 0;
            for (int i = 0; i < Datos.ShippingWeight.length; i++) {
                if(Datos.ShippingWeight[i] >= shippingWeight){
                    costCalculate = shippingCost[i];
                    break;
                }
            }
            if(costCalculate == 0.00) costCalculate = shippingCost[shippingCost.length -1];
            System.out.print("Costo de envio:");
            System.out.println(costCalculate);

            // Envio Multiplicando Peso
            // System.out.println(costCalculate * shippingWeight);
        }
    }
}

class Datos {
    public static String [] ShippingType = {
            "Sobre",
            "Paquete Tipo 1",
            "Paquete Tipo 1",
            "Paquete Tipo 2",
            "Paquete Tipo 3",
            "Paquete Tipo 4",
            "Paquete Tipo 5"
    };

    public static int[] ShippingVol = {
            0,
            1000,
            1000,
            1000,
            1000,
            1000
    };

    public static int [] ShippingWeight = {
            0,
            1,
            5,
            10,
            15,
            20
    };

    public static String [] Cities = {
            "Chimbote",
            "Trujillo",
            "Chiclayo",
            "Piura",
            "Tumbes"
    };

    public static double [] ShippingCostCity1 = {
            8.00,
            10.00,
            12.00,
            14.00,
            16.00,
            18.00
    };

    public static double [] ShippingCostCity2 = {
            10.00,
            12.00,
            14.00,
            16.00,
            18.00,
            20.00
    };

    public static double [] ShippingCostCity3 = {
            6.00,
            8.00,
            10.00,
            12.00,
            14.00,
            16.00
    };

    public static double [] ShippingCostCity4 = {
            10.00,
            20.00,
            30.00,
            40.00,
            50.00,
            60.00
    };
    }


