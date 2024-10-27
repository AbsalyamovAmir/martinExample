package org.martin.example.infrastructure.web.controller;

import org.martin.example.application.usecase.RequestCreateUser;
import org.martin.example.infrastructure.web.dto.DtoCreateUser;
import org.martin.example.infrastructure.web.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/")
public class UserController {

    private final UserMapper userMapper;
    private final RequestCreateUser requestCreateUser;

    public UserController(UserMapper userMapper, RequestCreateUser requestCreateUser) {
        this.userMapper = userMapper;
        this.requestCreateUser = requestCreateUser;
    }

    @PostMapping(path = "create")
    public void create(@RequestBody DtoCreateUser dtoCreateUser) {
        var data = userMapper.fromDtoToUserRequestData(dtoCreateUser);
        requestCreateUser.create(data);
    }
}
