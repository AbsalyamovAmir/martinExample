package org.martin.example.application.usecase;

import org.martin.example.domain.entity.User;

import java.util.List;

public interface RequestGetUsers {

    List<User> getAllUsers();
}
