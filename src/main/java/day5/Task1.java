package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYaer(12);
        car1.setColor("MAMDA");
        car1.setModel("Ford");
        System.out.println(car1.getYaer());
        System.out.println(car1.getYaer());
        System.out.println(car1.getModel());
    }
}

class Car {
    private int yaer;
    public void setYaer (int usery) {
        if (usery < 0)
            System.out.println("-1000");
        else
            yaer = usery;
    }
    public int getYaer(){
        return yaer;
    }

    private String color;
    public void setColor (String userColor){
        if (userColor.isEmpty())
            System.out.println("Пусто");
        else
            color = userColor;
    }
    public String getColor(){
        return color;
    }
    private String model;
    public void setModel (String userModel){
        if (userModel.isEmpty())
            System.out.println("Пусто");
        else
            model = userModel;
    }
    public String getModel(){
        return model;
    }


}



