package user_service.user_service.Helper;

import user_service.user_service.Dto.AddressDto;
import user_service.user_service.Dto.UserDto;
import user_service.user_service.Entity.Address;
import user_service.user_service.Entity.User;

public interface AddressHelperMapping {

    public static AddressDto map(final Address address){
        return  AddressDto.builder()
                .addressId(address.getAddressid())
                .fullAddress(address.getFulladdress())
                .city(address.getCity())
                .userDto(
                        UserDto.builder().userid(address.getUser().getUserid())
                                .firstname(address.getUser().getFirstname())
                                .lastname(address.getUser().getLastname())
                                .phone(address.getUser().getPhone())
                                .imageUrl(address.getUser().getImageUrl()).build()
                )
                .build();



    }

    public static Address map(final AddressDto addressDto){
        return  Address.builder()
                .addressid(addressDto.getAddressId())
                .fulladdress(addressDto.getFullAddress())
                .city(addressDto.getCity())
                .user
                        (User.builder().userid(addressDto.getUserDto().getUserid())
                                .firstname(addressDto.getUserDto().getFirstname())
                                .lastname(addressDto.getUserDto().getLastname())
                                .phone(addressDto.getUserDto().getPhone())
                                .imageUrl(addressDto.getUserDto().getImageUrl()).build())

                .build();



    }
}
