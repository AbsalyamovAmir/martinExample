package org.martin.example.application.usecase.impl;

import org.martin.example.application.model.UserRequestData;
import org.martin.example.application.port.UserGateway;
import org.martin.example.application.usecase.RequestCreateUser;
import org.martin.example.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class RequestCreateUserImpl implements RequestCreateUser {

    private final UserGateway userGateway;

    public RequestCreateUserImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void create(UserRequestData userRequestData) {
        User user = User.create(userRequestData.getId(), userRequestData.getName());
        userGateway.save(user);
    }
}
