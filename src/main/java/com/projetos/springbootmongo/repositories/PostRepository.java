package com.projetos.springbootmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projetos.springbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
