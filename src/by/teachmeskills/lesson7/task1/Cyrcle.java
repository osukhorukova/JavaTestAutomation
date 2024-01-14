package by.teachmeskills.lesson7.task1;

public class Cyrcle extends Figure {
    private int radius;
    protected final double pi = 3.14;

    protected Cyrcle(int radius) {
        super.area = pi * radius * radius;
        super.perimeter = 2 * pi * radius;
        this.radius = radius;
    }
}
