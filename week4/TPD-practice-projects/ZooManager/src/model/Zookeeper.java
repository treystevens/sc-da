package model;


import java.util.List;

public class Zookeeper {

    private String name;
    private int age;
    private List<Animal> animalList;
    private Animal favourite;

    public Zookeeper(String name, int age){
        this.name = name;
        this.age = age;
    }


    // GETTERS
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public List<Animal> getAnimals(){
        return animalList;
    }
    public Animal getFavourite(){
        return favourite;
    }

    // MODIFIES: this
    // EFFECTS: Sets the zookeeper's favorite animal
    public void setFavourite(Animal favourite){
        this.favourite = favourite;
    }

    // MODIFIES: this
    // EFFECTS: adds an animal to the list of animals the zookeeper takes care of
    public void addAnimal(Animal a){
        animalList.add(a);
    }

    public void removeAnimal(Animal a){
        animalList.remove(a);
    }

}