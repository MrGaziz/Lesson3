import services.implementation.ObjectHandlerIntImpl;
import services.implementation.RandomGeneratorImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomGeneratorImpl testGenerator = new RandomGeneratorImpl();
        System.out.println("Test collection:\n"+testGenerator.generateCollection(10));

     }
}
