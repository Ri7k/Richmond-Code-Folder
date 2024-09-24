// Richmond Meana
// Mr Fox
// String Basics
// 18 Sept 2024



public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";
        int very = message1.indexOf(target1);

  
        String newmsg = message1.substring(0, very);
        message1.substring(5, 9);
        String pos1 = message1.substring(0, 4) + message1.substring(9, message1.length());
        System.out.println(pos1);
    }
}
