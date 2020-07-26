package ru.geekbrains.hw3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MainHW3 {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {


        //guessNumber(10);

       // String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
       // guessWord(words);

    }

    private static void guessNumber(int n){
        int number = rand.nextInt(n);
        int score = 0;
        System.out.println("Угадайте число от 0 до 9, у вас есть 3 попытки.\n Введите число");
        int userNumber = sc.nextInt();
        while (score < 3){
            if(userNumber == number){
                System.out.println("Поздравляю, вы угадали!\n Правильный ответ: " + number);
                break;
            }

            if(userNumber > number){
                System.out.println("Вы ввели слишком большое число, осталось попыток: " + (2 - score));
            }else {
                System.out.println("Вы ввели слишком маленькое число, осталось попыток:  " + (2 - score));
            }

            score++;
            if(score == 3){
                System.out.println("Вы проиграли!");
                break;
            }
            userNumber = sc.nextInt();
        }
        System.out.println("Повторить игру еще раз?\n1 – да / 0 – нет");
        int userAnswer = sc.nextInt();
        if(userAnswer == 1){
            guessNumber(n);
        }


    }
    // мои попытки сделать задание под *
    /*public static void guessWord (String[] arr) {
        String questionWord = arr[rand.nextInt(arr.length -1)];
        System.out.println("Угадайте слово");
        String userAnswerWord = sc.nextLine();
        String imageAnswerWord = "";
        for(int i = 0; i < userAnswerWord.length(); i++){
            if (userAnswerWord.charAt(i) == questionWord.charAt(i)){
                imageAnswerWord += userAnswerWord.charAt(i);
            }else {
                imageAnswerWord += "#";
            }

        }

        System.out.printf("%s", imageAnswerWord);
        System.out.println("Играть еще раз?\n1 - да; 2 - нет.");
        int gameRestart = sc.nextInt();
        if(gameRestart == 1){
            guessWord(arr);
        }
    }*/

}
