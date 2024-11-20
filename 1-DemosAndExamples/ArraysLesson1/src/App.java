public class App {
    public static void main(String[] args) throws Exception {
        //Declare the array
        //int [] scores = null;
        //String[] names = null;
        //Create or Initialize Array
        //scores = new int[10];
        //names = new String[10];

        //Assign values of array
        //list of data (solution set)
        String[]names = {"wolf", "sutter", "cook", "fox", "golden", };
        int[] scores = {9000, 7081, 1233, 5234, 6544}; 

        //individual positions
        names[0] = "Wolf";
        scores[0] = 9000; 

        //array length property
        System.out.println("Scores length is " + names.length);
        //outputting or accessing arrays
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
        //reverse
        for (int i = names.length-1; i >= 0; i--)
            System.out.println(i + ")");
        //find the sum of the array
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("The sunm is: " + sum);
        //count elememts of an array (eg. even numbers)
        int count = 0;
        for(int i = 0; i<scores.length; i++)
            if(scores[i] % 2 == 0 ){ 
                count++; 
            }
    }
}
