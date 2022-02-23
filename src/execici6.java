import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class execici6 {

    public static void main(String[] args) {
        List<exercici6RectangleClass> rectangles = createRectangles();
        List<exercici6CircleClass> circles = createCircles();

        System.out.println("top 5 rectangles max area: \n" + getTop5RectanglesMaxArea(rectangles));
        System.out.println("Top 5 cercles max area: \n " + getTop5CirclesMaxArea(circles));
    }

    private static List<exercici6CircleClass> createCircles() {
        List<exercici6CircleClass> circles = new ArrayList<>();

        circles.add(new exercici6CircleClass(2.5, "Blue"));
        circles.add(new exercici6CircleClass(3.5, "Blue"));
        circles.add(new exercici6CircleClass(5.5, "Blue"));
        circles.add(new exercici6CircleClass(8.5, "Blue"));
        circles.add(new exercici6CircleClass(6.5, "Blue"));
        circles.add(new exercici6CircleClass(1.5, "Blue"));
        circles.add(new exercici6CircleClass(7.5, "Blue"));
        circles.add(new exercici6CircleClass(3.0, "Blue"));


    }

    private static List<exercici6RectangleClass> createRectangles(){
        List<exercici6RectangleClass> rectangles = new ArrayList<>();

        rectangles.add(new exercici6RectangleClass(2.5, 4.0, "Blue"));
        rectangles.add(new exercici6RectangleClass(5.0, 3.0, "Blue"));
        rectangles.add(new exercici6RectangleClass(2.0, 5.0, "Blue"));
        rectangles.add(new exercici6RectangleClass(2.5, 2.0, "Blue"));
        rectangles.add(new exercici6RectangleClass(2.0, 4.5, "Blue"));

        rectangles.add(new exercici6RectangleClass(6.5, 8.0, "Blue"));
        rectangles.add(new exercici6RectangleClass(1.5, 6.0, "Blue"));
        rectangles.add(new exercici6RectangleClass(7.5, 7.0, "Blue"));

        return rectangles;
    }

    private static List<exercici6RectangleClass>getTop5RectanglesMaxArea(List<exercici6RectangleClass> rectangles){
        return rectangles.stream().sorted(Comparator.comparing(exercici6RectangleClass :: calculateArea).reversed()).limit(5).toList();
    }

    private static List<exercici6CircleClass>getTop5CirclesMaxArea(List<exercici6CircleClass> circles){
        return circles.stream().sorted(Comparator.comparing(exercici6CircleClass :: calculateArea).reversed()).limit(5).toList();
    }

    private static FiguraGeometrica createFiguraUser(){
        Scanner sc = new Scanner((System.in));
        System.out.println("");
    }

    if ()
}
