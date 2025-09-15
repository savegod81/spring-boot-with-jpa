package com.example.dto;

import com.example.entity.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * Author Yandong
 *
 * @Date 2025-09-15
 */
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    @Mapping(target = "name", source = "userName")
    Users toUser(UserDTO userDTO);

    UserDTO toUserDTO(Users users);

    void updateUserFromDto(UserDTO userDTO, @MappingTarget Users users);
}
