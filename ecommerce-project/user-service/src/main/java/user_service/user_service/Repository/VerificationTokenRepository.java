package user_service.user_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user_service.user_service.Entity.Verificationtoken;

@Repository
public interface VerificationTokenRepository extends JpaRepository<Verificationtoken,Integer> {
}
