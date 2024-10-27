package org.martin.example.infrastructure.web.mapper;

import org.mapstruct.Mapper;
import org.martin.example.application.model.UserRequestData;
import org.martin.example.infrastructure.web.dto.DtoCreateUser;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserRequestData fromDtoToUserRequestData(DtoCreateUser dtoCreateUser);
}
