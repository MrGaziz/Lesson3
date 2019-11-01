package services.implementation;

import services.ObjectHandler;

import java.util.List;

public class ObjectHandlerIntImpl implements ObjectHandler {
    public void handleObject(List<Object> collection){
        //Find max Value
        //If its not Int handle error (через трай кэч)
        int max = 0;
        try {
            max = (int) collection.get(0);
            for (int i = 1; i<collection.size(); i++){
                if((int)collection.get(i) > max){
                    max = (int) collection.get(i);
                }
            }
        }catch (Exception e){
            System.out.println("That is not an integer, please try again." );
        }
        System.out.println(max);
    }
}
