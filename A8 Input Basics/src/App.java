// Richmond Meana
// Mr. Folk
// Input Basics
// 24 September 2024

import static java.lang.System.*;
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(in);
        int num1;
        int num2;
        double num1d;
        double num2d;
        out.print("Whats your integer: ");
        num1 = keys.nextInt();
        out.println("Integer 1: " + num1);
        out.print("Whats your second integer: ");
        num2 = keys.nextInt();
        out.println("Integer 2: " + num2);
        out.print("Whats your double: ");
        num1d = keys.nextDouble();
        out.println("Double 1: " + num1d);
        out.print("Whats your second double: ");
        num2d = keys.nextDouble();
        out.println("Double 2: " + num2d);
        out.println("Your integer total is: " + (num1 + num2));
        out.println("Your double total: " + (num1d + num2d));
        keys.close();


        
    }
}
