import java.lang.Math;
public class Geometry {
    // Perimeter of a rectangle
    public void perimeter(double len1, double wid1) {
        double riyk = len1; 
        double riyk2 = wid1; 
        double per1ans = ((riyk + riyk2) * 2);  
        System.out.println("The perimeter is: " + per1ans);
    }

    // Surface area of a cube
    public void surfaceArea(double side) {
        double riyk3 = side;
        double SA1ans = (((riyk3 * riyk3)) * 6);
        System.out.println("The surface area is: " + SA1ans);
    }

    // Area of a circle
    public void circleArea(double radius) {
        double riyk4 = radius;
        double cir1ans = ((Math.PI * (riyk4 * riyk4)));
        System.out.printf("The circle area is: " + "%.2f" , cir1ans);
    }
}
