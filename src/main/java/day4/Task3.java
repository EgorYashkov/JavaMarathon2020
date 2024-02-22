package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] arry = new int[3][3];
        for ( int i = 0; i < arry.length ; i++){
            for (int j = 0; j< arry[i].length; j++){
                arry[i][j] = ( int ) ( Math.random()*50);
            }
        }
        int win = 0;
        int wins = 0;
        int sum = 0;
        for ( int i = 0; i < arry.length; i++){
            for ( int j = 0; j < arry[i].length; j++){
                sum += arry[i][j];
            }
            if ( sum > wins) {
                wins = sum;
                win = i;
            }

            sum = 0;
        }
        System.out.println(win);
    }
}
