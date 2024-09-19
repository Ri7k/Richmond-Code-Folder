// Richmond Meana
// Mr Fox
// String Basics
// 18 Sept 2024

public class App {
    public static void main(String[] args) throws Exception {
        // PART ONE
        String message1 = "I am very happy!";
        //String target1 = "very";
        String pos1 = message1.substring(0, 4) + message1.substring(9, message1.length());
        System.out.println(pos1);

        //PART TWO 
        String msg2 = "That was great - lol." ; 
        //String target2 = "lol" ; 
        String msgFull = "laugh out loud.";
        String pos2 = msg2.substring(0, 16) + msg2.substring(16, 17) ;
        System.out.println(pos2 + msgFull);

    }
}