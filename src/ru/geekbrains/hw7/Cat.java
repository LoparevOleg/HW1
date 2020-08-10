package ru.geekbrains.hw7;

public class Cat {
    String name;
    int appetite;
    boolean hunger;

    public Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }


    //сначала пошел более длинным путем и сделал отдельный метод для проверки количества еды в тарелке.
    /*public boolean checkFood(Plate plate){
        if(plate.food >= appetite){
            return true;
        } else{
            return false;
        }
    }*/


    public void eatFood(Plate plate){
        if(plate.food >= appetite){
            plate.dinner(appetite);
            hunger = true;
            System.out.println(name + " съел " + appetite + " еды из тарелки.");
        } else {
            System.out.println("food: " + plate.food);
            System.out.println("Коту " + name + " не хватит еды.");
        }



    }



    /*public void catDinner (Plate plate){
        if (checkFood(plate)){
            eatFood(plate);
            hunger = true;
        } else {
            System.out.println("Коту " + name + " не хватит еды.");
        }
    }*/

    public void catInfo (Cat cat){
        if(hunger == true){
            System.out.printf("Cat %s, сыт\n", name);
        }else {
            System.out.printf("Cat %s, голоден\n", name);
        }

    }
}
