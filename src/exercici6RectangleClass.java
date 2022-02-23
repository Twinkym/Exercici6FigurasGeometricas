import java.util.Objects;

public class exercici6RectangleClass {
    private double Heigth;
    private double Width;
    private String Color;


    public exercici6RectangleClass(double heigth, double width, String color){
        this.Heigth = heigth;
        this.Width = width;
        this.Color = color;

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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "exercici6RectangleClass " +
                "Heigth= " + Heigth +
                ", Width= " + Width +
                ", Color=' " + Color + '\'' +
                ", area = " + calculateArea() + " \n ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        exercici6RectangleClass that = (exercici6RectangleClass) o;

        if (Double.compare(that.Heigth, Heigth) != 0) return false;
        if (Double.compare(that.Width, Width) != 0) return false;
        return Objects.equals(Color, that.Color);
    }

//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        temp = Double.doubleToLongBits(Heigth);
//        result = (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(Width);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (Color != null ? Color.hashCode() : 0);
//        temp = Double.doubleToLongBits(Area);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
}
