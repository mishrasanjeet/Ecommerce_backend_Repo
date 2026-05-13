package user_service.user_service.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import user_service.user_service.Constant.Appconstant;

import java.time.LocalDate;
import java.util.regex.Pattern;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Verificationtoken {

    @Id
    @Column(name = "verification_token_id",unique = true,nullable = false,updatable = false)
    private int verificationtokenid;

    @Column(name="verify_token")
    private int token;

   @JsonFormat(pattern =Appconstant.LOCAL_DATE_FORMAT, shape = JsonFormat.Shape.STRING)
   @DateTimeFormat(pattern = Appconstant.LOCAL_DATE_FORMAT)
   @Column(name = "expiere_date")
    private LocalDate expiredate;

   @ManyToOne(fetch = FetchType.EAGER )
   @JoinColumn(name = "credential_id")
   private Credential credential;

}
