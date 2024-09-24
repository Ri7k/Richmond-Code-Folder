import java.util.Scanner; //Imports the scanner class into the program



public class App {
    public static void main(String[] args) throws Exception {

        Scanner keys = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        keys.nextLine();
        System.out.println("You selected the number " + num);

        System.out.print("wWhat is your name? ");
        String name = keys.nextLine();
        System.out.println("You entered: " + name);
        keys.close();
    }
}
