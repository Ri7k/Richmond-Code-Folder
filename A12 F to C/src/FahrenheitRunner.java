/*Richmond Meana 
Mr. Fox
10/8/2024
Celcius to fahrenheit code runner
*/
import java.util.Scanner; 
public class FahrenheitRunner {
public static void main(String[] args) throws Exception {
    Scanner keys = new Scanner(System.in); 
    System.out.print("Enter temperature: ");

    Double num1 = keys.nextDouble();
    Fahrenheit test = new Fahrenheit();
    test.setNums(num1);
    test.sum();
    test.print();
    keys.close();
    }   
}