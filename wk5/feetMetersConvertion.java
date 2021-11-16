// Assigntment 6.9 - Conversions between feet & meters
// this program will convert feet (1 - 10) to meters & meters (20 - 60) to feet 

public class feetMetersConvertion {
    
    public static void main(String[] argv){
        // print header
        System.out.printf("\n%-8s %-8s %-4s %-8s %s\n", ("Feet"), ("Meter"), ("|"), ("Meter"), ("Feet"));
        System.out.println("---------------------------------------------");

        // declare base amout of meters
        double bMeters = 20.0;

        // use for loop to print the Data
        for(double i = 1.0; i <= 10.0; i++){
            System.out.printf("%-8.1f %-8.3f %-4s %-8.1f %-8.3f\n", i, footToMeter(i), ("|"), bMeters, meterToFoot(bMeters));
            bMeters += 5.0;
        }
        System.out.println("");
    }

    public static double footToMeter(double foot){
        // convert feet to meters
        double meter = 0.305 * foot;

        // return meter
        return meter;
    }

    public static double meterToFoot(double meter){
        // convert meters to feet
        double feet = 3.279 * meter;

        // return feet
        return feet;
    }
    
}
