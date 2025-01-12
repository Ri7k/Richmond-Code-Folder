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

      Random rand = new Random();
      int f = 0;
      if (f > hatNames.size())
      while (hatNames.size() > 1){
        for (int u = 10; u >= 10; u--){
          if (f > hatNames.size()){
            int ranInt = rand.nextInt(f);
            
          String elimName = hatNames.remove(ranInt);
          System.out.println("The name: " + elimName + " has been removed");
          }
          else {
            String elimName = hatNames.remove(2); 
          System.out.println("The name: " + elimName + " has been removed");
          }
        }
      }
      System.out.println(hatNames);
    }
}


//future ricmond: look at array lists demo to add names to hatArrayList
