package com.commons.project.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * 用户POJO
 */
@Entity
public class User extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(nullable = false,unique = true,name = "username")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
