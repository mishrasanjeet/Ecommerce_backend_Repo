package user_service.user_service.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressDto {

    private static final long serialVersionUID = 1L;

    private Integer addressId;

    private String fullAddress;

    private String postalCode;

    private String city;

    @JsonProperty("user")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private UserDto userDto;

}
