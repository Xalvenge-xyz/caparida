package BankMain;

import java.util.Scanner;
import banking.bankingClass;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int attempt = 0;
        int MaxAttpmt = 4;
        
        
        switch(choice){
            
            case 1:
                
                while (attempt <= MaxAttpmt){
                bankingClass bc = new bankingClass();
                
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        System.out.println("INVALID ACCOUNT!");
                    }
                    if (attempt <= MaxAttpmt){
                     System.out.println("Too many Attempts!");
                 }
                    
                }System.exit(0);
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
                
        
         }
       
    }
    
}
