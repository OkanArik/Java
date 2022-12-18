package java101.practices.theProgramThatIncludesClassPractices.carTemplate;

public class Car {
    // Nitelikler - Attributes
    public String type;
    public String model;
    public String color;
    public int speed;

    // Getter And Setter Methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Constructor (Kurucu/Yapıcı) Method
    public Car(String type, String model, String color) { // Parametreli Constructor Method
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public Car() { // Parametresiz Kurucu Method
    }

    // Davranışlar - Behaviours
    public int increaseSpeed(int increment) {
        if (speed + increment > 180)
            speed = 180;
        else
            speed += increment;
        return speed;
    }

    public int decreaseSpeed(int decrease) {
        if (speed - decrease < 0) {
            speed = 0;
        } else
            speed -= decrease;
        return speed;
    }

    public void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    public void printInfo() {
        System.out.println("==================");
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Type  : " + type);
        System.out.println("Speed : " + speed);
    }
}
