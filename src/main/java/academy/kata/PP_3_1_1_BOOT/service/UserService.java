package academy.kata.PP_3_1_1_BOOT.service;


import academy.kata.PP_3_1_1_BOOT.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public interface UserService {

    List<User> showAll();

    User showById(int id);

    @Transactional
    void create(User user);

    @Transactional
    void update(User user, int id);

    @Transactional
    void delete(int id);
}
