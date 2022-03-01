package week5q2;

abstract class Shape {
    private Double dim1;
    private Double dim2;
    private Double PI;

    public Shape(Double dim1, Double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = 3.14;
    }
    public abstract double area();

    public Double getDim1() {
        return dim1;
    }
    public void setDim1(Double dim1) {
        this.dim1 = dim1;
    }
    public Double getDim2() {
        return dim2;
    }
    public void setDim2(Double dim2) {
        this.dim2 = dim2;
    }

    public Double getPI() {
        return PI;
    }

}

