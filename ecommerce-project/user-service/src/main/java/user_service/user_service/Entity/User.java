package user_service.user_service.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.aspectj.SpringConfiguredConfiguration;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class User extends AbstractMappedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "user-id",nullable = false,updatable = false)
    private int userid;

    @Column(name = "first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name ="email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @JsonIgnore
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private Set<Address> address;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private Credential credential;

}
