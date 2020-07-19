package ru.geekbrains.hw1;

public class Main {

    public static void main(String[] args) {
    /*задание №2
	byte a = 127;
	short b = 32767;
	int c = 2147483647;
	long d = 9223372036854775807L;
	float e = 3.14F;
	double f = 3.14159;
	char g = 0;
	boolean h = true;*/

	//задание 3
	System.out.println(summ(1, 3, 4, 2));

	//задание 4
	System.out.println(checkSumm(7, 3));

	//задание 5
	if(checkNumber(-9)){
		System.out.println("Число является положительным");
	}else {
		System.out.println("Число является отрицательным");
	}

	//задание 6
	printHellowName("GreatGeek");

	//задание 7
	leapYear(400);
    }

    private static float summ(float a, float b, float c, float d){
		float sum = a * (b + (c / d));
		return sum;
	}

	private static boolean checkSumm(int a, int b){
    	int sum = a + b;
    	return sum >= 10 && sum <= 20;
	}

	private static boolean checkNumber(int a){
    	return a >= 0;
	}

	private static void printHellowName(String word){
		System.out.println("Hellow " + word);
	}

	private static void leapYear(int a){
    	if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
			System.out.println("Год является високосным");
		} else {
			System.out.println("Год не является високосным");
		}
	}
}
