package user_service.user_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user_service.user_service.Entity.Credential;

import java.util.Optional;

@Repository
public interface CredentialRepository extends JpaRepository<Credential,Integer> {

    Optional<Credential> findByUsername(Integer integer);
}
