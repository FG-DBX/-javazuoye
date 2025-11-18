package zy03;

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("ветчина", "дом", "Хаски");
        animals[1] = new Cat("ветчина", "дом", "Белая");
        animals[2] = new Horse("трава", "конюшня", 50.0);

        Veterinarian vet = new Veterinarian();

        for (Animal a : animals) {
            a.makeNoise();
            a.eat();
            a.sleep();
            vet.treatAnimal(a);
            System.out.println("-------------------");
        }
    }
}
