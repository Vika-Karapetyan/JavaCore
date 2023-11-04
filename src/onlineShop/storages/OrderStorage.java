package onlineShop.storages;

import onlineShop.Order;
import onlineShop.OrderStatus;
import onlineShop.User;

public class OrderStorage {
    private Order[] orders = new Order[10];
    private int index = 0;

    private void extend() {
        Order[] temp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, temp, 0, index);
        orders = temp;
    }

    public void add(Order order) {
        if (index == orders.length) {
            extend();
        }
        orders[index++] = order;
    }

    public void printOrders() {
        for (int i = 0; i < index; i++) {
            System.out.println(orders[i]);
        }
    }



}
