package user_service.user_service.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum RoleBasedAuthority {
    ROLE_USER("User"),
    ROLE_ADMIN("Admin");

    private final String role;   // ✅ must be final
}
