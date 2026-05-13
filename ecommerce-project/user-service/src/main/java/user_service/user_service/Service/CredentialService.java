package user_service.user_service.Service;

import user_service.user_service.Dto.CredentialDto;

import java.util.List;

public interface CredentialService {

    List<CredentialDto> findAll();
    CredentialDto findById(final Integer credentialId);
    CredentialDto save(final CredentialDto credentialDto);
    CredentialDto update(final CredentialDto credentialDto);
    CredentialDto update(final Integer credentialId, final CredentialDto credentialDto);
    void deleteById(final Integer credentialId);
    CredentialDto findByUsername(final String username);
}
