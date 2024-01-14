package by.teachmeskills.lesson7.task1;

public class Rectangle extends Figure {
    protected int sideA;
    protected int sideB;

    protected Rectangle(int sideA, int sideB) {
        super.area = sideA * sideB;
        super.perimeter = 2 * (sideA + sideB);
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
