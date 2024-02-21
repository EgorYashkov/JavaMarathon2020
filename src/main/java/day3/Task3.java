package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < 5 ; i++){
            double delumoe = sc.nextDouble();
            double delutel = sc.nextDouble();
            switch ((int) delutel){
                case 0:
                    System.out.println("Деление на 0");
                    break;
                default:
                    System.out.println(delumoe / delutel);
            }
        }
    }
}
