package by.teachmeskills.lesson12.task3;

import java.util.Comparator;

class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o1.getOrderCost(), o2.getOrderCost());
    }
}
