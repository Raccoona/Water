package com.water.model.enums;

public enum UserRole {

    ROLE_CLIENT("Client"),
    ROLE_PROVIDER("Provider");

    private final String name;

    private UserRole(String name) {
        this.name = name;
    }

    public static String getName(UserRole userRole) {
        return userRole.name;
    }

    public static UserRole getUserRole(Integer ordinal) {
        for (UserRole r : values()) {
            if (r.ordinal() == ordinal) {
                return r;
            }
        }
        return null;
    }

}
