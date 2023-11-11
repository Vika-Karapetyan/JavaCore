package onlineShop.storages;

import onlineShop.model.Order;
import onlineShop.model.User;

public class OrderStorage {
    private Order[] orders = new Order[10];

    private int size;

    public void add(Order order) {
        if (orders.length == size) {
            extend();
        }
        orders[size++] = order;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, orders.length);
        orders = tmp;
    }

    public Order getById(String id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(id)) {
                return orders[i];
            }
        }
        return null;
    }

    public void printByUser(User currentUser) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getUser().equals(currentUser)) {
                System.out.println(orders[i]);
            }
        }
    }

}
