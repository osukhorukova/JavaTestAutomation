package by.teachmeskills.lesson7.task1;

public class HomeWork7Task1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 8, 6, 8);
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(5);
        Circle circle = new Circle(3);

        Figure[] array = new Figure[]{triangle, rectangle, square, circle};
        System.out.println("The sum of all perimeters = " + (array[0].perimeter + array[1].perimeter + array[2].perimeter + array[3].perimeter));
    }
}
