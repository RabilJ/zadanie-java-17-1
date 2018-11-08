public class ValueCalculator {
    public static double MetersToCentimeters(double lenght){
        return lenght*100;
    }
    public static double MetersToMilimeters(double lenght){
        return lenght*1000;
    }
    public static double CentimetersToMeters(double lenght){
        return lenght/100;
    }
    public static double CentimetersToMilimeters(double lenght){
        return lenght*10;

    }
    public static double MilimetersToMeters(double lenght){
        return lenght/1000;
    }
    public static double MilimetersToCentimeters(double lenght){
        return lenght/10;
    }



    public static double GramsToKilograms(double amount){
        return amount/1000;
    }
    public static double GramsToMiligrams(double amount){
        return amount*1000;
    }
    public static double KilogramsToGrams(double amount){
        return amount*1000;
    }
    public static double KilogramsToMiligrams(double amount){
        return amount*1000000;

    }
    public static double MiligramsToGrams(double amount){
        return amount/1000;
    }
    public static double MiligramsToKilograms(double amount){
        return amount/1000000;
    }

}
