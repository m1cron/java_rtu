package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void num3(){
        int[] arr = {1,2,3,4};
        int res = 0;
        for(int i = 0; i < arr.length; i++)
            res += arr[i];
        System.out.println(res);
    }

    public static void num4(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

    public static void num5() {
        for (int i = 1; i <= 10; i++){
            System.out.printf("%.2f\t", (float)1 / i);
        }
    }

    public static void num6(){
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = (int)(Math.random() * 100);
        for(int i = 0; i < 10; i++)
            System.out.println(arr[i]);
        Arrays.sort(arr);
        for(int i = 0; i < 10; i++)
            System.out.println(arr[i]);
        Random ran = new Random(100);
        for(int i = 0; i < 10; i++)
            arr[i] = ran.nextInt(100);
        Arrays.sort(arr);
        for(int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
    public static void num7(int fac){
        if (fac == 0){
            System.out.println(1);
            return;
        }
        long res = 1;
        for(int i = 1; i <= fac; i++)
            res *= i;
        System.out.println(res);
    }

    public static void main(String[] args) {
        //num3();
        //num4(args);
        //num5();
        //num6();
        //num7(5);
    }
}