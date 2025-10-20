import java.util.Scanner;

public class SpeedConverter {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Eneter kilometers per hour: ");
            double km=sc.nextDouble();

            printConversion(km);

            sc.close();

        }
    
    
    public static long toMilesPerHour(double kilometersPerHour){
        
        if(kilometersPerHour<0){
            return -1;
        }
        
        
        return Math.round(kilometersPerHour/1.609);
        
    }
    
    public static void printConversion(double kilometersPerHour){
        
    
        
    
        if(toMilesPerHour(kilometersPerHour)<0)
        {
         System.out.println("Invalid Value");   
        }else{
        
        System.out.println(kilometersPerHour +" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        } 
    }
}
