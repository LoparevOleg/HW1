package ru.geekbrains.hw7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        //Cat cat1 = new Cat("Barsik", 10, false);
        //Cat cat2 = new Cat("Vaska", 15, false);
        //Cat cat3 = new Cat("Fire", 20, false);


        //cat1.catDinner(plate);
        //cat2.catDinner(plate);
        //cat3.catDinner(plate);

        Cat [] catsArr = new Cat[5];
        catsArr[0] = new Cat("Barsik", 20, false);
        catsArr[1] = new Cat("Vaska", 25, false);
        catsArr[2] = new Cat("Fire", 25, false);
        catsArr[3] = new Cat("Blacky", 25, false);
        catsArr[4] = new Cat("Tom", 10, false);

        for (Cat cat: catsArr) {
            cat.eatFood(plate);
        }

        for (Cat cat: catsArr) {
            cat.catInfo(cat);
        }

        plate.addFood();
    }


}
