package com.user.management.models;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {

    private String idUser;
    private String firstName;
    private String lastName;
}