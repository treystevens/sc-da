package ui;


import model.Carrot;
import model.Lettuce;
import model.Tomato;
import model.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList();
        garden.add(new Carrot());
        garden.add(new Tomato());
        garden.add(new Lettuce());




        for(Vegetable v : garden){
            if(v.getName() == "Lettuce"){
                v.water();
            }
            if(v.getName() == "Carrot"){
                v.harvest();
            }

            System.out.println("Vegetable Name: " + v.getName());
            System.out.println("Vegetable Type: " + v.getType());
            System.out.println("Instructions: " + v.getInstructions());
            System.out.println("");



        }
    }
}
