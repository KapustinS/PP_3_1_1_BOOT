package academy.kata.PP_3_1_1_BOOT.service;


import academy.kata.PP_3_1_1_BOOT.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User showById(int id);

    void update(User user, int id);

    void delete(int id);
}
