package org.martin.example.application.port;

import org.martin.example.domain.entity.User;

import java.util.List;

public interface UserGateway {

    void save(User user);

    List<User> findAll();
}
