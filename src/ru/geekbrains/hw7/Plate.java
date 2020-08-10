package ru.geekbrains.hw7;

import java.util.Scanner;

public class Plate {
    int food;
    Scanner sc = new Scanner(System.in);


    public Plate(int food) {
        this.food = food;
    }





    public void dinner(int n){
        System.out.println("food: " + food);
        food -= n;
    }

    public void addFood(){
        System.out.println("В тарелке остаалось мало еды: " + food + "\nДобавить еще? (1 – да / 0 – нет)");
        int answer = sc.nextInt();
        if(answer == 1){
            System.out.println("Сколько добавить еды?");
            int n = sc.nextInt();
            food = food + n;
        } else {
            System.out.println("Проверьте все ли коты сыты!");
        }
        System.out.println("food: " + food);

    }


}
