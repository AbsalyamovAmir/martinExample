package org.martin.example.domain.entity;

import lombok.Getter;

@Getter
public class User {

    private final long id;
    private final String name;

    private User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static User create(long id, String name) {
        return new User(id, name);
    }
}
