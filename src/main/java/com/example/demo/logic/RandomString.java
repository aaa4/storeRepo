package com.example.demo.logic;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Nyansus on 16.11.2017.
 */
//класс для генерации ключа сессии

/***
 * ОЧЕНЬ долго считает даже 1 ключ.
 */
public class RandomString {

    private static final String digits = "0123456789";
    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower = upper.toLowerCase(Locale.ROOT);
    private static final String alphanum = upper + lower + digits;
    private final Random random ;
    private final char[] symbols;
    private final char[] buf;

    public String nextString() {
        for (int idx = 0; idx < buf.length; ++idx) {
            buf[idx]= symbols[random.nextInt(symbols.length)];
        }
        return new String(buf);
    }

    private RandomString(int length, Random random, String symbols) {
        if (length < 1)
            throw new IllegalArgumentException("There is length = [" + length
                    + "] instead of any natural number; also length != 0");

        if (symbols.length() < 2)
            throw new IllegalArgumentException("String length is [" + symbols.length()
                    + "] it is to short for generating purposes. Please add here more symbols");

        this.random = Objects.requireNonNull(random);
        this.symbols = symbols.toCharArray();
        this.buf = new char[length];
    }


    //create new alphanumeric string generator
    private RandomString(int length, Random random){
        this(length, random, alphanum);
    }

    //create alphanumeric string from secure generator

    public RandomString(int length){
        this(length, new SecureRandom());
    }

    public static void main(String[] args) {
       // RandomString randomString = new RandomString(2, new Random());
        RandomString randomString = new RandomString(21);
        String deviceCode = randomString.nextString();
        System.out.println(deviceCode);


    }


}
