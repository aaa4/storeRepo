package com.example.demo.logic;

/**
 * Created by Nyansus on 16.11.2017.
 */
public class MyRandom {

    int randomNumber;

    public MyRandom(int maxRandom) {
        double randomDouble = Math.random() * maxRandom + 1;
        this.randomNumber = (int) randomDouble;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new MyRandom(i).randomNumber);
        }
    }

}
