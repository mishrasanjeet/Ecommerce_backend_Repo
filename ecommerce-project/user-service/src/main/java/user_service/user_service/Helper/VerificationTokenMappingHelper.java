package user_service.user_service.Helper;

import user_service.user_service.Dto.CredentialDto;
import user_service.user_service.Dto.VerificationtokenDto;
import user_service.user_service.Entity.Credential;
import user_service.user_service.Entity.Verificationtoken;

public interface VerificationTokenMappingHelper {

    public static VerificationtokenDto map(final Verificationtoken verificationToken) {
        return VerificationtokenDto.builder()
                .verificationtokenid(verificationToken.getVerificationtokenid())
                .token(verificationToken.getToken())
                .expiredate(verificationToken.getExpiredate())
                .credentialdto(
                        CredentialDto.builder()
                                .credentialid(verificationToken.getCredential().getCredentialid())
                                .username(verificationToken.getCredential().getUsername())
                                .password(verificationToken.getCredential().getPassword())
                                .roleBasedAuthority(verificationToken.getCredential().getRoleBasedAuthority())
                                .isEnabled(verificationToken.getCredential().isEnabled())
                                .isAcccountNonExpiered(verificationToken.getCredential().isAcccountNonExpiered())
                                .isAccountNonLocked(verificationToken.getCredential().isAccountNonLocked())
                                .isCredentialsNonExpiered(verificationToken.getCredential().isCredentialsNonExpiered())
                                .build())
                .build();

    }

    public static Verificationtoken map(final VerificationtokenDto verificationTokenDto) {
        return Verificationtoken.builder()
                .verificationtokenid(verificationTokenDto.getVerificationtokenid())
                .token(verificationTokenDto.getToken())
                .expiredate(verificationTokenDto.getExpiredate())
                .credential(
                        Credential.builder()
                                .credentialid(verificationTokenDto.getCredentialdto().getCredentialid())
                                .username(verificationTokenDto.getCredentialdto().getUsername())
                                .password(verificationTokenDto.getCredentialdto().getPassword())
                                .roleBasedAuthority(verificationTokenDto.getCredentialdto().getRoleBasedAuthority())
                                .isEnabled(verificationTokenDto.getCredentialdto().isEnabled())
                                .isAcccountNonExpiered(verificationTokenDto.getCredentialdto().isAcccountNonExpiered())
                                .isAccountNonLocked(verificationTokenDto.getCredentialdto().isAccountNonLocked())
                                .isCredentialsNonExpiered(verificationTokenDto.getCredentialdto().isCredentialsNonExpiered())
                                .build())
                .build();
    }
}
