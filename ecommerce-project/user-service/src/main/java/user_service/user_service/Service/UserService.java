package user_service.user_service.Service;

import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import user_service.user_service.Dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto>  findAll();
    UserDto findByID(final Integer userid);
    UserDto save(final UserDto userDto);
    UserDto update(final UserDto userDto);
    UserDto update(final Integer userid,UserDto userDto);
    void deleteByID(final Integer userid);
    UserDto findByUsername(final String username);
}
