package by.teachmeskills.lesson7.task1;

public class Square extends Figure {
    private int side;

    protected Square(int side) {
        super.area = side * side;
        super.perimeter = 4 * side;
        this.side = side;

    }
}
