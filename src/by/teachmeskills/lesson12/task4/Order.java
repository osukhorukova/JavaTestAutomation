package by.teachmeskills.lesson12.task4;

class Order {
    private final double price;
    private final String description;
    private final int orderId;

    public Order(double price, String description, int orderId) {
        this.price = price;
        this.description = description;
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "(OrderID = " + orderId + ", price= " + price + ", description: " + description + ")";
    }
}

