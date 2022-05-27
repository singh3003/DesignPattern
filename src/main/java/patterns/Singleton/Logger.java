package patterns.Singleton;

public class Logger {

    //member it belongs to class not to the object
    static int counter = 0;
    static Logger instance;


    //restricting users for creating the object
    private Logger() {
        counter++;
        System.out.println("number of instances "+ counter);
    }

    public synchronized static Logger getInstance(){

        if(instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void Log(String s) {
        System.out.println(s);
    }
}
