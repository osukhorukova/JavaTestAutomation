package by.teachmeskills.lesson12.task3;

public class Order {
    private final int orderId;
    private final int orderCost;
    private String customerName;

    public Order(int orderId, int orderCost, String customerName) {
        this.orderId = orderId;
        this.orderCost = orderCost;
        this.customerName = customerName;
    }

    public Order(int orderId, int orderCost) {
        this.orderId = orderId;
        this.orderCost = orderCost;
    }

    public double getOrderCost() {
        return orderCost;
    }

    @Override
    public String toString() {
        if (customerName != null) {
            return "Order{" +
                    "orderId= " + orderId +
                    ", orderCost= " + orderCost +
                    ", customerName= " + customerName +
                    '}';
        }
        return "Order{" +
                "orderId= " + orderId +
                ", orderCost= " + orderCost +
                '}';
    }
}
