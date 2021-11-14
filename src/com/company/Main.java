package com.company;

public class Main {

    public static void main(String[] args) {
        int[] window = new int[]{6, 8, 10, 56, 67, 92, 123, 14};
        int cake = 0;
        for (int i = 0; i < window.length; i++) {
            for (int l = i + 1; l < window.length; l++) {
                if (window[i] > window[l]) {
                    cake = window[i];
                    window[i] = window[l];
                    window[l] = cake;

                }
            }
        }
        System.out.println("Elements of the array sorted in the ascending order");
        for (int i = 0; i < window.length; i++) {
            System.out.println(window[i]);

        }


    }
}