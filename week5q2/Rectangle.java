package week5q2;

public class Rectangle extends Shape{
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
        }

    public double area() {
        System.out.println("Inside Area for Rectangle.");
        return super.getDim1() * super.getDim2();
    }

}
