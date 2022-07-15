package academy.kata.PP_3_1_1_BOOT.repositories;

import academy.kata.PP_3_1_1_BOOT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
