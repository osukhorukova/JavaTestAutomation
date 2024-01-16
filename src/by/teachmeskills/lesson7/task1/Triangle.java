package by.teachmeskills.lesson7.task1;

public class Triangle extends Figure {
    protected Triangle(int sideA, int sideB, int sideC, int height) {
        super.area = 0.5 * height * sideC;
        super.perimeter = sideA + sideB + sideC;
    }
}
