package com.projetos.springbootmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetos.springbootmongo.domain.User;
import com.projetos.springbootmongo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		User u1 = new User(null, "Maria Brown", "maria@gmail.com");
//		User u2 = new User(null, "Alex Green", "alex@gmail.com");
//		
//		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
