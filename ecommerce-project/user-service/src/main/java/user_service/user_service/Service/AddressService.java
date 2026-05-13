package user_service.user_service.Service;

import user_service.user_service.Dto.AddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAll();
    AddressDto findByID(final Integer addressid);
    AddressDto save(final AddressDto addressDto);
    AddressDto update(final AddressDto addressDto );
    AddressDto update(final  Integer addressid,AddressDto addressDto);
    void deleteByID(final Integer addressid);
}
