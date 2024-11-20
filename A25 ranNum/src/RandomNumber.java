import java.util.Random; 
public class RandomNumber {
    Random num = new Random(); 
    private int x;
    private int y;

    public void gen() {
        x = num.nextInt();
        y = num.nextInt();
    }
    public void Print() {
        System.out.println("A random first number is: " + x);
        System.out.println("A randomm second number is: " + y + "\n");
    }
    public void compare(){
        if (x < y) {
            System.out.println(y + " is bigger than " + x + "\n");
        }
        else {
            System.out.println(x + " is bigger than " + y + "\n");
        }
    }
}
