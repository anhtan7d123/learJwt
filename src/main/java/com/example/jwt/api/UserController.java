package com.example.jwt.api;

import com.example.jwt.domain.Role;
import com.example.jwt.domain.User;
import com.example.jwt.repository.RoleRepository;
import com.example.jwt.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final RoleRepository roleRepository;

    @GetMapping("/user/get-all-user")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user/create-user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.created(null).body(userService.saveUser(user));
    }

    @PostMapping("/role/create-role")
    public ResponseEntity<Role> createRole(@RequestBody Role role){
        return ResponseEntity.created(null).body(userService.saveRole(role));
    }

    @PostMapping("/role/add-to-user")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form){
        userService.addRolToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

}

@Data class RoleToUserForm{
    private String username;
    private String roleName;
}
