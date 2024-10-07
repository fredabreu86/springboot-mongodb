package com.projetos.springbootmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.springbootmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User fred = new User("1", "Fred", "fredabreu@gmail.com");
		User lud = new User("2", "Lud", "fredabreu@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(fred, lud));
		return ResponseEntity.ok().body(list);
	}
}
