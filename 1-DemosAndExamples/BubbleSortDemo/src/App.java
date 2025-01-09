public class App {
    public static void main(String[] args) throws Exception {
        int[] numList = {5,15,3,8,9,1,20,7};
        //printing the original list
        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i]);
        }

        //overwriting with the sorted list
        numList = selsort(numList);

        //printing sorted data
        System.out.println("\nThe sorted version is:");
        numList = selsort(numList);
    }
    public static int [] selsort(int[] nums) {
        int n = nums.length;


        for (int i = 0; i < nums.length; i++) {
            //find the minimum element in the array
            //assume i is the min to start
            int minIdx = i;
            for (int j = 0; j < nums.length - i + 1; j++) {
                System.out.println("J is " + nums[j] + "; min is " + nums);
                if (nums[j] < nums[minIdx]) {
                    minIdx = j; //overrite min if j is smaller than current
                    System.err.println("New MIN");
                }
            }
            //swap the foundm inimum element with first element
            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
            System.out.println("SWAP, end of cycle " + i);
        }

        return nums; 
    }

}
