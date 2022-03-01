package Week5q1;
//import java.lang.Math.*;

public class Circle extends GeometricObject{
    private Double radius;

    public Circle() {}

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }
    
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
    public Double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public Double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public Double getDiameter() {
        return radius * 2;
    }

    public void printCircle() {
        System.out.println("hi");
    }

}
