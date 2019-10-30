import services.implementation.RandomGeneratorImpl;

public class Main {
    public static void main(String[] args) {
        RandomGeneratorImpl testGenerator = new RandomGeneratorImpl();
        System.out.println("Test collection:\n"+testGenerator.generateCollection(10));


    }
}
