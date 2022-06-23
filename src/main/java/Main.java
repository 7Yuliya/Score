package com.example.score;

public class Main {
    public static void main(String[] args) {
        int initialScore = 200;
        int depositAmount = 1100;
        int finalScore = initialScore + depositAmount;
        int bonus;
        if (depositAmount > 1000) {
            bonus = finalScore / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счёт:" + finalScore + "рублей");
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}

