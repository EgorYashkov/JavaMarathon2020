package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i<array.length; i++)
            array[i] = (int) (Math.random() * 10000);
        int arraymax = 0;
        int sum = 0;
        int vhod = -1;
        for(int i = 2 ; i < array.length; i++){
            sum = array[i-2]+array[i-1]+array[i];
            if(sum > arraymax){
                arraymax = sum;
                vhod =i-2;
            }
        }
        System.out.println(arraymax);
        System.out.println(vhod);
    }
}
