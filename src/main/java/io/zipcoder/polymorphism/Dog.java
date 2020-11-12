package io.zipcoder.polymorphism;



public class Dog extends Pet{

    public Dog(String name, String animalType) {
        super(name, "dog");
    }
    @Override
    public String speak() {
        return "bark";
    }
}
