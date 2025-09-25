package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping("/users")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        for (User u : users) {
            if (u.getEmail().equalsIgnoreCase(user.getEmail())) {
                return ResponseEntity.badRequest().body(new ErrorResponse("El email ya está registrado."));
            }
        }
        users.add(user);
        return ResponseEntity.ok(new MessageResponse("Usuario registrado exitosamente."));
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }

    static class MessageResponse {
        private String message;
        public MessageResponse(String message) { this.message = message; }
        public String getMessage() { return message; }
    }
    static class ErrorResponse {
        private String error;
        public ErrorResponse(String error) { this.error = error; }
        public String getError() { return error; }
    }
}
