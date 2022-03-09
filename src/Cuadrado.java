public class Cuadrado extends FiguraGeometrica{
    private double side;

    public Cuadrado(String color, double side){
        super (color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return " Cuadrado: { " +
                " side= " + side +
                ", color = '" + getColor() + '\'' +
                ", area = " + calculateArea()  +
                '}' + "\n";
    }

    public double calculateArea(){
        return side * side;
    }
}
