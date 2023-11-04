package onlineShop;

import onlineShop.enums.PaymentMethod;

import java.util.Date;

public class Order {
    private String orderId;
    private User user;
    private String product;
    private Date date;
    private double orderPrice;
    private OrderStatus orderStatus;
    private int qty;
    private PaymentMethod paymentMethod;

    public Order(String orderId, User user, String product, Date date, double orderPrice, OrderStatus orderStatus, int qty, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.date = date;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.qty = qty;
        this.paymentMethod = paymentMethod;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", user=" + user +
                ", product='" + product + '\'' +
                ", date=" + date +
                ", orderPrice=" + orderPrice +
                ", orderStatus=" + orderStatus +
                ", qty=" + qty +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
