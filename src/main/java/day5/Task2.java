package day5;


public class Task2 {
    public static void main(String[] args) {
        motorbike motorbike1 = new motorbike(12,"green", "opa");
        motorbike1.getInfo();
    }
}

class motorbike {
    private int startyesrs;
    private String color;
    private String model;
    public motorbike(){
        System.out.println("где данные");
    }



    public  motorbike (int startyesrs, String color, String model){
        this.startyesrs = startyesrs;
        this.color = color;
        this.model = model;
    }
    public void getInfo(){
        System.out.println(startyesrs);
        System.out.println(color);
        System.out.println(model);
    }

}
