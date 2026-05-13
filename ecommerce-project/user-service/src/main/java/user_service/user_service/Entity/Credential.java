package user_service.user_service.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Credential extends AbstractMappedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credential_id",unique = true,updatable = false,nullable = false)
    private int credentialid;

    @Column(unique = true)
    private String username;

    private int password;

    @Column(name = "role")
    private RoleBasedAuthority roleBasedAuthority;

    @Column(name = "is_enabled")
    private boolean isEnabled;

    @Column(name = "is_account_non_expiered")
    private boolean isAcccountNonExpiered;

    @Column(name = "is_account_locked")
    private boolean isAccountNonLocked;

    @Column(name = "is_credentials_non_expiered")
    private boolean isCredentialsNonExpiered;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "credential")
    private Set<Verificationtoken> verificationtoken;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private  User user;



}
