package user_service.user_service.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import user_service.user_service.Entity.RoleBasedAuthority;
import user_service.user_service.Entity.User;
import user_service.user_service.Entity.Verificationtoken;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CredentialDto {


    private int credentialid;

    private String username;

    private int password;

    private RoleBasedAuthority roleBasedAuthority;

    private boolean isEnabled;

    private boolean isAcccountNonExpiered;

    private boolean isAccountNonLocked;

    private boolean isCredentialsNonExpiered;

    @JsonProperty("Verificationtoken")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private Set<VerificationtokenDto> verificationtokendto;

    @JsonProperty("user")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private UserDto userdto;
}
