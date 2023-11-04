package onlineShop.storages;

import onlineShop.Product;

public class ProductStorage {
    private Product[] products = new Product[10];
    private int index = 0;

    private void extend() {
        Product[] temp = new Product[products.length + 10];
        System.arraycopy(products, 0, temp, 0, index);
        products = temp;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(products[i].toString());
        }
    }


    public Product findProductById(String id) {
        for (int i = 0; i < index; i++) {
            if (products[i].getProductId().equalsIgnoreCase(id)) {
                return products[i];
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (index == products.length) {
            extend();
        }
        products[index++] = product;
    }



}
