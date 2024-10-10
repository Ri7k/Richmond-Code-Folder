// Name: Richmond Meana
// Date: 10/8/2024
// Program Name: Calculating math stuff
// Program Description: calculating perimeter, area, and surface area of of shapes

import java.util.Scanner;
public class GeometryRunner {
    public static void main(String[] args) throws Exception {
        //Import your geometry class, then design your control code
        //make a iof statement if answer is equal to 123/ or make a selection 
        //else if/ WHILE LOOPS( while true )
        Scanner ask = new Scanner(System.in);
        boolean a = true;
        System.out.println("Select a number to pick a calculator: \n1. Perimeter of a rectangle \n2. Surface area of a cube \n3. Area of a circle ");
        double ans = ask.nextDouble();
        while (a){
            if (ans == 1){
                System.out.print("Enter Length: ");
                double len1 = ask.nextDouble();

                System.out.print("Enter Width: ");
                double wid1 = ask.nextDouble();
                Geometry run = new Geometry(); 
                run.perimeter(len1, wid1);
                    break; 
            }
            else if (ans == 2){
                System.out.println("Enter Side length: ");
                double side = ask.nextDouble();
                Geometry run = new Geometry();
                run.surfaceArea(side);
                    break; 
            }
            else if (ans == 3){
                System.out.println("Enter radius: ");
                double radius = ask.nextDouble();
                Geometry run = new Geometry();
                run.circleArea(radius);
                    break;
            }
            else {
                continue;
            }
        }
    }
}


