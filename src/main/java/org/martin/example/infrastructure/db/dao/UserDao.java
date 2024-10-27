package org.martin.example.infrastructure.db.dao;

import org.martin.example.domain.entity.User;
import org.martin.example.infrastructure.db.model.UserDbModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserDbModel, Long> {

}
