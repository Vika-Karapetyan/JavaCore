package onlineShop.storages;

import onlineShop.model.User;
import onlineShop.model.enums.UserType;

public class UserStorage {
    private User[] users = new User[10];

    private int size;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    public void printByType(UserType userType) {
        for (int i = 0; i < size; i++) {
            if (users[i].getUserType() == userType) {
                System.out.println(users[i]);
            }
        }
    }
}
