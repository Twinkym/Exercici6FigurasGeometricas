import java.util.ArrayList;
import java.util.List;

public abstract class exercici6FiguraGeometrica {
    private String color;


    public  exercici6FiguraGeometrica(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
}

