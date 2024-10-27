package org.martin.example.infrastructure.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserDbModel {

    @Id
    public long id;

    @Column(name = "name")
    public String name;
}
