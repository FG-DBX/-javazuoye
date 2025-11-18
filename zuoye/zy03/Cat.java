package zy03;

// Cat.java
public class Cat extends Animal {
    String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    void makeNoise() {
        System.out.println("Кошка мяукает.");
    }

    @Override
    void eat() {
        System.out.println("Кошка ест " + food);
    }
}
