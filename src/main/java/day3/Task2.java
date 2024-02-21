package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while (true){
            double delumoe = sc.nextDouble();
            double delutel = sc.nextDouble();
            if(delutel == 0)
                break;
            else
                System.out.println( delumoe / delutel );
        }

    }
}
