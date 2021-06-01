package ru.gb.Dmitrieva.HomeWorkApp.Lesson_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public void addFruit(T fruit){
        this.fruitList.add(fruit);
        if (fruitList.isEmpty());
    }
    
    public double getWeight(){
        int count = fruitList.size();
        if (count==0) 
            return 0;
        return fruitList.get(0).getWeight()*count;
    }

    public boolean compare(Box box){
        return this.getWeight()==box.getWeight();
    }

    public void pourOverTo(Box<T> destBox){
        for (T fruit : fruitList){
            destBox.addFruit(fruit);
        }
        fruitList.clear();
    }
}
