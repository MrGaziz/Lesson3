package services.implementation;

import services.ObjectHandler;

import java.util.List;

public class ObjectHandlerCharImpl implements ObjectHandler {
    @Override
    public void handleObject(List<Object> collection) {
            for (int i = 0; i<collection.size(); i++) {
                System.out.println(collection.get(i) + "/n");
            }
    }
}
