package patterns.Singleton;

public class Main {

    public static void userLog1(){
        Logger logger1 = Logger.getInstance();
        logger1.Log("Logger 1");
    }

    public static void userLog2(){
        Logger logger2 = Logger.getInstance();
        logger2.Log("Logger2");
    }
    public static void main(String args[])  {

        new Thread(Main::userLog1).start();
        new Thread(Main::userLog2).start();

    }
}
