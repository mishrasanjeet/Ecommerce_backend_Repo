package user_service.user_service.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Address extends AbstractMappedEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id",nullable = false,unique = true,updatable = false)
    private int addressid;

    @Column(name="full_address", updatable = true)
    private String fulladdress;

    @Column(name="postal_code")
    private String postalcode;

    private String city;

    @ManyToOne
    @JoinColumn(name = "user_id")//This is use to join the column
    //based on the user table this is the foreign key
    private User user;
}
