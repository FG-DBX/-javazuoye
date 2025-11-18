package zy03;


public class Dog extends Animal {
    String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    void eat() {
        System.out.println("Собака ест " + food);
    }
}
