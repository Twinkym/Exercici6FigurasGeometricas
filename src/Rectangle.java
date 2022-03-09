public class Rectangle extends FiguraGeometrica {

    private double Heigth;
    private double Width;

    public Rectangle(double heigth, double width, String color){
        super(color);
        this.Heigth = heigth;
        this.Width = width;


    }

    public double calculateArea(){
        return Heigth * Width;
    }

    public double getHeigth() {
        return Heigth;
    }

    public void setHeigth(double heigth) {
        Heigth = heigth;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Heigth= " + Heigth +
                ", Width= " + Width +
                ", Color=' " + getColor() + '\'' +
                ", area = " + calculateArea() + " \n ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.Heigth, Heigth) != 0) return false;
        return Double.compare(rectangle.Width, Width) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(Heigth);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(Width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
