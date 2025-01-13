// Richmond Meana
// Mr Fox
// 12/11/2024
// A37 - Reverse Raffle Draw 

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
      List<String> hatNames = new ArrayList<>();
      Scanner myNames = new Scanner(System.in);
      int i = 0;
      System.out.println("Welcome to the Reverse Raffle Draw " + "\nThe name that is last picked will be the winner for this draw!");
      while (i < 10){
        System.out.println();
        System.out.println("Please add a name: ");
        
        String a = myNames.nextLine();
        hatNames.add(a);
        i++;
      }
      System.out.println("This hat contains the names: " + hatNames);

      for(int f = 10; f>1; f--) {
      Random rand = new Random();
      for (int u = 10; u >= 10; u--){
          int ranInt = rand.nextInt(0,hatNames.size());
        String elimName = hatNames.remove(ranInt);
        System.out.println();
        System.out.println("The name " + "\"" + elimName + "\"" + " has been removed");   
      }
    }
      System.out.println();
      System.out.println("The winner of this draw is: " + hatNames);
    }
}


//future ricmond: look at array lists demo to add names to hatArrayList
