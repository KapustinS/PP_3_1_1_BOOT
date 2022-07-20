package academy.kata.PP_3_1_1_BOOT.dao;

import academy.kata.PP_3_1_1_BOOT.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User showById(int id);

    void update(User user);

    void delete(int id);
}
