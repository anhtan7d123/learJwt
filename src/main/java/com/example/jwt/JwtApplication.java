package com.example.jwt;

import com.example.jwt.domain.Role;
import com.example.jwt.domain.User;
import com.example.jwt.repository.UserRepository;
import com.example.jwt.service.UserServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtApplication {
	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}


//	@Bean
//	CommandLineRunner commandLineRunner(UserServiceImp userServiceImp){
//		return args -> {
//			userServiceImp.saveRole(new Role(null, "ROLE_USER", new ArrayList<>()));`
//			userServiceImp.saveRole(new Role(null, "ROLE_ADMIN", new ArrayList<>()));
//
//			userServiceImp.saveUser(new User(null,"admin", "admin", new ArrayList<>()));
//
//			userServiceImp.addRolToUser("admin", "ROLE_ADMIN");
//			userServiceImp.addRolToUser("admin", "ROLE_USER");
//		};
//	}
}
