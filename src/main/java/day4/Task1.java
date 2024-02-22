package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 10 );
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println(array.length);

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>8)
                count++;
        }

        System.out.println(count);
        count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==1)
                count++;
        }

        System.out.println(count);
        count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0)
                count++;
        }

        System.out.println(count);
        count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0)
                count++;
        }

        System.out.println(count);
        count = 0;

        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        System.out.println(count);
    }
}
