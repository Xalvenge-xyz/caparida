
package activity1;

import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        float hr;
        int th;

        System.out.print("Enter employee name: ");
        name = input.nextLine();

        System.out.print("Enter hour rate: ");
        hr = input.nextInt();
        
        System.out.print("Enter total hours worked this week: ");
        th = input.nextInt();
        
        float totalrate = hr * th;
        float sss = totalrate * 0.1f;
        float nw = totalrate - sss;
        
        System.out.print("-------Wage Summary--------");
        
        System.out.print("Employee: " +name);
        System.out.printf("\nHourly Rate: ₱%.2f", hr);
        System.out.print("\nHours Worked: " +th);
        System.out.printf("\nGross Weekly Wage: ₱%.2f", totalrate);
        System.out.printf("\nSSS Contribution (10%%): ₱%.2f", sss);
        System.out.print("\n---------------------------");
        System.out.printf("\nNet Weekly Wage: ₱%.2f", nw);
        
    }
}
