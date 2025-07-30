
package activity1;
import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      String name;
      double ave;
      int subjects, total;
      int sub1;
      int sub2;
      int sub3;
 
      
      System.out.print("Enter Student Name: ");
      name = sc.nextLine();
      
      System.out.print("Enter number of subjects: ");
      subjects = sc.nextInt();
      
      System.out.print("Enter grade for sub1: ");
      sub1 = sc.nextInt();
      
      System.out.print("Enter grade for sub2: ");
      sub2 = sc.nextInt();
      
      System.out.print("Enter grade for sub3: ");
      sub3 = sc.nextInt();
      
      
      total = sub1 + sub2 + sub3;
      ave = total / subjects;
      
      
      for(int i = 0; i <= subjects; i++){
         
         }
      
      System.out.printf("Average: %.2f", ave);
      if(ave >= 75){
        System.out.print("\nREMARKS: PASSED");
    }else {
          System.out.print("\nREMARKS: FAIL");
      }
    }
    
}
