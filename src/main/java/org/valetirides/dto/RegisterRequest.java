package org.valetirides.dto;

import java.util.Objects;

public final class RegisterRequest {
    private final String name;
    private final String email;
    private final String password;
    private final String role;

    public RegisterRequest(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    public String role() {
        return role;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (RegisterRequest) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.password, that.password) &&
                Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password, role);
    }

    @Override
    public String toString() {
        return "RegisterRequest[" +
                "name=" + name + ", " +
                "email=" + email + ", " +
                "password=" + password + ", " +
                "role=" + role + ']';
    }
}



//A DTO is a simple object used to transfer data between different parts of an application — like between:
//Controller ↔ Service
//Service ↔ Client (e.g., frontend)
//API ↔ Database
//It contains only data — no business logic.
//They automatically generate constructors, getters, equals(), hashCode(), and toString() methods, making them ideal for clean, read-only DTOs.

//📦 Why use DTOs?
//Avoid exposing internal Entity classes (like JPA entities)
//Customize data sent to/from clients
//Separate concerns: database logic vs user-facing data