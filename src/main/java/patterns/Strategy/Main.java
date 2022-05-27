package patterns.Strategy;

public class Main {

    //defines family of algorithm and it encapsulates each one of them and make them inter changeable, client don't have to vary
    public static void main(String[] args){

        Context context = new Context(new Add());
        System.out.println("add strategy "+ context.executeStrategy(55, 10));

        context = new Context(new Subtract());
        System.out.println("add strategy "+ context.executeStrategy(55, 10));

        context = new Context(new Divide());
        System.out.println("add strategy "+ context.executeStrategy(55, 10));

        context = new Context(new Multiply());
        System.out.println("add strategy "+ context.executeStrategy(55, 10));

    }
}
