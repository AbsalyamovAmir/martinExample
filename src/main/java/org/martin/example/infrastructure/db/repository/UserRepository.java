package org.martin.example.infrastructure.db.repository;

import org.martin.example.application.port.UserGateway;
import org.martin.example.domain.entity.User;
import org.martin.example.infrastructure.db.dao.UserDao;
import org.martin.example.infrastructure.db.mapper.UserDbModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements UserGateway {

    private final UserDbModelMapper userDbModelMapper;
    private final UserDao userDao;

    public UserRepository(UserDbModelMapper userDbModelMapper, UserDao userDao) {
        this.userDbModelMapper = userDbModelMapper;
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        var model = userDbModelMapper.toModel(user);
        userDao.save(model);
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        userDao.findAll().forEach(user -> users.add(userDbModelMapper.toEntity(user)));
        return users;
    }
}
