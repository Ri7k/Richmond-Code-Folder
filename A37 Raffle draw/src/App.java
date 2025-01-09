// Richmond Meana
// Mr Fox
// 12/11/2024
// A37 - Reverse Raffle draw 

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
      List<String> hatNames = new ArrayList<>();
      Scanner myNames = new Scanner(System.in);
      int i = 0;
      while (i < 10){
        System.out.println("add a name");
        String a = myNames.nextLine();
        hatNames.add(a);
        i++;
      }
      System.out.println(hatNames);
      int f = 10;
      Random rand = new Random();
      while (f > 1){
        for (int u = 0; u <= 10; i++){
          int ranInt = rand.nextInt(9 - u);
          String elimName = hatNames.remove(ranInt);
          System.out.println(elimName);
        }
        f--;
      }
      System.out.println(hatNames);
    }
}


//future ricmond: look at array lists demo to add names to hatArrayList
