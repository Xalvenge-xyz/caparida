
package activity1;
import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Airfare");
        System.out.println("===================");
        System.out.println("Price");
        System.out.println("===================");
        System.out.println("Class 1:Economy Class - ₱250");
        System.out.println("Class 2:Business Class -₱500");
        
        System.out.println("Input");
        System.out.print("Distance (km): ");
        int dis = input.nextInt();
        System.out.print("Class: ");
        int clas = input.nextInt();
        
        int eco = 250;
        int bus = 500;
        double total = 0.0;
        
        switch(clas){
            case 1:
                System.out.print("Total fare: ₱" +(dis * eco));
                break;
            case 2:
                total = dis * bus;
                if(1000 < dis){
                    double dc = total * 0.10;
                    total -= dc;
                     System.out.printf("Total fare for Business Class: ₱%.2f\n", total);                    
                }else{
                    System.out.print("Total fare: ₱" +(dis * bus));
                }
                break;
            default:
                System.out.println("Invalid Class");
                break;
        }
    }
    
}
