package com.example.demo.logic;

import java.util.Locale;

/**
 * Created by Nyansus on 16.11.2017.
 */
public class PostfixGenerator {
    private static final String digits = "0123456789";
    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower = upper.toLowerCase(Locale.ROOT);
    private static final String alphanum = upper + lower + digits;
    private String postfix;

    public PostfixGenerator(int postfixLength) {
        String result = "";
        for (int i = 0; i < postfixLength; i++) {
            int realLength = postfixLength - 1; // с нуля считаем
            int randomNumber = new MyRandom(realLength).randomNumber;
            char oneRandomChar = alphanum.charAt(randomNumber);
            if (i == 2 || i == 5)
                result = result + "-";
            else if(i==3 || i ==4)
                result = result +randomNumber;
            else
                result = result + oneRandomChar;

        }
        this.postfix = result;
    }

    public String getPostfix() {
        return postfix;
    }

    public static void main(String[] args) {
        System.out.println(new PostfixGenerator(10).postfix);
        System.out.println(new PostfixGenerator(10).postfix);
        System.out.println(new PostfixGenerator(10).postfix);
        System.out.println(new PostfixGenerator(10).postfix);
    }
}
