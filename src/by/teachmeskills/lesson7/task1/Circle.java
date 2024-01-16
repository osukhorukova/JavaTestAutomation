package by.teachmeskills.lesson7.task1;

public class Circle extends Figure {
    protected final double pi = 3.14;

    protected Circle(int radius) {
        super.area = pi * radius * radius;
        super.perimeter = 2 * pi * radius;
    }
}
