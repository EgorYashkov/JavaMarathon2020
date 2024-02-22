package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for ( int i = 0; i < array.length; i++)
            array[i] = ( int ) ( Math.random() * 10000 );


        int ktoz =0;
        for ( int opa : array)
            if ( opa > ktoz)
                ktoz = opa;
        System.out.println(ktoz);

        ktoz = 0;
        for ( int opa : array)
            if ( opa < ktoz)
                ktoz = opa;

        System.out.println(ktoz);

        int sumO = 0;
        for ( int opa : array)
            if ( opa % 10 == 0)
                sumO++;
        System.out.println(sumO);

        int sum = 0;
        for ( int opa : array)
            if ( opa % 10 == 0)
                sum += opa;
        System.out.println(sum);
    }
}
