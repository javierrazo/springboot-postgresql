package com.uabc.database.example.examplejpa.model;

import lombok.Data;

import java.util.Set;

@Data
public class UserModel {
    private String username;
    private String password;
    private boolean enabled;
    private Set<UserRoleModel> userRolesModels;

    public UserModel(){

    }

    public UserModel(String username, String password, boolean enabled, Set<UserRoleModel> userRolesModels) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.userRolesModels = userRolesModels;
    }
}
