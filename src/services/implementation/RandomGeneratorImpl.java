package services.implementation;

import services.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Dasmor
 */

public class RandomGeneratorImpl implements RandomGenerator {

    @Override
    public List<?> generateCollection(int size) {
        List<Object> collection = new ArrayList<>();
        for(int i =0; i<size;i++){
            Random rnd = new Random();
            //need random seed. Why System.currentTimeMillis() isn't enough here?
            rnd.setSeed(124292*i+System.currentTimeMillis());
            int rndChoose = rnd.nextInt(2);
                switch (rndChoose) {
                    case 0:
                        collection.add((char)rnd.nextInt(48));
                        break;
                    case 1:
                        collection.add(rnd.nextInt(256));
                        break;
                }
        }
        return collection;
    }
}
