package user_service.user_service.Helper;

import user_service.user_service.Dto.CredentialDto;
import user_service.user_service.Dto.UserDto;
import user_service.user_service.Entity.Credential;
import user_service.user_service.Entity.User;

public interface UserMapingHelper {

    public static UserDto map(final User user){
        return UserDto.builder()
                .userid(user.getUserid())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .imageUrl(user.getImageUrl())
                .email(user.getEmail())
                .phone(user.getPhone())
                .credentialdto(
                        CredentialDto.builder()
                                .credentialid(user.getCredential().getCredentialid())
                                .username(user.getCredential().getUsername())
                                .password(user.getCredential().getPassword())
                                .roleBasedAuthority(user.getCredential().getRoleBasedAuthority())
                                .isEnabled(user.getCredential().isEnabled())
                                .isAcccountNonExpiered(user.getCredential().isAcccountNonExpiered())
                                .isAccountNonLocked(user.getCredential().isAccountNonLocked())
                                .isCredentialsNonExpiered(user.getCredential().isCredentialsNonExpiered())
                                .build())
                .build();
    }

    public static User map(final UserDto userDto) {
        return User.builder()
                .userid(userDto.getUserid())
                .firstname(userDto.getFirstname())
                .lastname(userDto.getLastname())
                .imageUrl(userDto.getImageUrl())
                .email(userDto.getEmail())
                .phone(userDto.getPhone())
                .credential(
                        Credential.builder()
                                .credentialid(userDto.getCredentialdto().getCredentialid())
                                .username(userDto.getCredentialdto().getUsername())
                                .password(userDto.getCredentialdto().getPassword())
                                .roleBasedAuthority(userDto.getCredentialdto().getRoleBasedAuthority())
                                .isEnabled(userDto.getCredentialdto().isEnabled())
                                .isAcccountNonExpiered(userDto.getCredentialdto().isAcccountNonExpiered())
                                .isAccountNonLocked(userDto.getCredentialdto().isAccountNonLocked())
                                .isCredentialsNonExpiered(userDto.getCredentialdto().isCredentialsNonExpiered())
                                .build())
                .build();
    }

}
