package by.teachmeskills.lesson7.task1;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC; // must be in the bottom
    private int height;

    protected Triangle(int sideA, int sideB, int sideC, int height) {
        super.area = 0.5 * height * sideC;
        super.perimeter = sideA + sideB + sideC;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }
}
