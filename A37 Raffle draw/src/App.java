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
      while (hatNames.size() = 1){
        int rando = (int) Math.random(); 
        hatNames.remove(rando);
      }

    }
}


//future ricmond: look at array lists demo to add names to hatArrayList
