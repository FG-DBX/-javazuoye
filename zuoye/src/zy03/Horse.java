package zy03;

// Horse.java
public class Horse extends Animal {
    double speed;

    public Horse(String food, String location, double speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    void makeNoise() {
        System.out.println("Лошадь ржет.");
    }

    @Override
    void eat() {
        System.out.println("Лошадь ест " + food);
    }
}

