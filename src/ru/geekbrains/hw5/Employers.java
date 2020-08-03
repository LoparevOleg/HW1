package ru.geekbrains.hw5;

public class Employers {
    private String fio;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employers(String fio, String position, String email, int phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        if(age > 40) {
            System.out.printf("name %s position %s email %s phone number %d salary %d age %d\n", fio, position, email, phoneNumber, salary, age);
        }
    }


}
