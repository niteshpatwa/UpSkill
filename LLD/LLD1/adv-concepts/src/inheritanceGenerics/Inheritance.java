package inheritanceGenerics;

import java.util.List;

public class Inheritance<E extends User> {
    void addUsers(List<E> users, E user) {
        users.add(user);
    }
}