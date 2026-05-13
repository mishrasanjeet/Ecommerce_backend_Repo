package user_service.user_service.Service;

import user_service.user_service.Dto.VerificationtokenDto;

import java.util.List;

public interface VerificationTokenService {

    List<VerificationtokenDto> findAll();
    VerificationtokenDto findById(final Integer verificationTokenId);
    VerificationtokenDto save(final VerificationtokenDto verificationTokenDto);
    VerificationtokenDto update(final VerificationtokenDto verificationTokenDto);
    VerificationtokenDto update(final Integer verificationTokenId, final VerificationtokenDto verificationTokenDto);
    void deleteById(final Integer verificationTokenId);
}
