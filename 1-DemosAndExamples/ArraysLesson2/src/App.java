import java.util.Scanner;
public class App {
    private static Scanner inp = new Scanner(System.in);
    private static int[] nums = null; //declare the array
    public static void main(String[] args) throws Exception {
        

        System.out.println("How many numbers would you like to input");
        int SIZE = inp.nextInt();

        nums = new int[SIZE];

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Please enter an integer ");
            nums[i] = inp.nextInt();
        }

    printArr();
        }
    
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * 2;
        }
    
    private static void printArr() {
        System.out.println("Your list of numbers ");
        for(int i = 0; i<nums.length; i++) {
                System.out.print(nums[i] + ", ");
        }
    }
}
