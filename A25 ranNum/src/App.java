public class App {
    public static void main(String[] args) throws Exception {
        RandomNumber test = new RandomNumber();
        for (int i = 0; i <= 10; i++){
        test.gen();
        test.Print();
        test.compare();
        }

    }
}
