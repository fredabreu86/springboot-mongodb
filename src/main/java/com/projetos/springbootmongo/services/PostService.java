package com.projetos.springbootmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetos.springbootmongo.domain.Post;
import com.projetos.springbootmongo.repositories.PostRepository;
import com.projetos.springbootmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;	
	
	public Post findById(String id) {
		
		return repository.findById(id)
	            .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		
	}
}
