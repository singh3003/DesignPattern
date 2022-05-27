package patterns.Singleton;

public class Main {

    public static void main(String args[]){
        Logger logger1 = Logger.getInstance();
        logger1.Log("hey this is me 1");


        Logger logger2 = Logger.getInstance();
        logger2.Log("hey this is me 2");
    }
}
