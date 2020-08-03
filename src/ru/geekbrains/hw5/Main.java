package ru.geekbrains.hw5;

public class Main {
    public static void main(String[] args) {
        Employers[] employersArr = new Employers[5];
        employersArr[0] = new Employers("Ivanov Ivan Ivanovich", "manager", "ivanov@mail.ru", 2111111, 50000, 45);
        employersArr[1] = new Employers("Borisov Boris Borisovich", "sales manager", "borisov@mail.ru", 2111112, 40000, 28);
        employersArr[2] = new Employers("Kirillov Kirill Kirillovich", "sales manager", "kirillov@mail.ru", 2111113, 40000, 20);
        employersArr[3] = new Employers("Pavlov Pavel Pavlovich", "administrator", "pavlov@mail.ru", 2111114, 50000, 41);
        employersArr[4] = new Employers("Viktorov Viktor Victorovich", "IT manager", "viktorov@mail.ru", 2111115, 60000, 25);

        for (Employers employers : employersArr) {
            employers.info();
        }

    }

}
