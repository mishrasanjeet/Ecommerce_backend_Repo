package user_service.user_service.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import user_service.user_service.Entity.Address;
import user_service.user_service.Entity.Credential;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int userid;

    private String firstname;

    private String lastname;

    private String imageUrl;

    private String email;

    private String phone;

    //apply this annotation when you want to see thee respnse with clear nname
    @JsonProperty("address")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)// this is used to not add the null value field on the response
    private Set<AddressDto> addressdto;


    @JsonProperty("credential")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private CredentialDto credentialdto;
}
