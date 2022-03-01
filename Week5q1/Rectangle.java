package Week5q1;

public class Rectangle extends GeometricObject{
    private Double width;
    private Double height;

    public Rectangle() {}

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Double width, Double height, String color, Boolean filled) {
        //this.width = width;
        //this.height = height;
        //this.setColor(color);
        //this.setFilled(filled);
    }

    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    
    public Double getArea(){
        return this.height * this.width;
    }

    public Double getPerimeter(){
        return (this.height * 2) + (this.width * 2);
    }


}
