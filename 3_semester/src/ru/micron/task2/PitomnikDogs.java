package ru.micron.task2;

import ru.micron.task2.Dog;
import java.util.ArrayList;

public class PitomnikDogs {
    private ArrayList<Dog> list = new ArrayList();
    public void add(Dog ... dog){
        for (int i = 0; i < dog.length; i++)
            list.add(dog[i]);
    }
}