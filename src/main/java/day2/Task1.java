package day2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kolvotash = sc.nextInt();
        if( kolvotash > 0 ){
            if(kolvotash <= 4){
                System.out.println("min home");
            }else if(kolvotash <=8){
                System.out.println("maduym home");
            }else{
                System.out.println("max home");
            }
        }else{
            System.out.println("peredelovau");
        }
    }
}
