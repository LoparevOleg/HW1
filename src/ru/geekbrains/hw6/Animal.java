package ru.geekbrains.hw6;

import javax.naming.Name;
import javax.naming.NameClassPair;
import java.util.jar.Attributes;

public class Animal {
    String name;
    String color;
    int skillRun;
    int skillSwim;


    public Animal(String name, String color, int skillRun, int skillSwim) {
        this.name = name;
        this.color = color;
        this.skillRun = skillRun;
        this.skillSwim = skillSwim;


    }

    public void run(int range){
        if(skillRun < range){
            System.out.println(name + " не может так далеко бежать ");
        } else {
            System.out.println(name + " пробежал " + range + " метров");

        }

    }

    public void swim(int range) {
        if(skillSwim == 0){
            System.out.println(name + " не умеет плавать");

        }
        if (skillSwim < range && skillSwim != 0) {
            System.out.println(name + " столько не проплывет ");
        } if (skillSwim >= range && skillSwim != 0){
            System.out.println(name + " проплыл " + range + " метров");
        }
    }
}
