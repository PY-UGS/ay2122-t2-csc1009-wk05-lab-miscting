package week5q2;

public class Circle extends Shape {
    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
        }

    public double area() {
        System.out.println("Inside Area for Circle.");
        return super.getPI() * super.getDim1() * super.getDim2();
    }

}
