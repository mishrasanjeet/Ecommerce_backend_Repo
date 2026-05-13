package user_service.user_service.Helper;

import user_service.user_service.Dto.CredentialDto;
import user_service.user_service.Dto.UserDto;
import user_service.user_service.Entity.Credential;
import user_service.user_service.Entity.User;

public interface CredentialMappingHelper {

    public static CredentialDto map(final Credential credential) {
        return CredentialDto.builder()
                .credentialid(credential.getCredentialid())
                .username(credential.getUsername())
                .password(credential.getPassword())
                .roleBasedAuthority(credential.getRoleBasedAuthority())
                .isEnabled(credential.isEnabled())
                .isAcccountNonExpiered(credential.isAcccountNonExpiered())
                .isAccountNonLocked(credential.isAccountNonLocked())
                .isCredentialsNonExpiered(credential.isCredentialsNonExpiered())
                .userdto(
                        UserDto.builder()
                                .userid(credential.getUser().getUserid())
                                .firstname(credential.getUser().getFirstname())
                                .lastname(credential.getUser().getLastname())
                                .imageUrl(credential.getUser().getImageUrl())
                                .email(credential.getUser().getEmail())
                                .phone(credential.getUser().getPhone())
                                .build())
                .build();
    }


    public static Credential map(final CredentialDto credentialDto) {
        return Credential.builder()
                .credentialid(credentialDto.getCredentialid())
                .username(credentialDto.getUsername())
                .password(credentialDto.getPassword())
                .roleBasedAuthority(credentialDto.getRoleBasedAuthority())
                .isEnabled(credentialDto.isEnabled())
                .isAcccountNonExpiered(credentialDto.isAcccountNonExpiered())
                .isAccountNonLocked(credentialDto.isAccountNonLocked())
                .isCredentialsNonExpiered(credentialDto.isCredentialsNonExpiered())
                .user(
                        User.builder()
                                .userid(credentialDto.getUserdto().getUserid())
                                .firstname(credentialDto.getUserdto().getFirstname())
                                .lastname(credentialDto.getUserdto().getLastname())
                                .imageUrl(credentialDto.getUserdto().getImageUrl())
                                .email(credentialDto.getUserdto().getEmail())
                                .phone(credentialDto.getUserdto().getPhone())
                                .build())
                .build();
    }

}
