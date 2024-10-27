package org.martin.example.application.usecase.impl;

import org.martin.example.application.port.UserGateway;
import org.martin.example.application.usecase.RequestGetUsers;
import org.martin.example.domain.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestGetUsersImpl implements RequestGetUsers {

    private final UserGateway userGateway;

    public RequestGetUsersImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public List<User> getAllUsers() {
        return userGateway.findAll();
    }
}
