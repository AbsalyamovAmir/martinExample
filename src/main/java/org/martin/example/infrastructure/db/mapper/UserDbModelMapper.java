package org.martin.example.infrastructure.db.mapper;

import org.martin.example.domain.entity.User;
import org.martin.example.infrastructure.db.model.UserDbModel;
import org.springframework.stereotype.Component;

@Component
public class UserDbModelMapper {

    private final UserDbModelMapper userDbModelMapper;

    public UserDbModelMapper(UserDbModelMapper userDbModelMapper) {
        this.userDbModelMapper = userDbModelMapper;
    }

    public UserDbModel toModel(User user) {
        var model = new UserDbModel();

        model.setId(user.getId());
        model.setName(user.getName());

        return model;
    }

    public User toEntity(UserDbModel userModel) {
        var user = userDbModelMapper.toEntity(userModel);

        return User.create(user.getId(), user.getName());
    }
}
