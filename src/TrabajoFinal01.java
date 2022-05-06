package TrabajoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class TrabajoFinal01 {

        public static String [] DeliveryType = {"Carta", "Paquete"};
        public static String [] City = {"Chimbote","Trujillo","Chiclayo","Piura","Tumbes"};
        public static double [] WeightBaseLetter = {0.5,0.5,0.5,0.5,0.5};
        public static double [] WeightBasePackage = {1,1,1,1,1};
        public static double [] CostBaseLetter = {9,12,13,15,18};
        public static double [] CostBasePackage = {10,15,20,17,19};
        public static double [] CostExcessPackage = {1.5,2,2.5,3,3.5};

        public static String [] MenuOptions = {"Si", "No"};

        public static double Width = 0.00;
        public static double Height = 0.00;
        public static double Large = 0.00;
        public static double Weight = 0.00;
        public static double VolumenMaxCar = 0.00;
        public static double WeightMaxCar = 0.00;
        public static ArrayList<Double> VolumenList = new ArrayList<>();
        public static ArrayList<Double> CostList = new ArrayList<>();
        public static ArrayList<Double> WeightList = new ArrayList<>();

        public static void main(String[] args) {
            VolumenMaxCar = getInKeyboard("Ingrese volumen (M3) del auto :");
            WeightMaxCar = getInKeyboard("Ingrese Peso Maximo (KG) del auto :");
            int nextMenu = 0;
            while(nextMenu == 0){
                System.out.println("Capacidad de auto ");
                System.out.println(String.format("- M3 : %s / %s (%s", getArrayListTotal(VolumenList), VolumenMaxCar, getPorcentage(getArrayListTotal(VolumenList),VolumenMaxCar)) + "%)");
                System.out.println(String.format("- KG : %s / %s (%s", getArrayListTotal(WeightList), WeightMaxCar, getPorcentage(getArrayListTotal(WeightList),WeightMaxCar)) + "%)");
                int type = printMenuType(DeliveryType, "Escoja tipo de envio") - 1;
                int city = printMenuType(City, "Elija ciudad") - 1;

                double finalValue = 0.00;

                if(type == 0){
                    finalValue = getCostCalculateLetter(city);
                }
                else{
                    Weight = getInKeyboard("Ingrese Peso (KG): ");
                    Height = getInKeyboard("Ingrese Altura (CM): ");
                    Large = getInKeyboard("Ingrese Largo (CM): ");
                    Width = getInKeyboard("Ingrese Ancho (CM): ");
                    finalValue = getCostCalculatePackage(city);
                }
                if(finalValue != 0.00){
                    System.out.print("Costo Envio: ");
                    System.out.println(finalValue);
                }else{
                    System.out.println("Paquete excede capacidades maximas del auto");
                    System.out.println("Capacidad de auto ");
                    System.out.println(String.format("- M3 : %s / %s (%s", getArrayListTotal(VolumenList), VolumenMaxCar, getPorcentage(getArrayListTotal(VolumenList),VolumenMaxCar)) + "%)");
                    System.out.println(String.format("- KG : %s / %s (%s", getArrayListTotal(WeightList), WeightMaxCar, getPorcentage(getArrayListTotal(WeightList),WeightMaxCar)) + "%)");
                }

                ResetValues();
                nextMenu = printMenuType(MenuOptions, "¿Desea ingresar otro envio?") - 1;
            }

            System.out.println("Capacidad de auto ");
            System.out.println(String.format("- M3 : %s / %s (%s", getArrayListTotal(VolumenList), VolumenMaxCar, getPorcentage(getArrayListTotal(VolumenList),VolumenMaxCar)) + "%)");
            System.out.println(String.format("- KG : %s / %s (%s", getArrayListTotal(WeightList), WeightMaxCar, getPorcentage(getArrayListTotal(WeightList),WeightMaxCar)) + "%)");
            System.out.println(String.format("Costo total de envios: %s", getArrayListTotal(CostList)));
            // System.out.print("Volumen Total del paquetes : ");
            // System.out.print(getArrayListTotal(VolumenList));
            // System.out.print(" / ");
            // System.out.print(VolumenMaxCar);
            // System.out.print(" (");
            // System.out.print(getPorcentage(getArrayListTotal(VolumenList),VolumenMaxCar));
            // System.out.println("%)");
            // System.out.print("Costo total de envios: ");
            // System.out.println(getArrayListTotal(CostList));
        }

        public static double getCostCalculateLetter(int index){
            VolumenList.add(0.00);
            CostList.add(CostBaseLetter[index]);
            return CostBaseLetter[index];
        }

        public static double getCostCalculatePackage(int index){
            //double weightVol = (Width * Height * Large)/6000.00;
            double vol = (Width/100 * Height/100 * Large/100);
            double finalPrice = CostBasePackage[index];

            //double maxWeight = Weight > weightVol ? Weight : weightVol;
            double maxWeight = Weight;
            maxWeight = maxWeight > WeightBasePackage[index] ? maxWeight - WeightBasePackage[index] : 0;

            double additional = Math.ceil(maxWeight);
            finalPrice = finalPrice + (CostExcessPackage[index] * additional);

            if(verifyLimitCar(vol, maxWeight)){
                return 0.00;
            }

            VolumenList.add(vol);
            WeightList.add(Weight);
            CostList.add(finalPrice);

            return finalPrice;
        }

        public static double getArrayListTotal(ArrayList<Double> List){
            double total = 0.00;
            for (double vol: List) {
                total += vol;
            }
            return total;
        }

        public static double getPorcentage(double quantity, double total){
            return ((quantity*100)/ total);
        }

        public static boolean verifyLimitCar(double volumen, double weight){
            return ( (getArrayListTotal(VolumenList) + volumen) > VolumenMaxCar  || getArrayListTotal(WeightList) + weight > WeightMaxCar );
        }

        public static int printMenuType(String [] Options, String title){
            int result;
            do{
                System.out.println(title);
                System.out.println("==============");
                for (int i = 0; i < Options.length; i++) {
                    System.out.print(i + 1);
                    System.out.print(" - ");
                    System.out.println(Options[i]);
                }
                System.out.println("==============");
                result = (int)getInKeyboard("Elija opcion:");
            }while (Options.length < result && result > 0);
            return result;
        }

        public static double getInKeyboard(String message){
            double result;
            Scanner scanner = new Scanner(System.in);
            System.out.print(message);
            result = scanner.nextDouble();
            return result;
        }

        public static void ResetValues() {
            Width = 0.00;
            Height = 0.00;
            Large = 0.00;
            Weight = 0.00;
        }
    }

