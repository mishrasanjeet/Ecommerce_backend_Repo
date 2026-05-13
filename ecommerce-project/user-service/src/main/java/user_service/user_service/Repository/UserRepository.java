package user_service.user_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user_service.user_service.Entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByCredentialuserName(final String username);
}
