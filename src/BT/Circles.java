package BT;

public class Circles {
    private double radius = 1;
    private String color = "red";
    public Circles() {
    }
    public Circles(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void display(){
        System.out.println("radius: " + radius + " color: " + color);
    }

}
