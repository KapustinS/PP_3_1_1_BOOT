package academy.kata.PP_3_1_1_BOOT.service;

import academy.kata.PP_3_1_1_BOOT.model.User;
import academy.kata.PP_3_1_1_BOOT.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> showAll(){
        return usersRepository.findAll();
    }

    public User showById(int id){
        Optional<User> userOptional = usersRepository.findById(id);
        return userOptional.orElse(null);
    }

    @Transactional
    public void create(User user){
        usersRepository.save(user);
    }

    @Transactional
    public void update(User user, int id){
        user.setId(id);
        usersRepository.save(user);
    }

    @Transactional
    public void delete(int id){
        usersRepository.deleteById(id);
    }
}
