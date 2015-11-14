package com.water.model.enums;

public enum UserRole {

    ROLE_CLIENT,
    ROLE_PROVIDER;

    public static UserRole getUserRole(Integer ordinal) {
        for (UserRole r : values()) {
            if (r.ordinal() == ordinal) {
                return r;
            }
        }
        return null;
    }

}
