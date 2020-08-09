package ru.geekbrains.hw6;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", "red", 200, 0);
        Dog dog1 = new Dog("Jack", "black", 500, 10);

        cat1.run(300);
        dog1.run(200);

        cat1.swim(0);
        dog1.swim(10);

    }

}
