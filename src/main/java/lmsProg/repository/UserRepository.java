package lmsProg.repository;

import lmsProg.model.User;
import lmsProg.service.MyUserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends org.springframework.data.repository.Repository<User, Integer> {
   Optional<User> findUsersByName(String username);
}
