import java.util.*;

import static java.util.Comparator.comparing;

public class Exercici6 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();


        List<Circle> circles = createCircles();
//        System.out.println("Top 5 cercles max area: \n " + getTop5CirclesMaxArea(circles));
        System.out.println(circles);
        System.out.println();
        System.out.println();
        System.out.println("----------------------");

        List<Rectangle> rectangles = createRectangles();
//        System.out.println("top 5 rectangles max area: \n" + getTop5RectanglesMaxArea(rectangles));
        System.out.println(rectangles);
        System.out.println();
        System.out.println();
        System.out.println("----------------------");

        List<Cuadrado> cuadrados = createCuadrados();
//        System.out.println("top 5 cuadrados max area: \n" + getTop5CuadradosMaxArea(cuadrados));
        System.out.println(cuadrados);
        System.out.println();
        System.out.println();
        System.out.println("----------------------");


        List<FiguraGeometrica> figurasVariadas = new ArrayList<>();

        figurasVariadas.addAll(circles);
        figurasVariadas.addAll(rectangles);
        figurasVariadas.addAll(cuadrados);

        Collections.shuffle(figurasVariadas);

        System.out.println(figurasVariadas);

        System.out.println(figurasVariadas);
        System.out.println();
        System.out.println();
        System.out.println("-----------------------");

        System.out.println("Vamos a recorrer todas las figuras " + " e invocaremos el método polimórfico calculateArea() " + "de cada figura ");

        for (FiguraGeometrica current : figurasVariadas) {
            double area = current.calculateArea();
            String className = current.getClass().getName();
            System.out.println("Soy un " + className + " y mi área es: " + area);
        }

        Cuadrado cuadrado = new Cuadrado("red", 2);
        double area = cuadrado.calculateArea();
        System.out.println("El area del cuadrado es: " + area);
        figurasVariadas.sort(comparing(FiguraGeometrica :: calculateArea));
        System.out.println("Figuras ordenadas por area: ");
        System.out.println(figurasVariadas);

        FiguraGeometrica figuraUsuario = createFiguraUser();

        double miArea = figuraUsuario.calculateArea();
        System.out.println(miArea);
    }

    private static List<Cuadrado> createCuadrados(){
        List<Cuadrado> cuadradoList = new ArrayList<>();

        cuadradoList.add(new Cuadrado("Yellow", 3));
        cuadradoList.add(new Cuadrado("Blue", 2.5));
        cuadradoList.add(new Cuadrado("Browm", 1.5));
        cuadradoList.add(new Cuadrado("Orange", 4));

        return cuadradoList;

    }

    private static FiguraGeometrica createFiguraUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin tipus de figura vols crear  Cercle(1), Rectangle (2) ");
        int figura = sc.nextInt();
        sc.nextLine();

        FiguraGeometrica miFigura = null;

        if (figura == 1) {
            System.out.println("Digues el radi: ");
            double radius = sc.nextDouble();
            miFigura = new Circle(radius, "vermell");
        }
        else if (figura == 2) {
            System.out.println("Digues la alçada: ");
            double height = sc.nextDouble();
            System.out.println("Digues la llargada: ");
            double width = sc.nextDouble();
            miFigura = new Rectangle(height, width, "groc");
        }
        return miFigura;
    }

    private static List<Circle> createCircles() {
        List<Circle> circles = new ArrayList<>();

        circles.add(new Circle(2.5, "Blue"));
        circles.add(new Circle(3.5, "Yellow"));
        circles.add(new Circle(5.5, "Browm"));
        circles.add(new Circle(8.5, "Orange"));

        circles.add(new Circle(6.5, "Blue"));
        circles.add(new Circle(1.5, "Yellow"));
        circles.add(new Circle(7.5, "Browm"));
        circles.add(new Circle(3.0, "Orange"));

        return circles;
    }

    private static List<Rectangle> createRectangles(){
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(2.5, 4.0, "Yellow"));
        rectangles.add(new Rectangle(5.0, 3.0, "Blue"));
        rectangles.add(new Rectangle(2.0, 5.0, "Browm"));
        rectangles.add(new Rectangle(2.5, 2.0, "Orange"));

        rectangles.add(new Rectangle(2.0, 4.5, "Yellow"));
        rectangles.add(new Rectangle(6.5, 8.0, "Blue"));
        rectangles.add(new Rectangle(1.5, 6.0, "Browm"));
        rectangles.add(new Rectangle(7.5, 7.0, "Orange"));

        return rectangles;
    }

    private static List<Rectangle>getTop5RectanglesMaxArea(List<Rectangle> rectangles){
        return rectangles.stream().sorted(comparing(Rectangle:: calculateArea).reversed()).limit(5).toList();
    }

    private static List<Circle>getTop5CirclesMaxArea(List<Circle> circles){
        return circles.stream().sorted(comparing(Circle:: calculateArea).reversed()).limit(5).toList();
    }

    private static List<Cuadrado> getTop5CuadradosMaxArea(List<Cuadrado> cuadrados) {
        return cuadrados.stream().sorted(comparing(Cuadrado :: calculateArea).reversed()).limit(5).toList();
    }

}
