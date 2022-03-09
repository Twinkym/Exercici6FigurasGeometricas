import java.util.Objects;

public class Circle extends FiguraGeometrica {

    private double radius;

    public Circle(double radius, String colour) {
            super (colour);
            this.radius = radius;
        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){return Math.PI * (radius * radius);
        }

    @Override
    public String toString() {
        return " Circle: { " +
                " radius= " + radius +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
